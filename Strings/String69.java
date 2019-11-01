

import java.util.Scanner;

public class String69 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int k = 0;

        for(int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == '(') {

                k++;

            }

            if(s.charAt(i) == ')') {

                k--;

                if (k <= -1) {

                    System.out.println(i+1);

                    System.exit(0);

                }

            }

        }

        if(k == 0) {

            System.out.println(k);
        }

        if(k == 1) {

            System.out.println("-1");

        }

    }
}
