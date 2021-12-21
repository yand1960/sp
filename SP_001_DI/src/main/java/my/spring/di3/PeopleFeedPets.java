package my.spring.di3;

import java.util.List;

public class PeopleFeedPets implements Process {

    private List<Human> people;

    public PeopleFeedPets(List<Human> people) {
        this.people = people;
    }

    @Override
    public void run() {
        for(var p: people) {
            p.feedAllPets();
        }
    }
}

//Добавить Машу, изменить способ конфигрурации контекста на кодовый,
// пусть Маша и Вася покормят своих питомцев
