package eu.cz.yarovii.arrattainvest.Controller;

import eu.cz.yarovii.arrattainvest.businessLogic.FillOrder;
import eu.cz.yarovii.arrattainvest.model.Detail;
import eu.cz.yarovii.arrattainvest.model.SimpleRoundDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private FillOrder fillOrder;

    @GetMapping
    public String orderPage(){
        return "order_main";
    }

    @PostMapping("/validate_round")
    public String validateRoundOrder(@RequestParam float sizeD,
                                     @RequestParam float sizeSmD,
                                     @RequestParam float sizeL){

        SimpleRoundDetail roundDetail;

        roundDetail = fillOrder.getForgingSizes(sizeD, sizeSmD, sizeL);

        if(roundDetail.getDetailName().equals(Detail.INVALID));

        return "order_main";
    }

    @PostMapping("/validate_rect")
    public String validateRectOrder(){
        return "order_main";
    }
}
