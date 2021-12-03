import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DayTwoTaskTwo {
    public static void main(String[] args) {

        //Dateipfad in File einlesen
        FileInputStream file = null;
        try {
            file = new FileInputStream("Navigations.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //Scanner auf Basis der Datei erstellen
        Scanner scan = new Scanner(file);
        int horizontalPos = 0;
        int depth = 0;
        int aim = 0;

        while (scan.hasNext()) {
            String line = scan.nextLine();
            String[] lineArray = line.split(" ");

            String command = lineArray[0];
            int distance = Integer.parseInt(lineArray[1]);

            switch (command) {
                case "forward":
                    horizontalPos += distance;
                    depth=depth+(aim*distance);
                    break;
                case "down":
                    aim += distance;
                    break;
                case "up":
                    aim -= distance;
                    break;
            }
        }
        System.out.println(depth*horizontalPos);
    }
}