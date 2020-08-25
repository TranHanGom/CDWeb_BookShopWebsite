package com.cnpm.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String root() {
        return "index";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }
    @RequestMapping("/room")
    public String room() {
        return "room";
    }

    @GetMapping("/user")
    public String userIndex() {
        return "user/index";
    }
}
