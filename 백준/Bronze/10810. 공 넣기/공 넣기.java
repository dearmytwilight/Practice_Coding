import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] array = new int[N+1];


        for (int i=0; i<M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            for (int j=a; j<=b; j++) {
                array[j] = c;
            }
        }

        for (int k=1; k<=N; k++) {
            System.out.print(array[k] + " ");
        }


    }

}