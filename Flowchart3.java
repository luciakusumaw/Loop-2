public class Flowchart3 {
    public static void main(String[] args) {
        for (int n = 1; n <= 5; n++) {
            int sum = 0;
            System.out.print("n = " + n + " --> sum of squares: ");

            
            for (int i = 1; i <= n; i++) {
                System.out.print(i * i);
                sum += i * i;
                if (i < n) {
                    System.out.print(" + ");
                }
            }
            System.out.println(" = " + sum);
            }
}
}
