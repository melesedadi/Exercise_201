package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/loadform2")
    public String loadFormPage(){
        return "formtemplate";
    }
    @RequestMapping("/processform2")
    public String loadFormPage(@RequestParam("login") String login, Model model){
        model.addAttribute("loginval", login);
        return "confirm2";
    }
}
