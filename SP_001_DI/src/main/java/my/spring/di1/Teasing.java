package my.spring.di1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Teasing implements Process{

    private Animal animal;

    @Override
    public void run() {
        System.out.println(getAnimal().getVoice() + "((");
        System.out.println(getAnimal().getVoice() + "((");
        System.out.println(getAnimal().getVoice() + "((");
    }

    public Animal getAnimal() {
        return animal;
    }

    //Инжекция через сеттер
    @Autowired
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
