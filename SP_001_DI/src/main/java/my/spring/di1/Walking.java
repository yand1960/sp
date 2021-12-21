package my.spring.di1;

import org.springframework.stereotype.Component;

//@Component
public class Walking implements Process {

    private Animal animal;

    //Инжекция через конструктор не требует дополнительных конфигураций
    public  Walking(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void run() {
        System.out.println("Walking "
                + animal.getClass().toString()
                + " " + animal.getVoice());
    }
}
