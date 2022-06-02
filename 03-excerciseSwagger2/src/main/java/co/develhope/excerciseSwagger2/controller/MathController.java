package co.develhope.excerciseSwagger2.controller;

import co.develhope.excerciseSwagger2.entities.AritmeticOperation;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping(value = "")
    @ApiOperation(value = "welkome message", notes = "This is the print of welkome message")
    public String welcomeMessage() {
        return "Welkomee!!!";
    }

    @GetMapping(value = "division-info")
    @ApiOperation(value = "division message", notes = "This is the print of division message")
    public AritmeticOperation division() {
        String[] proprieties = {"cane", "gatto"};
        return new AritmeticOperation("division", 0, "This is division", proprieties);
    }

    @GetMapping(value = "multiplication-info")
    @ApiOperation(value = "multiplication message", notes = "This is the print of division message")
    public int multiplication(@ApiParam(value = "a first num, b first num")@RequestParam(required = true) int a, int b) {
        int mult = a * b;
        return mult;
    }

    @GetMapping(value = "square/{n}")
    @ApiOperation(value = "squirtle", notes = "This is the print of squirtle")
    public int multiplication(@ApiParam(value = "a*a") @RequestParam int a) {
        int square = a * a;
        return square;
    }
}

