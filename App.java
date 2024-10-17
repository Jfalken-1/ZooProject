import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class App {
    public static void main(String[] args) {

        // Take names from animalNames.txt and send them through AnimalNameSorter to have the names sorted by species into separate arrays.

        ArrayList<String> animalsNamesArrayList = new ArrayList<>();


        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("animalNames.txt"));
            String myNamesLine;


            // read file one line at a time
            while ((myNamesLine = bufferedReader.readLine()) != null) {
                animalsNamesArrayList.add(myNamesLine);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Send animalsNamesArrayList to AnimalNameSorter to have names sorted by species
        AnimalNameSorter.sortNames(animalsNamesArrayList);


        // Arriving animals
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("arrivingAnimals.txt"));
            String myLine;


            // read file one line at a time
            while ((myLine = bufferedReader.readLine()) != null) {
                Animal animal = AnimalFactory.makeAnimal(myLine);
                AnimalObjectSorter.sortAnimal(animal);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        AnimalReport.generateReport();

    }
}