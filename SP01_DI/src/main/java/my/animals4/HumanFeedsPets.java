package my.animals4;

public class HumanFeedsPets implements Process{

    private Human human;

    @Override
    public void start() {
        human.feedPets();
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }
}
