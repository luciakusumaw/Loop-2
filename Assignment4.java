import java.util.Arrays;
import java.util.Scanner;
public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sports = {"Badminton", "Table Tennis", "Basketball", "Volleyball"};
        String[][] athletes = new String[sports.length][5];

        for (int i = 0; i < sports.length; i++) {
            System.out.println("\nEnter 5 athletes for " + sports[i] + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("Athlete " + (j + 1) + ": ");
                athletes[i][j] = sc.nextLine();
            }
            Arrays.sort(athletes[i]);
        }

        System.out.println("\n=== PORSENI 2024 Athlete List (Sorted Alphabetically) ===");
        for (int i = 0; i < sports.length; i++) {
            System.out.println("\n" + sports[i] + ":");
            for (int j = 0; j < 5; j++) {
                System.out.println((j + 1) + ". " + athletes[i][j]);
            }
        }
        sc.close();
    }
}
