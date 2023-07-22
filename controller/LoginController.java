package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.LoginService;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/loginpage")
    public ModelAndView processLogin(@RequestParam String email, @RequestParam String password) {
        boolean isValidLogin = loginService.isValidLogin(email, password);

        if (isValidLogin) {
            return new ModelAndView("redirect:/dashboard");
        } else {
            // Add an error message to the model and return to the login page
            return new ModelAndView("loginpage", "error", "Invalid email or password");
        }
    }
}
