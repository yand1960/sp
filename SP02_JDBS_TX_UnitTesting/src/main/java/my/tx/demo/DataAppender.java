package my.tx.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("appender")
public class DataAppender {

    @Autowired
    JdbcTemplate db;

    //@Transactional //Не обязательно
    public void append(String data) {
        var sql = "INSERT Junk(Data) VALUES(?)";
        db.update(sql,data);
    }

}
