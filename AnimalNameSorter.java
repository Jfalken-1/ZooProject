import java.util.ArrayList;

public class AnimalNameSorter {
    static String[] hyenaNamesArray;
    static String[] lionNamesArray;
    static String[] bearNamesArray;
    static String[] tigerNamesArray;

    public static void sortNames (ArrayList rawNames) {
        hyenaNamesArray = LineSplitter.nameSplitter((String) rawNames.get(2));
        lionNamesArray = LineSplitter.nameSplitter((String) rawNames.get(6));
        bearNamesArray = LineSplitter.nameSplitter((String) rawNames.get(10));
        tigerNamesArray = LineSplitter.nameSplitter((String) rawNames.get(14));
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
}