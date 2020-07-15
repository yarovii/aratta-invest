package eu.cz.yarovii.arrattainvest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/order", method = RequestMethod.GET)
public class OrderController {

    @GetMapping
    public String orderPage(){
        return "order_main";
    }

    @PostMapping("/validate_round")
    public String validateRoundOrder(){
        return "order_main";
    }

    @PostMapping("/validate_rect")
    public String validateRectOrder(){
        return "order_main";
    }
}
