package my.spring.buslog;

import my.spring.dal.Product;

import java.util.List;

public interface FilterProducts {
    List<Product> getProductsByFirstLetters(String letters);
}
