import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int money = 0;


       if (a==b && b==c) {
           money = 10000+a*1000;
       }
       else if (a==b || a==c) {
           money = 1000 + a*100;
       }
       else if (b == c) {
           money = 1000 + b*100;
       }
       else {
           money = Math.max(Math.max(a,b),c)*100;
       }

        System.out.println(money);

    }
}