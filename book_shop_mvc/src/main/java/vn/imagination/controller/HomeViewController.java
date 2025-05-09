package vn.imagination.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeViewController {
    @RequestMapping("/home")
    public String displayData() {
        return "home";
    }
}
