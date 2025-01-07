import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String str = scanner.next();
        int answer = 0;

        for (int i = 0; i<n; i++) {
            answer += (int) str.charAt(i)-48;
        }

        System.out.print(answer);

    }
}