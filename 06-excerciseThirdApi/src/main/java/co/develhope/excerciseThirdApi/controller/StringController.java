package co.develhope.excerciseThirdApi.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/strings")
public class StringController {

    @GetMapping("")
    public String concatenate(@RequestParam String a,  String b){
       if(b == null) return a;
       else return a+b;
    }
}
