import java.time.LocalDate;

public class Hyena extends Animal {
    private static int numOfHyenas;

    public Hyena(int age, String sex, String species, String seasonBorn, String color, String weight, String origen, String name, String id, LocalDate birthDay) {
        super(age, sex, species, seasonBorn, color, weight, origen, name, id, birthDay);
        numOfHyenas++;
    }

    public static int getNumOfHyenas() {
        return numOfHyenas;
    }

}


