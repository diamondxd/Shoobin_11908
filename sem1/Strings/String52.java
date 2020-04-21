

import java.util.Scanner;

public class String52 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String s2 = " ";

        String s1 = s2.concat(s);

        char c;


        System.out.println();

        for(int i = 1; i < s1.length(); i++) {

            if ((s1.charAt(i) != ' ') && (s1.charAt(i - 1) == ' ')) {


                System.out.print(Character.toUpperCase(s1.charAt(i)));

                continue;


            }

            System.out.print(s1.charAt(i));

        }


    }
}
