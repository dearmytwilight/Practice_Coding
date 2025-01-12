import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] alphabet = new int[26];
        String str = scanner.next();
        str = str.toUpperCase();

        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - 'A';
            alphabet[num]++;
        }

        int max = 0;
        char maxch = '?';
        boolean same = false;

        for (int i = 0; i < 26; i++) {
            if (alphabet[i] > max) {
                max = alphabet[i];
                maxch = (char)(i+'A');
                same = false;
            }

            else if (alphabet[i] == max && max > 0) {
                same = true;

            }
        }

        if (!same) {
            System.out.print(maxch);
        }
        else {
            System.out.print('?');
        }

    }
}