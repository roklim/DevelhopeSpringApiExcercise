package co.develhope.excerciseSwagger.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
    public String defaultMessage(){
        return "visit http://localhost:1234/swagger-ui/ for API info";
    }
}
