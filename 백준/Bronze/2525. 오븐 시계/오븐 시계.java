import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int time = scanner.nextInt();

        m += time;
        h += m/60;
        m = m%60;

        if (h >= 24) {
            h -= 24;
        }

        System.out.println(h + " " + m);

    }
}