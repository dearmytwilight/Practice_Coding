import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array1 = {1, 1, 2, 2, 2, 8};
        int[] array2 = new int[6];

        for (int i=0; i<6; i++) {
            array2[i] = scanner.nextInt();
            System.out.print(array1[i] - array2[i] + " ");
        }

    }

}