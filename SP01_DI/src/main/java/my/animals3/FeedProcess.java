package my.animals3;

public class FeedProcess implements Process {

    private Animal animal;

    @Override
    public void start() {
        System.out.println(animal.voice());
        animal.eat();
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
