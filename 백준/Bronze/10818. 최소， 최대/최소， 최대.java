import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];

        array[0] = scanner.nextInt();
        int max = array[0];
        int min = array[0];

        for (int i = 1; i < n; i++) {
            array[i] = scanner.nextInt();

            if (min > array[i]) {
                min = array[i];
            }

            if (max < array[i]) {
                max = array[i];
            }
        }

        System.out.print(min + " " + max);

    }

}