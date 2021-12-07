package my.tx.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("multiappender")
public class MultiAppender {

    @Autowired
    DataAppender appender;

    public void append3() {
        appender.append("YA1");
        appender.append("YA2");
        appender.append("YA3");
    }

}
