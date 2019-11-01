
import java.util.Scanner;

public class String54 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int k = 0;

        for(int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'y' || s.charAt(i) == 'u') {

                k++;

            }

        }

         System.out.println(k);

    }
}
