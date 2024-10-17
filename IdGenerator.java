public class IdGenerator {
    public static String makeID(String species) {
        String id = "";
        switch (species) {
            case "hyena":
                if (Hyena.getNumOfHyenas() < 10) {
                    id = species.substring(0, 2) + "0" + (Hyena.getNumOfHyenas() + 1);
                } else id = species.substring(0, 2) + (Hyena.getNumOfHyenas() + 1);
                break;
            case "lion":
                if (Lion.getNumOfLions() < 10) {
                    id = species.substring(0, 2) + "0" + (Lion.getNumOfLions() + 1);
                } else id = species.substring(0, 2) + (Lion.getNumOfLions() + 1);
                break;
            case "bear":
                if (Bear.getNumOfBears() < 10) {
                    id = species.substring(0, 2) + "0" + (Bear.getNumOfBears() + 1);
                } else id = species.substring(0, 2) + (Bear.getNumOfBears() + 1);
                break;
            case "tiger":
                if (Tiger.getNumOfTigers() < 10) {
                    id = species.substring(0, 2) + "0" + (Tiger.getNumOfTigers() + 1);
                } else id = species.substring(0, 2) + (Tiger.getNumOfTigers() + 1);
                break;
        }
        return id;
    }
}
