package my.aop.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.io.*;

@Aspect
public class MyIntegrationAspect {

    private String file_path;

    public MyIntegrationAspect(String file_path) {
        this.file_path = file_path;
    }

    @Before("execution(double my.aop.demo.Calc.*(*,*))")
    public void exportData(JoinPoint point) {
        var args=point.getArgs();
        double x = (double) args[0];
        double y = (double) args[1];
        String method_name = point.getSignature().getName();
        try {
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter(file_path, true)
            );
            System.out.println(x + " " + y);
            writer.append(method_name + " " + x + " " + y + "\n");
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
