package my.spring.dal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RepositoryJdbc implements Repository{

    //Чтобы была возможность использовать этот клас вне контекста
    //Можно инжектировать через контруктор или через сеттер

    @Autowired
    JdbcTemplate db;

    @Override
    public List<Product> getProducts() {
        String sql = "SELECT ProductID, Name, ProductNumber, ListPrice FROM Production.Product";
        return db.query(sql, new BeanPropertyRowMapper<>(Product.class));
    }
}
