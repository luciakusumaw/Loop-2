public class Flowchart1 {
    public static void main(String[] args) {
        for (int i=10; i>=1; i--) {
            for (int j = i-1; j>=0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
