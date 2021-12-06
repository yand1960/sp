package my.animals2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("process1")
public class FeedProcess implements Process {

    //@Autowired() //способ инжекции (вариант 1)
    //@Qualifier("animal1")
    private Animal animal;

    @Override
    public void start() {
        System.out.println(animal.voice());
        animal.eat();
    }

    public Animal getAnimal() {
        return animal;
    }

    @Autowired() //способ инжекции (вариант 2)
    @Qualifier("animal1")
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
