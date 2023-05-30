package org.skillgrowth.oauth2practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "Hello, home!";
    }

    @GetMapping("/secured")
    public String secured(){
        return "Hello, secured!";
    }
}
