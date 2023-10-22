package com.isomer.springboot.demp.myawesomeapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    private Coach myCoach;

//    @Autowired
//    public void setMyCoach(@Qualifier("baseBallCoach") Coach coach){
//        myCoach = coach;
//    }

    @Autowired
    public void setMyCoach(Coach coach){
        myCoach = coach;
    }

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
