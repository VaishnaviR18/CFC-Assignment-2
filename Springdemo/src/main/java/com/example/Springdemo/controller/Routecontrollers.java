package com.example.Springdemo.controller;

import com.example.Springdemo.models.Human;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Routecontrollers {

    List<Human> human = new ArrayList<>();

    @GetMapping("/")
    public List<Human> getInfo(){
        return human;
    }

    @PostMapping("/user")
    public void postInfo(@Validated @RequestBody Human humans){
        this.human.add(humans);
    }

}
