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

import java.util.Arrays;
import java.util.Map;


@Controller
public class GreetingController {
    @GetMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("name", "Hello greeting is Well");
        return "greeting";
    }
    @GetMapping("/about")
    public String about(Model model) {



//        array = Arrays.asList(1, 2, 3);
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        model.addAttribute("arr",cars);
//                model.addAttribute("name", "Hello about");
//        template.set("attr", Arrays.asList(1, 2, 3));
        return "about";

    }
}