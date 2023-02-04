package com.example.springrestapi.controller;

import com.example.springrestapi.model.HelloModel;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRestController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello From BridgeLabz!!!";
    }

    @GetMapping("/query")
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello " + name + "!";
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    @PostMapping("/post")
    public String sayHello(@RequestBody HelloModel helloModel) {
        return "Hello " + helloModel.getFirstName() + " " + helloModel.getLastName() + "!";
    }

    @PutMapping("/put/{firstName}") //PUT http://localhost:8080/put/Bharat?lastName=Gharde
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
        return "Hello " + firstName + " " + lastName + "!";
    }
}