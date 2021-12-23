package my.spring.tx.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component()
public class DataAppender {

    @Autowired
    JdbcTemplate db;

    public void append(String data) {
        var sql = "INSERT INTO Junk(data) VALUES(?)";
        db.update(sql,data);
    }

}
