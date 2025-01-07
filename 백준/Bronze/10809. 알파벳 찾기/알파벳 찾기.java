import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        int[] array = new int[26];

        for (int i =0; i<26; i++) {
            array[i] = -1;
        }

        for (int i = 0; i<str.length(); i++) {

            int index = str.charAt(i)-'a';
            if (array[index] == -1) {
                array[index] = i;
            }
        }

        for (int i = 0; i <26; i++) {
            System.out.print(array[i] +" ");
        }
    }
}