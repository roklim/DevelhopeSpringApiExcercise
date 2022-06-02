package co.develhope.excercisefiveApi.controller;

import co.develhope.excercisefiveApi.DTO.CarDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RestController
@RequestMapping("cars")
public class CarController {

    @GetMapping(value ="")
    public CarDTO newCar(){
        return new CarDTO("1","ferrari",78);
    }

    @PostMapping(value ="")
    public String postRoute(@Valid @RequestBody CarDTO car, HttpServletResponse response){
        return car.toString() ;
    }
}
