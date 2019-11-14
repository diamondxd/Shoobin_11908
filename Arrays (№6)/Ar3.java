import java.util.Scanner;

public class Ar3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size (more than 1)");

        byte m = sc.nextByte();

        int [] a = new int [m] ;

        System.out.println("Enter array");

        for(int i = 0; i < m ; i++ ) {

            a[i] = sc.nextInt();

        }

        int maxo = -2147483648;
        int maxe = -2147483648;
        int mino = 2147483647;
        int mine = 2147483647;


        for(int i = 0; i < m; i++) {

                if(a[i] % 2 == 0) {

                    if(a[i] > maxe) {

                        maxe = a[i];

                    }

                    if(a[i] < mine) {

                        mine = a[i];
                    }

                }

                else {

                    if(a[i] > maxo) {

                        maxo = a[i];

                    }

                    if(a[i] < mino) {

                        mino = a[i];
                    }



                }

        }

        System.out.println("maxOdd = " + maxo + " maxEven = " + maxe + " minOdd = " + mino + " minEven = " + mine);

    }
}
