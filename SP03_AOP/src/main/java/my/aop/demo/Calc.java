package my.aop.demo;

import org.springframework.stereotype.Component;

@Component("calc")
public class Calc {

    public double plus(double x, double y) {
        return x + y;
    }

    public double minus(double x, double y) {
        return x - y;
    }
}
