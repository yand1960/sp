package my.buslog;

import my.dal.Product;
import my.dal.Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Component("filter")
public class ProductFilter {

    private Repository repository;
    private List<Product> products;

    public ProductFilter(Repository repository) {
        this.repository = repository;
        products = repository.getProducts();
    }

    public List<Product> getProductsByFirstLetters(String letters) {
        return products
                .stream()
                .filter(p -> p.getName().toLowerCase().startsWith(letters.toLowerCase()))
                .collect(Collectors.toList());
    }

}
