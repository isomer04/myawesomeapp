package com.isomer.springboot.demp.myawesomeapp.rest;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Tennis Coach works out 2 times a day";
    }
}
