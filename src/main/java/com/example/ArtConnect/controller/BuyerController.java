package com.example.ArtConnect.controller;





import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.ArtConnect.model.Artwork;
import com.example.ArtConnect.model.Order;
import com.example.ArtConnect.service.ArtworkService;
import com.example.ArtConnect.service.OrderService;
 
@Controller
public class BuyerController {

    private final ArtworkService artworkService;
    private final OrderService orderService;

    public BuyerController(ArtworkService artworkService, OrderService orderService) {
        this.artworkService = artworkService;
        this.orderService = orderService;
    }
    @GetMapping("/buyer-dashboard")
    public String buyerDashboard(Model model) {
        List<Artwork> artworks = artworkService.getAll();
        List<Order> orders = orderService.getOrdersByBuyer("buyer1"); // adjust buyer

        // Create a map for fast lookup in Thymeleaf
        Map<String, String> artworkTitles = new HashMap<>();
        Map<String, Double> artworkPrices = new HashMap<>();
        for (Artwork a : artworks) {
            artworkTitles.put(a.getId(), a.getTitle());
            artworkPrices.put(a.getId(), a.getPrice());
        }

        model.addAttribute("artworks", artworks);
        model.addAttribute("orders", orders);
        model.addAttribute("artworkTitles", artworkTitles);
        model.addAttribute("artworkPrices", artworkPrices);

        return "buyer-dashboard";
    }

    @PostMapping("/buy/{artworkId}")
    public String buyArtwork(@PathVariable String artworkId) {
        orderService.createOrder(artworkId, "buyer1"); // placeholder for buyerId
        return "redirect:/buyer-dashboard";
    }
    @GetMapping("/artwork/details/{id}")
    public String artworkDetails(@PathVariable String id, Model model) {
        Artwork artwork = artworkService.getArtworkById(id);
        model.addAttribute("artwork", artwork);
        return "artwork-details"; // This must match the template name
    }

}
