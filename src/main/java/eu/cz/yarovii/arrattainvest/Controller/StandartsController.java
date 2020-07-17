package eu.cz.yarovii.arrattainvest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/standarts")
public class StandartsController {
    @GetMapping
    public String standartsPage(){
        return "standarts";
    }
}
