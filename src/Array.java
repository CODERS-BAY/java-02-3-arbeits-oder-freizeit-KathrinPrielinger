import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        //TODO calculate average grade - Exercise Time

        //Read nr X from console
        Scanner scanner = new Scanner(System.in);
        int numberOfGrades = scanner.nextInt();
        int[] grades = new int[numberOfGrades];
        System.out.println(Arrays.toString(grades));

        //Read X numbers from console
        for (int i = 0; i < numberOfGrades; i++) {
            int number = scanner.nextInt();
            grades[i] = number;

            System.out.println(Arrays.toString(grades));
        }

        //calculate average from all given numbers
        int summe = 0;
        for(int i = 0; i < numberOfGrades; i++) {
            int  current = grades[i];
            summe = summe + current;
            System.out.println(summe);
        }

        System.out.println("Durchschnitt ist " + (summe/ (numberOfGrades * 1.0)));    // * 0.1 mach aus einem int einen double










    }
}
