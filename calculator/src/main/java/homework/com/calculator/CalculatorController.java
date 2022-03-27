package homework.com.calculator;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/calculator")
    public double calculator(@RequestParam(value = "a") double a, @RequestParam(value = "b") double b,
                                        @RequestParam(value = "operator") String operator) {

        Calculator res = new Calculator(a, b, operator);
        return res.calc(); 
    }
}
