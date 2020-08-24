package com.dimitrovski.teo.anms.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api")
public class SimpleRestController {

    @GetMapping("/hello")
    public String getString() {
        return "Hello world!";
    }

}
