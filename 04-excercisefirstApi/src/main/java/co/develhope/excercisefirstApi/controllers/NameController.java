package co.develhope.excercisefirstApi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class NameController {
    @GetMapping("")
    public String myName(){
        return "Marco power";
    }
    @PostMapping("")
    public String reverseName(){
        return new StringBuilder().append(myName()).reverse().toString();
    }
}
