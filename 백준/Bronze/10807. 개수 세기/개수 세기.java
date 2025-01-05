import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];
        int count = 0;


        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int find = scanner.nextInt();

        for (int j = 0; j < n; j++) {
            if (array[j] == find) {
                count++;
            }
        }

        System.out.print(count);
    }

}