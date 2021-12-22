package my.spring.dal;

import java.util.ArrayList;
import java.util.List;

public class RepositoryStub implements Repository{
    @Override
    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"lala","bubu",123.0));
        products.add(new Product(2,"lala","bubu",123.0));
        products.add(new Product(3,"lala","bubu",123.0));
        products.add(new Product(4,"lala","bubu",123.0));
        products.add(new Product(5,"Blade","BL-2036",0.0));

        return products;
    }
}
