package animals;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // create instances of mammals
        Mammal panda = new Mammal(1, "Panda", 1869);
        Mammal zebra = new Mammal(2, "Zebra", 1778);
        Mammal koala = new Mammal(3, "Koala", 1816);
        Mammal sloth = new Mammal(4, "Sloth", 1804);
        Mammal armadillo = new Mammal(5, "Armadillo", 1758);
        Mammal raccon = new Mammal(6, "Raccon", 1758);
        Mammal bigfoot = new Mammal(7, "Bigfoot", 2021);

        // create instance of Birds
        Bird pigeon = new Bird(8, "Pigeon", 1837);
        Bird peacock = new Bird(9, "Peacock", 1821);
        Bird toucan = new Bird(10, "Toucan", 1758);
        Bird parrot = new Bird(11, "Parrot", 1824);
        Bird swan = new Bird(12, "swan", 1758);

        // create instances of fish
        Fish salmon = new Fish(13, "Salmon", 1758);
        Fish catfish = new Fish(14, "Catfish", 1817);
        Fish perch = new Fish(15, "Perch", 1758);

        // create an instance of arraylist of animal
        ArrayList<Animal> Animals = new ArrayList<Animal>();

        // Add animals to Animals array list
        Animals.add(panda);
        Animals.add(zebra);
        Animals.add(koala);
        Animals.add(sloth);
        Animals.add(armadillo);
        Animals.add(raccon);
        Animals.add(bigfoot);

        // add birds to array list
        Animals.add(pigeon);
        Animals.add(peacock);
        Animals.add(toucan);
        Animals.add(parrot);
        Animals.add(swan);

        // add fish to array list
        Animals.add(salmon);
        Animals.add(catfish);
        Animals.add(perch);

        // List all the animals in descending order by year named
        // sort by year
        Animals.sort((a1, a2) -> a1.getYearDiscovered() - a2.getYearDiscovered());
        // print
        Animals.forEach(animal -> System.out.println(animal.getName() + ": " + animal.getYearDiscovered()));

        // List all the animals alphabetically
        System.out.println("\n*** Printing Animals Alphabetically ***");
        Animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        Animals.forEach(animal -> System.out.println(animal.getName()));

        //List only those animals that breathe with lungs
        System.out.println("\n*** Printing Animals that breathe with lungs");
        Animals.stream().filter(animal->animal.breathe().equals("Lungs")).forEach(animal -> System.out.println(animal.getName()));

        //List only those animals that breathe with lungs and were named in 1758
        System.out.println("\n*** Printing Animals that breathe with lungs and were named in 1758");
        Animals.stream().filter(animal->animal.breathe().equals("Lungs") && animal.getYearDiscovered() == 1758).forEach(animal -> System.out.println(animal.getName()));
        
        //List only those animals that lay eggs and breathe with lungs
        System.out.println("\n*** Printing Animals that animals that lay eggs and breathe with lungs");
        Animals.stream().filter(animal -> animal.breathe().equals("Lungs") && animal.reproduce().equals("Eggs")).forEach(animal -> System.out.println(animal.getName()));

        //List alphabetically only those animals that were named in 1758
        System.out.println("\n*** Printing Animals that animals that that were named in 1758");
        Animals.stream().filter(animal -> animal.getYearDiscovered() == 1758).sorted((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName())).forEach(animal -> System.out.println(animal.getName()));

        //stretch
        System.out.println("\n*** Printing Animals that are mammals");
        Animals.stream().filter(animal->animal.breathe().equals("Lungs") && animal.move().equals("Walks") && animal.reproduce().equals("Live Births")).forEach(animal -> System.out.println(animal.getName()));
    }
}