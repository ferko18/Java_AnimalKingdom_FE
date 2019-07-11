package animals;

public class Fish extends Animal {
    public Fish(int id, String name, int yearDiscovered) {
        super(id, name, yearDiscovered);
    }

    @Override
    public String move() {
        return "Swims";
    }

    @Override
    public String breathe() {
        return "Gills";
    }

    @Override
    public String reproduce() {
        return "Eggs";
    }
}