package com.pashashyla.myfirstappmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(){
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodByePage(){
        return "first/goodbye";
    }

    @GetMapping("/calculator")
    public String calculator(@RequestParam("a") int a, @RequestParam("b") int b,
                             @RequestParam("operation") String operation, Model model){
        double result;
        switch (operation) {
            case "multiply":
                result = a * b;
                break;
                case "divide":
                result = a / (double) b;
                break;
            case "add":
                result = a + b;
                break;
            case "subtract":
                result = a - b;
                break;
            default:
                result = 0.0;
                break;
        }

        model.addAttribute("result", result);



        return "first/calculator";
    }
}
