import java.util.Scanner;

public class Ar1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size");

        byte m = sc.nextByte();

        int [] a = new int [m] ;

        System.out.println("Enter array");

        for(int i = 0; i < m; i++ ) {

            a[i] = sc.nextInt();

        }

        int max = a[0];
        int min = a[0];
        int mini = 0;
        int maxi = 0;

        for(int i = 1; i < m; i++) {

            if(a[i] > max) {

                max = a[i];
                maxi = i;
            }

            if(a[i] < min) {

                min = a[i];
                mini = i;
            }

        }

        if(maxi < mini) {

            System.out.println(maxi + 1);
        }

        else {

            System.out.println(mini + 1);
        }

    }
}
