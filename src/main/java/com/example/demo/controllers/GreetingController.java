//package com.example.servingwebcontent;

package com.example.demo.controllers;

//package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GreetingController {
    @GetMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("name", "Hello greeting is Well");
        return "greeting";
    }
    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("name", "Hello about");
        return "about";

    }
}