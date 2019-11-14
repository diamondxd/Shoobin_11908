import java.util.Scanner;

public class Ar6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size");

        byte m = sc.nextByte();

        int[] a = new int[m];

        System.out.println("Enter array :");

        for (int i = 0; i < m; i++) {

            a[i] = sc.nextInt();

        }

        //1 2 3 4 5

        System.out.println("Enter N");

        int n = sc.nextInt();

        int k;

        for (int a1 = 0; a1 < n; a1++) {

            k = a[m - 1];

            for (int i = m - 2; i >= 0; i--) {



                a[i + 1] = a[i];



            }

            a[0] = k;
        }

        for (int i = 0; i < m; i++) {

            System.out.print(a[i] + " ");

        }
    }
}
