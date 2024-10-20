import java.util.ArrayList;
// Stores sorted names
public class AnimalNamesUtil {
    static String[] hyenaNamesArray;
    static String[] lionNamesArray;
    static String[] bearNamesArray;
    static String[] tigerNamesArray;

    // Uses the split method on commas for the lines that contain only names.
    public static void sortNames (ArrayList<String> rawNames) {
        hyenaNamesArray = nameSplitter(rawNames.get(2));
        lionNamesArray = nameSplitter(rawNames.get(6));
        bearNamesArray = nameSplitter(rawNames.get(10));
        tigerNamesArray = nameSplitter(rawNames.get(14));
    }
    // When called in AnimalFactory, this will use getNumOfAnimal as an index to assign the next name in the correct array
    public static String nameAnimal (String species) {
        String name = "";
        switch (species) {
            case "hyena" -> name = hyenaNamesArray[Hyena.getNumOfHyenas()];
            case "lion" -> name = lionNamesArray[Lion.getNumOfLions()];
            case "bear" -> name = bearNamesArray[Bear.getNumOfBears()];
            case "tiger" -> name = tigerNamesArray[Tiger.getNumOfTigers()];
        }
        return name;
    }

    public static String[] nameSplitter(String rawNamesLine) {
        return rawNamesLine.split(",");
    }
}