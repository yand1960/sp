package my.spring.boot;

import my.spring.buslog.FilterProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
//@Scope("prototype")
public class ProductMvcController {

    @Autowired
    FilterProducts filter;

    @Autowired
    Counter counter;

    @RequestMapping("/time")
    public String time(Model model) {
        model.addAttribute("now",(new Date()).toString());
        return "time";
    }

    @RequestMapping("/products")
    public String products(Model model) {
        model.addAttribute("products", filter.getProductsByFirstLetters(""));
        return "products";
    }

    @RequestMapping("/count")
    public String count(Model model) {
        model.addAttribute("counter", counter.incAndGet());
        return "counter";
    }

    @RequestMapping("/forall")
    @ResponseBody
    public String forall(Model model) {
        return "for all";
    }

    @RequestMapping("/restricted")
    @ResponseBody
    public String restricted(Model model) {
        return "restricted";
    }



}
