import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double[] array = new double[n];
        double max = 0;
        double sum=0;

        for (int i=0; i<n; i++) {
            array[i] = scanner.nextInt();
            if (max < array[i]) {
                max = array[i];
            }
        }

        for (int k=0; k<n; k++) {
            sum+= array[k]/max*100;
        }

        System.out.print(sum/n);
    }

}