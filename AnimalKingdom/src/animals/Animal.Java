package animals;

public abstract class Animal {

    //private fields
    private int id; 
    private String name;
    private int yearDescovered;

     //constructor
    public Animal (int id, String name, int yearDescovered){
        this.id = id; 
        this.name=name;
        this.yearDescovered=yearDescovered;
    }

    //public methods
    public int getID(){
       return id ;
   }
    public String getName() {
        return name;
    }

    public int getYearDiscovered() {
        return yearDescovered;
    }

    public String consume() {
        return "I am an animal, I consume";
    }

    public String move() {
        return "I move like every animal";
    }

    public String breathe() {
        return "I breath because I am an animal";
    }

    public String reproduce() {
        return "I reproduce because I am an animal";
    }
}