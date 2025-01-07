import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        boolean answer = true;
        scanner.close();

        for (int i=0; i<str.length()/2; i++) {

            if (str.charAt(i) != str.charAt(str.length()-1-i)) {
                answer = false;
                break;
            }
        }

        if (answer) {
            System.out.print("1");
        }

        else {
            System.out.print("0");
        }

    }

}