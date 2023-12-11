import java.util.Scanner;

public class Main {

    // 재귀함수를 이용한 수열 계산
    private static int findNumberInSequence(int n) {
        if (n == 1) return 2;
        if (n == 2) return 4;
        return findNumberInSequence(n / 2) + findNumberInSequence(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // n 입력 받기
        int n = scanner.nextInt();

        // 수열 출력
        for (int i = 1; i <= n; i++) {
            System.out.print(findNumberInSequence(i) + " ");
        }
    }
}