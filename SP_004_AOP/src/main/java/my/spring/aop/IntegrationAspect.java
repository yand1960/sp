package my.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@Aspect
public class IntegrationAspect {

    private String file_path;

    public IntegrationAspect(String file_path) {
        this.file_path = file_path;
    }

    @Before("execution(* Calc.plus(double,double))")
    public void exportData(JoinPoint point) {
        //System.out.println("Intercepted!");
        try {
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter(file_path,true)
            );
            double x = (double) point.getArgs()[0];
            double y = (double) point.getArgs()[1];
            writer.write("" + x + ";" + y + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 1. К понедельнику поставьте Tomcat 9.0 и добейтесь того, чтобы он работал
    // 2. Напишите аспект, который корректирует результат вычитания,
    // уменьшая его на 20% (величина потенциально может изменяться).
    // Подсказка: advice Before не годится для этого.
}
