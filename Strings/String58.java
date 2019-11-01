

import java.util.Scanner;

public class String58 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int i1 = 0;
        int i2 = 0;

        for(int i = s.length() - 1; i >= 0; i--) {

            if(s.charAt(i) == '.') {

                i2 = i;

            }

            if(s.charAt(i) == '\\') {

            i1 = i;

            break;

            }


        }

        for(int i = i1 + 1; i < i2; i++) {

            System.out.print(s.charAt(i));

        }


    }
}
