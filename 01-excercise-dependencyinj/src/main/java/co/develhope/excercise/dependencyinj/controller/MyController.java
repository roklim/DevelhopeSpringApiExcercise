package co.develhope.excercise.dependencyinj.controller;

import co.develhope.excercise.dependencyinj.component.MyComponent;
import co.develhope.excercise.dependencyinj.service.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    private MyService service;

    public MyController(MyService service) {
        System.out.println("MyController construc called");
        this.service = service;
    }

    @GetMapping
    public String helloMsg(){
        return "Hello,  bot!";
    }

    @GetMapping("/getName")
    public String getName(){
        return service.getName();
    }

}
