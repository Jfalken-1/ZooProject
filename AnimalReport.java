import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;


public class AnimalReport {
    public static void generateReport() {
        HashMap<String, Integer> animalCounts = new HashMap<>();
        animalCounts.put("hyenaCount", Hyena.getNumOfHyenas());
        animalCounts.put("lionCount", Lion.getNumOfLions());
        animalCounts.put("bearCount", Bear.getNumOfBears());
        animalCounts.put("tigerCount", Tiger.getNumOfTigers());

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("animalReport.txt"));

            writer.write("Number of Hyenas: " + animalCounts.get("hyenaCount") + "\n" +
                    "Number of lions: " + animalCounts.get("lionCount") + "\n" +
                    "Number of bears: " + animalCounts.get("bearCount") + "\n" +
                    "Number of tigers: " + animalCounts.get("tigerCount") + "\n" +
                    "\nTotal number of animals: " + Animal.getNumOfAnimals() + "\n\n\n"

            );

            writer.write("\nHyenas\n");

            for (Animal hyena : AnimalObjectSorter.hyenas) {
                writer.write("\nID: " + hyena.getId() + "; " +
//                        " Species: " + hyena.getSpecies() + "; " +
                        " Name: " + hyena.getName() + "; " +
                        " Sex: " + hyena.getSex() + "; " +
                        " Age: " + hyena.getAge() + "; " +
                        " Weight: " + hyena.getWeight() + "; " +
                        " Color: " + hyena.getColor() + "; " +
                        " Born in: " + hyena.getSeasonBorn() + "; " +
                        " From: " + hyena.getOrigen() + "; " +
                        " Birthday: " + hyena.getBirthDay() + ";\n");

            }

            writer.write("\nLions\n");

            for (Animal lion : AnimalObjectSorter.lions) {
                writer.write("\nID: " + lion.getId() + "; " +
                        " Species: " + lion.getSpecies() + "; " +
                        " Name: " + lion.getName() + "; " +
                        " Sex: " + lion.getSex() + "; " +
                        " Age: " + lion.getAge() + "; " +
                        " Weight: " + lion.getWeight() + "; " +
                        " Color: " + lion.getColor() + "; " +
                        " Born in: " + lion.getSeasonBorn() + "; " +
                        " From: " + lion.getOrigen() + "; " +
                        " Birthday: " + lion.getBirthDay() + ";\n");
            }

            writer.write("\nBears\n");

            for (Animal bear : AnimalObjectSorter.bears) {
                writer.write("\nID: " + bear.getId() + "; " +
                        " Species: " + bear.getSpecies() + "; " +
                        " Name: " + bear.getName() + "; " +
                        " Sex: " + bear.getSex() + "; " +
                        " Age: " + bear.getAge() + "; " +
                        " Weight: " + bear.getWeight() + "; " +
                        " Color: " + bear.getColor() + "; " +
                        " Born in: " + bear.getSeasonBorn() + "; " +
                        " From: " + bear.getOrigen() + "; " +
                        " Birthday: " + bear.getBirthDay() + ";\n");
            }

            writer.write("\nTigers\n");

            for (Animal tiger : AnimalObjectSorter.tigers) {
                writer.write("\nID: " + tiger.getId() + "; " +
                        " Species: " + tiger.getSpecies() + "; " +
                        " Name: " + tiger.getName() + "; " +
                        " Sex: " + tiger.getSex() + "; " +
                        " Age: " + tiger.getAge() + "; " +
                        " Weight: " + tiger.getWeight() + "; " +
                        " Color: " + tiger.getColor() + "; " +
                        " Born in: " + tiger.getSeasonBorn() + "; " +
                        " From: " + tiger.getOrigen() + "; " +
                        " Birthday: " + tiger.getBirthDay() + ";\n");
            }


            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
