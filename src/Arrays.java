import java.util.Random;
import java.util.Scanner;

public class Arrays {
    static void main(String[] args) {
        //Vars
        int [] dataPoints = new int[100];
        Random rand = new Random();
        int sum = 0;
        double avg = 0;

        //Assign
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }

        //Print
        for (int x : dataPoints) {
            System.out.print(x + "|");
        }

        //Calculate
        //Sum
        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];
        }
        //Avg
        avg = (double) sum / (dataPoints.length);
        //Max
        for (int i = 0; i < ; i++) {
            
        }
        //Min
        for (int i = 0; i < ; i++) {
            
        }

        //Output
        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + avg);
    }
}
