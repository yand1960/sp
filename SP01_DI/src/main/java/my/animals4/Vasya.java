package my.animals4;

import java.util.List;

public class Vasya  implements Human{

    private String name;
    private List<Animal> pets;

    public Vasya(String name, List<Animal> pets) {
        this.name = name;
        this.pets = pets;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public List<Animal> getPets() {
        return pets;
    }

    @Override
    public void setPets(List<Animal> pets) {
        this.pets = pets;
    }

    @Override
    public void feedPets() {
        for(var p:pets){
            System.out.println(name + " feeds one of his pets...");
            p.eat();
        }
    }
}
