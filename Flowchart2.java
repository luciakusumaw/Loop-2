public class Flowchart2 {
    public static void main(String[] args) {
        char letter = 'a';
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print(letter);
                letter++;
            }
            System.out.println();
        }
    }
}