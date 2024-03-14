package com.t2m.g2nee.delivery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {
    @GetMapping("/test-rest-controller")
    public String test() {
        return "hello!";
    }
}