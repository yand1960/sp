package my.spring.mvc;

import my.spring.buslog.FilterProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductMvcController {

    @Autowired
    FilterProducts filter;

    @RequestMapping("/products")
    public String products(Model model) {
        model.addAttribute("products", filter.getProductsByFirstLetters(""));
        return "products"; //products - это название представления
    }
}
