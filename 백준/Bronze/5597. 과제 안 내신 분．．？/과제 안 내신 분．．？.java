import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int array[] = new int[31];

        for (int i = 1; i<= 28; i++) {
            int a = scanner.nextInt();
            array[a] = 1;
        }

        for (int j = 1; j<=30; j++) {
            if (array[j] != 1) {
                System.out.println(j);
            }
        }


    }

}