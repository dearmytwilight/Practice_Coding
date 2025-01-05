import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int money = scanner.nextInt();
        int n = scanner.nextInt();


        for (int i = 1; i <= n ; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            money -= a*b;
        }

        if (money == 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
}