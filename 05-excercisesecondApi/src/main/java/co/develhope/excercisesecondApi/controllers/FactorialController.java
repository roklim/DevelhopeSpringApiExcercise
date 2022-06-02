package co.develhope.excercisesecondApi.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/factorial")
public class FactorialController {

    @GetMapping("cane/{n}")
    public int calculateFactorial(@PathVariable int n) {
        int factorial = n;
        for (int i = 1; i < n; i++) {
            System.out.println(i);
            factorial *= i;

        }
return factorial;
    }
}
