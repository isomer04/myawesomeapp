package com.isomer.springboot.demp.myawesomeapp.rest;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BaseBallCoach implements  Coach{

    @Override
    public String getDailyWorkout() {
        return "The baseball coach works out 10 times a day with his players";
    }
}
