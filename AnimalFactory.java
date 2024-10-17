import java.time.LocalDate;

public class AnimalFactory {
    public static Animal makeAnimal(String line) {

//        String[] hyenaSounds = new String[] {"Cackle", "Giggle", "Whoop", "Chuckle"};
//        String[] lionSounds = new String[] {"Roar", "Growl", "Snarl", "Purr"};
//        String[] bearSounds = new String[] {"Growl", "Grunt", "Roar", "Chuckle"};
//        String[] tigerSounds = new String[] {"Roar", "Growl", "Snarl", "Prowl"};

        int age = AnimalParser.findAge(line);
        String sex = AnimalParser.findSex(line);
        String species = AnimalParser.findSpecies(line);
        String seasonBorn = AnimalParser.findSeasonBorn(line);
        String color = AnimalParser.findColor(line);
        String weight = AnimalParser.findWeight(line);
        String origen = AnimalParser.findOrigen(line);
        String name = AnimalNameSorter.nameAnimal(species);
        String id = IdGenerator.makeID(species);
        LocalDate birthDay = BirthdayGenerator.generateBirthday(age, seasonBorn);
        Animal animal = null;


        switch (species) {
            case "hyena" -> animal = new Hyena(age, sex, species, seasonBorn, color, weight, origen, name, id, birthDay);
            case "lion" -> animal = new Lion(age, sex, species, seasonBorn, color, weight, origen, name, id, birthDay);
            case "bear" -> animal = new Bear(age, sex, species, seasonBorn, color, weight, origen, name, id, birthDay);
            case "tiger" -> animal = new Tiger(age, sex, species, seasonBorn, color, weight, origen, name, id, birthDay);
        }

        return animal;
    }
}

