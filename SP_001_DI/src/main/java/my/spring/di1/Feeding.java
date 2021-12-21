package my.spring.di1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component()
public class Feeding implements Process {

    //Инжекция через поле
    @Autowired
    @Qualifier("bobik")
    private Animal animal;

    @PostConstruct //Выполнятеся после инжекций при создании контекста
    private void postConstruct() {
        System.out.println("Доконфигрурируем животное " + animal.getVoice());
    }

    @Override
    public void run() {
        System.out.println(animal.getVoice());
        animal.eat();
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
