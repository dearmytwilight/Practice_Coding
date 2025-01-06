import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] array = new int[N+1];

        for (int j=1; j<=N; j++) {
            array[j] = j;
        }


        for (int i=0; i<M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int temp = array[a];
            array[a] = array[b];
            array[b] = temp;

        }

        for (int k=1; k<=N; k++) {
            System.out.print(array[k] + " ");
        }


    }

}