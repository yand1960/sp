package my.spring.dal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component  //Есть еще @Service, @Repository
@PropertySource("classpath:app.properties")
public class RepositoryRest implements Repository{
    String url = "/products.aspx";

    @Autowired
    RestTemplate rest;

    @Value("${base.url}")
    String base_url;

    @Override
    public List<Product> getProducts() {
        var products = rest.getForObject(base_url + url,Product[].class);
        return Arrays.stream(products).toList();
    }
}
