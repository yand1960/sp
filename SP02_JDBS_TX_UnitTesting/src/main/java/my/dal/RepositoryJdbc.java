package my.dal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("repository")
public class RepositoryJdbc implements Repository{

    @Autowired
    private JdbcTemplate db;

    @Override
    public List<Product> getProducts() {
        String  sql = "SELECT ProductID, Name, ProductNumber, ListPrice " +
                "FROM Production.Product";
        List<Product> products = db.query(sql,
                new BeanPropertyRowMapper<>(Product.class));
        return products;
    }
}
