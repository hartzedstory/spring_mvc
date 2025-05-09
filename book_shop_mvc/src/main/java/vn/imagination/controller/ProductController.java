package vn.imagination.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
    @RequestMapping("/production-detail")
    public String productionDetail() {
        return "production-detail";
    }
}
