import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];
        int find = scanner.nextInt();


        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            if (array[i] < find) {
                System.out.print(array[i] + " ");
            }
        }

    }

}