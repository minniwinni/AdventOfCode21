import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DayOneTaskOne {

    public static void main(String[] args) {
        //Dateipfad in File einlesen
        FileInputStream file = null;
        try {
            file = new FileInputStream("depthNumbers.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //Scanner auf Basis der Datei erstellen
        Scanner scan = new Scanner(file);
        int counter = 0;

        int depthA = scan.nextInt();
        int depthB = 0;

        while(scan.hasNextInt()){

            depthB = scan.nextInt();

            if(depthB>depthA) {
                counter++;
            }
            depthA=depthB;
        }
        System.out.println(counter);
    }
}
