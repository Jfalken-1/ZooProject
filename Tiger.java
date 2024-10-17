import java.time.LocalDate;

public class Tiger extends Animal{
    private static int numOfTigers;
    public Tiger (int age, String sex, String species, String seasonBorn, String color, String weight, String origen, String name, String id, LocalDate birthDay) {
        super(age, sex, species, seasonBorn, color, weight, origen, name, id, birthDay);
        numOfTigers++;
    }

    public static int getNumOfTigers() {
        return numOfTigers;
    }


}

