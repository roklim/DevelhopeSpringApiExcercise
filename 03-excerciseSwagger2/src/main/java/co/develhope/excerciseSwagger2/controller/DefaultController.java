package co.develhope.excerciseSwagger2.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    public String defaultMessage(){
        return "visit http://localhost:5050/swagger-ui/ for API info";
    }
}
