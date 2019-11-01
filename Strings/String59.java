

import java.util.Scanner;

public class String59 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int i1 = 0;

        for(int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) == '.') {

                i1 = i;

            }

        }

            for(int i = i1 + 1; i < s.length(); i++) {

                System.out.print(s.charAt(i));

            }
    }
}
