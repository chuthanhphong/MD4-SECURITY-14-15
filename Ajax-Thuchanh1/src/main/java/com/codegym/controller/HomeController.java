package com.codegym.controller;

import org.hibernate.tool.schema.internal.exec.GenerationTarget;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
        public String showIndex(){
        return "/index";
    }
}
