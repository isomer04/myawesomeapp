package com.isomer.springboot.demp.myawesomeapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }


    // expose a new endpoint for workout

    @GetMapping("/workout")
    public String getDailyWorkOut() {
        return "Run 10 k workout";
    }
}
