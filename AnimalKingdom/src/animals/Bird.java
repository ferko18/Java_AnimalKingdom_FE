package animals;

public class Bird extends Animal {
    public Bird(int id, String name, int yearDiscovered) {
        super(id, name, yearDiscovered);
    }

    @Override
    public String move() {
        return "Flies";
    }

    @Override
    public String breathe() {
        return "Lungs";
    }

    @Override
    public String reproduce() {
        return "Eggs";
    }
}