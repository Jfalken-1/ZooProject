import java.util.ArrayList;
import java.util.HashMap;


public class AnimalObjectSorter {
    public static ArrayList<Animal> hyenas = new ArrayList<>();
    public static ArrayList<Animal> lions = new ArrayList<>();
    public static ArrayList<Animal> bears = new ArrayList<>();
    public static ArrayList<Animal> tigers = new ArrayList<>();

    public static void sortAnimal(Animal animal) {

        if (animal.getSpecies().equalsIgnoreCase("hyena")) {
            hyenas.add(animal);
        } else if (animal.getSpecies().equalsIgnoreCase("lion")) {
            lions.add(animal);
        } else if (animal.getSpecies().equalsIgnoreCase("bear")) {
            bears.add(animal);
        } else if (animal.getSpecies().equalsIgnoreCase("tiger")) {
            tigers.add(animal);
        }
    }






}
