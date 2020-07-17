package eu.cz.yarovii.arrattainvest.Controller;

import eu.cz.yarovii.arrattainvest.businessLogic.MakeOrder;
import eu.cz.yarovii.arrattainvest.model.Detail;
import eu.cz.yarovii.arrattainvest.model.SpecificDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.PostConstruct;
import java.io.IOException;

@Controller
@RequestMapping(value = "/order")
public class OrderController {

    private MakeOrder makeOrder;

    @GetMapping
    public String orderPage(Model model){
        model.addAttribute("invalid", false);
        return "order_main";
    }

    @PostMapping("/validate_round")
    public String validateRoundOrder(@RequestParam float DorH,
                                     @RequestParam float dOrB,
                                     @RequestParam float L, Model model) throws IOException {

        Detail d = new Detail(DorH, dOrB, L);
        System.err.println(d.getDorH()+" DORH   "+d.getL()+" l     here     ..............");

        if(!makeOrder.makeDetail(d) && d.getType().equals(SpecificDetails.INVALID)){
            System.err.println(d.getDorH()+" DORH   "+d.getL()+" l     here     ..............");

            model.addAttribute("invalid", true);
            return "redirect:/order";  //return order page
        }

        System.err.println(d.getAllowance()+" here     ..............");
        model.addAttribute("allowance", d.getAllowance());

        return "redirect:/order/order_parameters";
    }

    @GetMapping("/order_parameters")
    public String orderParameters(Model model){
        model.getAttribute("allowance");
        return "order_parameters";
    }

    @PostMapping("/validate_rect")
    public String validateRectOrder(){
        return "order_main";
    }

    @PostConstruct
    public void initialize() {
        makeOrder = new MakeOrder();
    }
}
