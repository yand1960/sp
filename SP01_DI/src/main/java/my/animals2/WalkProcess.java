package my.animals2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("process2")
public class WalkProcess implements Process {

    private Animal animal;

    //Инжекция через конструтор происходит автоматом
    //Но если есть двусмысленность по животным, требуются либо аннотации
    //Либо точно указание класса (как в это случае)
    //public WalkProcess(Dog animal) {
    public WalkProcess(@Qualifier("animal2") Animal animal) {
        this.animal = animal;
    }

    @Override
    public void start() {
        System.out.println("WALKING!");
        System.out.println(animal.voice());
        System.out.println(animal.voice());
        System.out.println(animal.voice());
    }


}
