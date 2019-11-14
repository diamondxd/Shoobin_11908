import java.util.Scanner;

public class Ar4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size");

        byte m = sc.nextByte();

        int[] a = new int[m];

        System.out.println("Enter array");

        for (int i = 0; i < m; i++) {

            a[i] = sc.nextInt();

        }

        int k = 0;
        int k1 = 0;

        // 1, 3, 2, 5, 4, 1, 0

        for(int i = 1; i < m; i++) {

            if(a[i] < a[i - 1]) {

                k++;

            }


            if(a[i] > a[i - 1]) {

                if(k > 0) {

                    k1++;
                    k = 0;

                }

            }

        }

        if(k!=0) {

            k1++;
        }

        System.out.println(k1);

    }

}
