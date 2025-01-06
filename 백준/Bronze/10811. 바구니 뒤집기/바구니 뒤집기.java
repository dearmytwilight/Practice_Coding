import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int array[] = new int[N+1];

        for (int j = 1; j<=N; j++) {
            array[j] = j;
        }

        for (int i = 0; i < M; i++) {
            int left = scanner.nextInt();
            int right = scanner.nextInt();

            while (left<right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }

        for (int i=1; i<=N; i++) {
            System.out.print(array[i] + " ");
        }
    }

}