package com.example.demo.vcs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/thymleaf")
public class BloggerController {
    @RequestMapping("/getBlogger")
    public String getBlogger(Model model) {
        Blogger blogger = new Blogger(145L,"张伟","765894236");
        model.addAttribute("blogger",blogger);
        return "blogger";
    }
    @RequestMapping("/getBloggers")
    public String getBoggers(Model model) {
        Blogger blogger = new Blogger(145L,"张伟","765894236");
        Blogger blogger2 = new Blogger(154L,"张立","9556465556");
        List<Blogger> list = new ArrayList<>();
        list.add(blogger);
        list.add(blogger2);
        model.addAttribute("bloggers",list);
        return "bloggers";



    }
}
