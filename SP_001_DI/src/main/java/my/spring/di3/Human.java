package my.spring.di3;

import java.util.List;

public interface Human {
    String getName();
    void setName(String name);
    List<Animal> getPets();
    void setPets(List<Animal> pets);
    void feedAllPets();
}
