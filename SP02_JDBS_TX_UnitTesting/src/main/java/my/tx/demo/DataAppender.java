package my.tx.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("appender")
public class DataAppender {

    @Autowired
    JdbcTemplate db;

    public void append(String data) {
        var sql = "INSERT Junk(Data) VALUES(?)";
        db.update(sql,data);
    }

}
