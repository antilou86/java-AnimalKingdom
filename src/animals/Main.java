package animals;

import java.util.*;

//create main class
public class main {
    public static void main(String[] args){
        //make an ArrayList of all animals
        ArrayList<Animals> zootopia = new ArrayList<Animals>();

        //add mammals to the zootopia ArrayList
        zootopia.add(new Mammals("Panda", 1869));
        zootopia.add(new Mammals("Zebra", 1778));
        zootopia.add(new Mammals("Koala", 1816));
        zootopia.add(new Mammals("Sloth", 1804));
        zootopia.add(new Mammals("Armadillo", 1758));
        zootopia.add(new Mammals("Raccoon", 1758));
        zootopia.add(new Mammals("Bigfoot", 2021));

        //add Birds
        zootopia.add(new Birds("Pigeon", 1837));
        zootopia.add(new Birds("Peacock", 1821));
        zootopia.add(new Birds("Toucan", 1758));
        zootopia.add(new Birds("Parrot", 1824));
        zootopia.add(new Birds("Swan", 1758));

        //add Fish
        zootopia.add(new Fish("Salmon", 1758));
        zootopia.add(new Fish("Catfish", 1817));
        zootopia.add(new Fish("Perch", 1758));

        //sortin' em by year
            //this sets up the console for the print.
        System.out.println("All the aminals by most recent year discovered: ");
        System.out.println(); //makes a new line
            //sorts by year, top to bottom.
        zootopia.sort((animal1, animal2) -> animal2.getYearDiscovered() - animal1.getYearDiscovered());
            //prints a line for each animal in the sorted list
        zooTopia.forEach(animal -> System.out.println("name: "+animal.getName()+" year discovered: "+animal.getYearDiscovered()));

        //sortin' em by the ABCs
        System.out.println("All the aminals by name, sorted alphabetically: ");
        System.out.println(); 
            //sorts by the name, A-Z and prints to console for each animal.
        zootopia.sort((animal1, animal2) -> animal1.getName().compareToIgnoreCase(animal2.getName()));
        zooTopia.forEach(animal -> System.out.println("name: "+animal.getName()));

        //Sortin by movement
        System.out.println("All animals sorted by how they move: ");
        System.out.println();
            //Sorts by how the animals move.
        zootopia.sort((animal1, animal2) -> animal1.getMoves().compareToIgnoreCase(animal2.getMoves()));
        zootopia.forEach(animal -> System.out.println(animal.getName()+" will "+animal.moves()+" to move."));

    }
}