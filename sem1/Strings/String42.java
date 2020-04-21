

import java.util.Scanner;

public class String42 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        s = s.toLowerCase();

        char c = ' ';

        int k = 0;

        String s1 = " ";

        String s2 = s1.concat(s).concat(" ");


        for(int i = 1; i < s2.length() - 1; i++) {

            if((s2.charAt(i) != ' ') & (s2.charAt(i-1) == ' ')) {

                c = s2.charAt(i);


            }

            if((s2.charAt(i) != ' ') & (s2.charAt(i+1) == ' ')) {

                if(s2.charAt(i) == c) {

                    k++;



                }


            }



        }


        System.out.println(k);


    }
}
