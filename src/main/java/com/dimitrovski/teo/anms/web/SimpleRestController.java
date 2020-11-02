package com.dimitrovski.teo.anms.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api")
public class SimpleRestController {

    @GetMapping("/hello")
    public String getString() {
        return "Hello world, have a nice day!";
    }

    @GetMapping("new")
    public String getNewSting() {
        return "New string!";
    }

    @GetMapping("point")
    public String getChanges()
    {
        return "commit changes";
    }
    @GetMapping("final")
    public String getReload()
    {
        return "systemctl restart works perfecty fineee!";
    }
    @GetMapping("press")
    public String lastJob()
    {
        return "jobsss";
    }
}
