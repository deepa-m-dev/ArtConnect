package com.example.ArtConnect.controller;


import java.io.IOException;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.ArtConnect.model.Artwork;
import com.example.ArtConnect.service.ArtworkService;
import com.example.ArtConnect.service.CloudinaryService;

@Controller
public class ArtworkController {

    private final ArtworkService artworkService;
    private final CloudinaryService cloudinaryService;

    public ArtworkController(ArtworkService artworkService, CloudinaryService cloudinaryService) {
        this.artworkService = artworkService;
        this.cloudinaryService = cloudinaryService;
    }

    @GetMapping("/gallery")
    public String gallery(Model model) {
        model.addAttribute("artworks", artworkService.getAll());
        return "gallery";
    }

    @GetMapping("/upload-artwork")
    public String uploadForm() {
        return "upload-artwork";
    }

    @PostMapping("/upload")
    public String uploadArtwork(@RequestParam("title") String title,
                                @RequestParam("description") String description,
                                @RequestParam("price") double price,
                                @RequestParam("tags") String tags,
                                @RequestParam("image") MultipartFile image) throws IOException {

        String imageUrl = cloudinaryService.uploadFile(image);
        Artwork artwork = new Artwork();
        artwork.setTitle(title);
        artwork.setDescription(description);
        artwork.setPrice(price);
        artwork.setTags(Arrays.asList(tags.split(",")));
        artwork.setImageUrl(imageUrl);
        artwork.setArtistId("artist1"); // placeholder, since no auth

        artworkService.save(artwork);
        return "redirect:/artist-dashboard";
    }

    @GetMapping("/artist-dashboard")
    public String artistDashboard(Model model) {
        model.addAttribute("artworks", artworkService.getAll());
        return "artist-dashboard";
    }
    @PostMapping("/artist-dashboard/delete/{artworkId}")
    public String deleteArtwork(@PathVariable String artworkId) {
        artworkService.deleteById(artworkId);
        return "redirect:/artist-dashboard";
    }
 
}
