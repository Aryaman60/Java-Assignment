package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping("/dashboard")
    public String showDashboard() {
        return "dashboard"; // Return the name of your dashboard HTML template (e.g., "dashboard.html")
    }

    // Add other methods as needed for handling dashboard-related functionality
}
