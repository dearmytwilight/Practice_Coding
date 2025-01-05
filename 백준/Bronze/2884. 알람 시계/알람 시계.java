import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();


        if (b < 45) {
            b += 15;
            if (a==0) {
                a = 23;
            }
            else {
                a -= 1;
            }
            System.out.println(a + " " + b);
        }

        else {
            b -= 45;
            System.out.println(a + " " + b);
        }
    }
}