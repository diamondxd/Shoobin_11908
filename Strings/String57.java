

import java.util.Scanner;

public class String57 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println();

        String s1 = s.concat(" ");

        for(int i = 0; i < s1.length() - 1; i++) {

            if(s1.charAt(i) == ' ' & s1.charAt(i+1) == ' ') {

                continue;

            }



            System.out.print(s1.charAt(i));
        }

    }
}
