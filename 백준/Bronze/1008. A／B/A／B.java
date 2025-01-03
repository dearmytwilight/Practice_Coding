import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 정수 입력

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();


        // 출력
        System.out.println(a/b);

        scanner.close(); // 리소스 해제

    }
}
