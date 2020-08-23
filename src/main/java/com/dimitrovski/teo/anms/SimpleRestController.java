package com.dimitrovski.teo.anms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class SimpleRestController {

    @GetMapping("/hello")
    public String getString() {
        return "Hello world!";
    }

}
