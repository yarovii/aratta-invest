package eu.cz.yarovii.arrattainvest.Controller;

import eu.cz.yarovii.arrattainvest.businessLogic.MakeOrder;
import eu.cz.yarovii.arrattainvest.model.Detail;
import eu.cz.yarovii.arrattainvest.model.SpecificDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.PostConstruct;
import java.io.IOException;

@Controller
@RequestMapping("/detail")
public class DetailController {

    private MakeOrder makeOrder;
    private Detail d;

    @RequestMapping()
    public String orderPage(Model model){
        model.addAttribute("invalid", false);
        return "detail_calculator";
    }

    @RequestMapping(path = "/validate_round", method = RequestMethod.POST)
    public String validateRoundOrder(@RequestParam float DorH,
                                     @RequestParam(required = false) float dOrB,
                                     @RequestParam float L,
                                     Model model, RedirectAttributes ra) throws IOException {

        d = new Detail(DorH, dOrB, L);

        if(!makeOrder.makeDetail(d) && d.getType().equals(SpecificDetails.INVALID)){
            model.addAttribute("invalid", true);
            return "detail_calculator";
        }

//        model.addAttribute("allowance", d.getAllowance());
//        ra.addFlashAttribute("allowance", d.getAllowance());
//        ra.addAttribute("allowance", d.getAllowance());               ///  @ModelAttribute("allowance") String allowance
//        return "redirect:/detail/parameters?dtl="+d.getType().toString().toLowerCase();
        return "redirect:/detail/"+d.getType().toString().toLowerCase()+"/specification/";
    }

    @RequestMapping(path = "/{dtl}/specification/", method = RequestMethod.GET)
    public String orderParameters(@PathVariable("dtl") String detailType,
                                  Model model){

        model.addAttribute("detailType", detailType);
        model.addAttribute("detail", d);
        return "detail_specification";
    }

    @PostMapping("/validate_rect")
    public String validateRectOrder(){
        return "detail_calculator";
    }

    @PostConstruct
    public void initialize() {
        makeOrder = new MakeOrder();
    }
}
