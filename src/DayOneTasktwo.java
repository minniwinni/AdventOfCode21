import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DayOneTasktwo {

    public static void main(String[] args){
        FileInputStream file = null;
        try {
            file = new FileInputStream("depthNumbers.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //Scanner auf Basis der Datei erstellen
        Scanner scan = new Scanner(file);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int sumA = a+b+c;
        int sumB = 0;

        int counter = 0;

        while (scan.hasNextInt()){
            a=b;
            b=c;
            c= scan.nextInt();

            sumB=a+b+c;

            if(sumB>sumA){
                counter++;
            }

            sumA=sumB;
        }
        System.out.println(counter);
    }

}
