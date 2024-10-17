import java.time.LocalDate;
import java.time.Month;
import java.util.Random;

public class BirthdayGenerator {
    public static LocalDate generateBirthday(int age, String seasonBorn) {
        Random random = new Random();
        int currentYear = LocalDate.now().getYear();
        int birthYear = currentYear - age;
        int birthMonth = 0;
        int dayOfBirth = 0;
        int monthPicker = random.nextInt(3);


        switch (seasonBorn.toLowerCase()) {
            case "spring":
                if (monthPicker == 0) {
                    birthMonth = Month.MARCH.getValue();
                } else if (monthPicker == 1) {
                    birthMonth = Month.APRIL.getValue();
                } else {
                    birthMonth = Month.MAY.getValue();
                }
                break;
            case "summer":
                if (monthPicker == 0) {
                    birthMonth = Month.JUNE.getValue();
                } else if (monthPicker == 1) {
                    birthMonth = Month.JULY.getValue();
                } else {
                    birthMonth = Month.AUGUST.getValue();
                }
                break;
            case "fall":
                if (monthPicker == 0) {
                    birthMonth = Month.SEPTEMBER.getValue();
                } else if (monthPicker == 1) {
                    birthMonth = Month.OCTOBER.getValue();
                } else {
                    birthMonth = Month.NOVEMBER.getValue();
                }
                break;
            case "winter":
                if (monthPicker == 0) {
                    birthMonth = Month.DECEMBER.getValue();
                } else if (monthPicker == 1) {
                    birthMonth = Month.JANUARY.getValue();
                } else {
                    birthMonth = Month.FEBRUARY.getValue();
                }
                break;
            case "unknown":
                return null;
        }


        dayOfBirth = switch (birthMonth) {
            case 1, 3, 5, 7, 8, 10, 12 -> random.nextInt(31) + 1;
            case 4, 6, 9, 11 -> random.nextInt(30) + 1;
            case 2 -> random.nextInt(28) + 1;
            default -> throw new IllegalArgumentException("Invalid month: " + birthMonth);
        };


        return LocalDate.of(birthYear, birthMonth, dayOfBirth);
    }

}
