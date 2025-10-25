package com.example.ArtConnect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.ArtConnect.model.User;
import com.example.ArtConnect.repository.UserRepository;

@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    // show login page
    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    // show register page
    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }

    // handle registration
    @PostMapping("/register")
    public String register(@RequestParam String username,
                           @RequestParam String password,
                           Model model) {
        if (userRepository.findByUsername(username) != null) {
            model.addAttribute("error", "Username already exists!");
            return "register";
        }

        User user = new User(username, password, "user");
        userRepository.save(user);
        return "redirect:/login";
    }

    // handle login
    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        Model model) {

        User user = userRepository.findByUsername(username);

        if (user != null && user.getPassword().equals(password)) {
            model.addAttribute("username", user.getUsername());
            return "redirect:/gallery";
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "login";
        }
    }
    
    
}