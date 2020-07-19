package eu.cz.yarovii.arrattainvest.Controller;

import eu.cz.yarovii.arrattainvest.businessLogic.MakeOrder;
import eu.cz.yarovii.arrattainvest.model.Detail;
import eu.cz.yarovii.arrattainvest.model.SpecificDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.io.IOException;

@Controller
@RequestMapping(value = "/order")
public class OrderController {

    private MakeOrder makeOrder;

//    @GetMapping("/")
    @RequestMapping()
    public String orderPage(Model model){
        model.addAttribute("invalid", false);
        return "order_main";
    }
    @GetMapping("/a")
    public String orderPagen(Model model){
        model.addAttribute("invalid", true);
        return "order_main";
    }

    @RequestMapping(path = "/validate_round", method = RequestMethod.POST)
    public String validateRoundOrder(@RequestParam float DorH,
                                     @RequestParam(required = false) float dOrB,
                                     @RequestParam float L, Model model) throws IOException {

        Detail d = new Detail(DorH, dOrB, L);

        if(!makeOrder.makeDetail(d) && d.getType().equals(SpecificDetails.INVALID)){
            model.addAttribute("invalid", true);
            return "redirect:/order/a";

//            return "order_main";  //return order page
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
