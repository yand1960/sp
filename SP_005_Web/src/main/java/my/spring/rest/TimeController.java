package my.spring.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TimeController {

    @RequestMapping("api/time")
    public String time() {
        return (new Date()).toString();
    }

}
