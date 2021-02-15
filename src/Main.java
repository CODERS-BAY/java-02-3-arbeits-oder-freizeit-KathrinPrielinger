import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //In der CODERS.BAY arbeiten wir von 8 bis 16 Uhr. Schreibe ein Programm,
        // dass eine Zahl von der Konsole einliest und ausgibt ob die Stunde in der Arbeitszeit liegt oder nicht.

        //Bonus: von 12 bis 13 Uhr ist immer Mittagspause, gib also in der Zeit aus, dass Mittag ist.
            int start = 8;
            int end = 16;

            Scanner scanner = new Scanner(System.in);
            int time = scanner.nextInt();

            if (time <= 13 & time >= 12) {
                System.out.println("Mittagspause!");
            }

            else if (time <= 16 & time >= 8) {
                System.out.println("Diese Zeit ist Arbeitszeit in der Codersbay" + scanner);
            }

            else {
                System.out.println("Diese Zeit ist keine Arbeitszeit in der Codersbay" + scanner);
            }





    }
}