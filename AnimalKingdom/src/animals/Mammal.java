package animals;

public class Mammal extends Animal {
    public Mammal(int id, String name, int yearDiscovered) {
        super(id, name, yearDiscovered);
    }

    @Override
    public String move() {
        return "Walks";
    }

    @Override
    public String breathe() {
        return "Lungs";
    }

    @Override
    public String reproduce() {
        return "Live Births";
    }
}