import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N (Minimum N value is 5): ");
        int n = sc.nextInt();
        for (int i=n; i>=1; i-- ) {
            for (int j = 1; j<= i; j++) {
            System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
