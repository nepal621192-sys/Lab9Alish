import java.util.Random;
import java.util.Scanner;

public class Arrays {
    static void main(String[] args) {
        //Vars
        int [] dataPoints = new int[100];
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        double avg = 0;
        int minVal = 100;
        int maxVal = 0;
        int userInt1;
        int userInt2;
        boolean found = false;
        int count = 0;
        int position = 0;

        //Assign
        userInt1 = InputHelper.getRangedInt(scan, "Enter integer [1-100]:", 1, 100);
        userInt2 = InputHelper.getRangedInt(scan, "Enter integer [1-100]:", 1, 100);

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }

        //Print
        for (int x : dataPoints) {
            System.out.print(x + "|");
        }

        //Calculations
        //Sum
        for (int x : dataPoints) {
            sum += x;
        }

        //Avg
        avg = (double) sum / (dataPoints.length);

        //Max
        for (int x : dataPoints) {
            if (minVal > x) {
                minVal = x;
            }
        }

        //Min
        for (int x : dataPoints) {
            if (maxVal < x) {
                maxVal = x;
            }
        }

        //userInt1 Count
        for (int x : dataPoints) {
            if (x == userInt1) {
                count++;
            }
        }

        //userInt2 First Position
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userInt2) {
                found = true;
                position = i;
                break;
            }
        }

        //Output
        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Minimum value: " + minVal);
        System.out.println("Maximum Value: " + maxVal);
        System.out.println("Your number " + userInt1 + " was found " + count + " times.");

        if (found) {
            System.out.println("The value " + userInt2 + " was found at array index " + position + ".");
        } else {
            System.out.println("The value " + userInt2 + " was not found.");
        }
    }
}