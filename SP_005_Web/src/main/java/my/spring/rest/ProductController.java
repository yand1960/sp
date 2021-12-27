package my.spring.rest;

import my.spring.buslog.FilterProducts;
import my.spring.dal.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    FilterProducts filter;

    @RequestMapping("api/products")
    public List<Product> products(String letters) {
        return filter.getProductsByFirstLetters(letters);
    }
}
