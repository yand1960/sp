package my.dal;

import java.util.ArrayList;
import java.util.List;

public class RepositoryStub implements Repository{
    @Override
    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"a1","a101",111.0));
        products.add(new Product(1,"a2","a102",222.0));
        products.add(new Product(1,"a3","a103",3333.0));
        products.add(new Product(1,"b1","b101",444.0));
        return products;
    }
}
