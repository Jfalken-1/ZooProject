import java.time.LocalDate;

public class Bear extends Animal {
    private static int numOfBears;
    public Bear (int age, String sex, String species, String seasonBorn, String color, String weight, String origen, String name, String id, LocalDate birthDay) {
        super(age, sex, species, seasonBorn, color, weight, origen, name, id, birthDay);
        numOfBears++;
    }

    public static int getNumOfBears() {
        return numOfBears;
    }
}
