package my.animals1;

public class WalkProcess implements Process{

    private Animal animal;

    public WalkProcess(Animal animal) {
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
