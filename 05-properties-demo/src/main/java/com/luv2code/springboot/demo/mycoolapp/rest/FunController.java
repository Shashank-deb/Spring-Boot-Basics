package com.luv2code.springboot.demo.mycoolapp.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunController {

    //inject properties for : coach.name and team.name
    @Value("${coach.name}")
    private String coachName;


    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach: "+coachName+", Team Name: "+teamName;
    }

    @Value("${team.name}")
    private String teamName;



    // expose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello() {
        return "Hello World! Time on server is " + LocalDateTime.now();
    }

    // expose new endpoint for /workout

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day.";
    }


}
