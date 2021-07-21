package com.spring.example.myfirstdemo.controller;

import com.spring.example.myfirstdemo.domain.details;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;
@RestController
public class MyuserController {

    @GetMapping("/hellodevops")
    public String getNames() {
        return ( "Welcome to Dockers and K8S, Jenkins ");
    }

    @GetMapping("/hellopgdevopsfolks")
    public String getKanha() {
        return ( "Welcome to pg devops folks");
    }

    @GetMapping("/getteamdetails")
    public List<details> getKanhaDetails() {
        List<details> kanhadetails = new ArrayList<>();
         details d1 = new details( "Venkata" , "Devops");
         details d2 = new details( "Vignesh" , "Devops");
         details d3 = new details( "Abhijith" , "Devops");
        details d4 = new details( "Vivek" , "Devops");
         kanhadetails.add(d1);
         kanhadetails.add(d2);
         return kanhadetails;

    }

}
