package my.spring.buslog;

import my.spring.dal.Product;
import my.spring.dal.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Locale;

@Component
public class FilterProductsImpl implements FilterProducts{


    private List<Product> products;

    public FilterProductsImpl(Repository repository) {
        products = repository.getProducts();
    }

    @Override
    public List<Product> getProductsByFirstLetters(String letters) {
        return products.stream()
                .filter(p -> p.getName().toLowerCase().startsWith(letters.toLowerCase()))
                .toList();
    }
}
