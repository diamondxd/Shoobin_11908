import java.util.Scanner;

public class Ar5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter arrays size");

        byte m = sc.nextByte();

        int[] a = new int[m];

        System.out.println("Enter 1 array");

        for (int i = 0; i < m; i++) {

            a[i] = sc.nextInt();

        }


        int[] b = new int[m];

        System.out.println("Enter 2 array");

        for (int i = 0; i < m; i++) {

            b[i] = sc.nextInt();

        }

        int swap;

        for(int i = 0; i < m; i++) {

            swap = a[i];
            a[i] = b[i];
            b[i] = swap;


        }

        for(int i = 0; i < m; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();

        for(int i = 0; i < m; i++) {
            System.out.print(b[i] + " ");
        }

    }
}

