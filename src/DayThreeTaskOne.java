import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DayThreeTaskOne {
    public static void main(String[] args) {
        FileInputStream file = null;
        try{
            file = new FileInputStream("diagnosticReportDay3.txt");
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

        Scanner scan = new Scanner(file);

        ArrayList<String> binReport = new ArrayList<String>();
        while (scan.hasNext()){
            binReport.add(scan.nextLine());
        }
        System.out.println(binReport.size());
    }
}