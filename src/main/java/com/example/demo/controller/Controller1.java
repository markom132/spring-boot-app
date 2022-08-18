package com.example.demo.controller;

import com.example.demo.service.ServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller1 {
    @Autowired
    ServiceClass serviceClass;

    @PostMapping("/testString")
    public String getBalloons(@RequestParam("string") String string, Model model){
        String str = "We find " + serviceClass.call(string) + " balloons in string";
        model.addAttribute("str",str);

        return "home";

    }


    @GetMapping("/")
    public String home() {
        return "home";
    }
}
