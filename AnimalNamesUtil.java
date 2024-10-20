import java.util.ArrayList;

public class AnimalNamesUtil {
    static String[] hyenaNamesArray;
    static String[] lionNamesArray;
    static String[] bearNamesArray;
    static String[] tigerNamesArray;

    public static void sortNames (ArrayList<String> rawNames) {
        hyenaNamesArray = nameSplitter(rawNames.get(2));
        lionNamesArray = nameSplitter(rawNames.get(6));
        bearNamesArray = nameSplitter(rawNames.get(10));
        tigerNamesArray = nameSplitter(rawNames.get(14));
    }

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