package vn.imagination.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ByeController {
    @RequestMapping("/bye")
    public String sayBye() {
        return "bye"; //--> ten file JSP se ten la bye
    }
}
