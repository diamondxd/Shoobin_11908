import java.util.Scanner;

public class Ar2 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size");

        byte m = sc.nextByte();

        int[] a = new int[m];

        System.out.println("Enter array :");

        for(int i = 0; i < m; i++) {

            a[i] = sc.nextInt();

        }

        System.out.println("Odd: ");

        for(int i = 0; i < m; i+=2) {

            System.out.print(a[i] + " ");

        }

        System.out.println("\nEven: ");

        for(int i = 1; i < m; i+=2) {

            System.out.print(a[i] + " ");

        }

    }
}
