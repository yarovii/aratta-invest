package eu.cz.yarovii.arrattainvest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {

    @GetMapping("/")
    public String main(){   //Returns main page
        return "main";
    }

}