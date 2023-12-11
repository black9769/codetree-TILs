import java.util.Scanner;

public class Main {
    
    private static void printOdds(int start, int end) {
        if (start > end) return;
        System.out.print(start + " ");
        printOdds(start + 2, end);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

            if (n > 369) {
                printOdds(369, n);
            } else {
                printOdds(n, 369);
            }
        
    }
}