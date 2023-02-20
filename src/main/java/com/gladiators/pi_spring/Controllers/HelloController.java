package com.gladiators.pi_spring.Controllers;


import org.springframework.web.bind.annotation.*;

@RestController


public class HelloController {

    @GetMapping("/hello/{name}")

    public String hello(@PathVariable("name") String name) {
        String X = "Hello" + " " + name;
        return X;
    }

    @PostMapping("/hello")
    @ResponseBody
    public String hello2(@RequestBody String name){
        String X ="Hello"+" "+name;
        return X;
    }




}