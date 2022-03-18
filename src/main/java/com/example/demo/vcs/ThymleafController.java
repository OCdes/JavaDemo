package com.example.demo.vcs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/thymleaf")
public class ThymleafController {
    @RequestMapping("/test404")
    public String test404() {
        return "index";
    }

    @RequestMapping("/test500")
    public String test500() {
        int i = 1/0;
        return "index";
    }
}
