public class LineSplitter {

    public static String[] lineArray (String line) {
        return line.split(",");
    }

    public static String[] section1Array(String line) {
        String[] lineArray = LineSplitter.lineArray(line);
        return lineArray[0].split(" ");
    }

    public static String[] section2Array(String line) {
        String[] lineArray = LineSplitter.lineArray(line);
        return lineArray[1].split(" ");
    }

    public static String[] nameSplitter(String rawNamesLine) {
        return rawNamesLine.split(",");
    }
}


