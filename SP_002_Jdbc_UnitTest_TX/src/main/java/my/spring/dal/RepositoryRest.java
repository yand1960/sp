package my.spring.dal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

//@Component
public class RepositoryRest implements Repository{
    String url = "http://yand.dyndns.org/api/products.aspx";

    @Autowired
    RestTemplate rest;

    @Override
    public List<Product> getProducts() {
        var products = rest.getForObject(url,Product[].class);
        return Arrays.stream(products).toList();
    }
}
