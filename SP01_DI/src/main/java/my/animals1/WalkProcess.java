package my.animals1;

public class WalkProcess implements Process{

    private Animal animal;

    @Override
    public void start() {
        System.out.println("WALKING!");
        System.out.println(animal.voice());
        System.out.println(animal.voice());
        System.out.println(animal.voice());
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
