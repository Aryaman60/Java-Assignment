package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.signup;
import com.example.demo.service.SignupService;

@Controller
public class HomeController {

    @Autowired
    private SignupService signupService;

    @GetMapping("/signupForm")
    public String showSignupForm(Model model) {
        model.addAttribute("signup", new signup());
        return "index";
    }

    @PostMapping("/signup")
    public String saveSignup(@ModelAttribute("signup") signup signup, Model model) {
        if (signup.getPassword().equals(signup.getConfirmPassword())) {
            signupService.saveSignup(signup);
            return "redirect:/loginpage";
        } else {
            model.addAttribute("error", "Password and Confirm Password do not match.");
            return "redirect:/index";
        }
    }

    @GetMapping("/signupSuccess")
    public String signupSuccess() {
        return "signupSuccess";
    }

    @GetMapping("/loginpage")
    public String showlogin() {
        return "loginpage";
    }

}
