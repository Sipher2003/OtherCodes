package com.example.loginapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    // Show the login form
    @GetMapping("/login")
    public String showLoginPage() {
        return "LoginPage"; // Maps to LoginPage.jsp
    }

    // Handle login form submission
    @PostMapping("/login")
    public String handleLogin(@RequestParam("username") String username,
                              @RequestParam("password") String password,
                              Model model) {
        String validUsername = "user@programmingempire.com";
        String validPassword = "programmingempire@abcd123";

        if (validUsername.equals(username) && validPassword.equals(password)) {
            return "HomePage"; // Maps to HomePage.jsp
        } else {
            model.addAttribute("error", "Invalid credentials! Please try again.");
            return "ErrorPage"; // Maps to ErrorPage.jsp
        }
    }
}
