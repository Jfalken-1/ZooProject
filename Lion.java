import java.time.LocalDate;

public class Lion extends Animal {
    private static int numOfLions;

    public Lion(int age, String sex, String species, String seasonBorn, String color, String weight, String origen, String name, String id, LocalDate birthDay) {
        super(age, sex, species, seasonBorn, color, weight, origen, name, id, birthDay);
        numOfLions++;
    }

    public static int getNumOfLions() {
        return numOfLions;
    }
}
