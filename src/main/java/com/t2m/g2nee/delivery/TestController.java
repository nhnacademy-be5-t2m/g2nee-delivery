package com.t2m.g2nee.delivery;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/test-controller")
    public String Test(){
        return "index";
    }
}
