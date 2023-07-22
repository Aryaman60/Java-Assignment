//package com.example.demo.controller;
//
//import com.example.demo.model.signup;
//import com.example.demo.service.SignupService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//
//@Controller
//public class signupcontroller {
//
//    private final SignupService signupService;
//
//    @Autowired
//    public signupcontroller(SignupService signupService) {
//        this.signupService = signupService;
//    }
//
//    @GetMapping("/signup")
//    public String showSignupForm(Model model) {
//        // Create an empty signup object to bind the form data
//        model.addAttribute("signup", new signup());
//        return "signup";
//    }
//
//    @PostMapping("/signup")
//    public String processSignupForm(signup signup) {
//        // Process the submitted form data (e.g., save the signup information to the database)
//        signupService.saveSignup(signup);
//        return "redirect:/success"; // Redirect to a success page after successful signup
//    }
//}
