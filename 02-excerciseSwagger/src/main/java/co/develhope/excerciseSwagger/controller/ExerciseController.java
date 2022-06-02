package co.develhope.excerciseSwagger.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercise")
public class ExerciseController {
    @GetMapping(value = "")
    @ApiOperation(value = "Excercise-controller",notes = "This is the print of excercise controller")
    public String sayHello(){
        return "My name is Marco";
    }
}
