import java.util.Scanner;

public class Gauss {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Pls enter ur matrix sizes M x N");

        int m = sc.nextInt();

        int n = sc.nextInt();

        if(m+1 != n) {

            System.out.println("Matrix sizes should be N x N+1");

            System.exit(0);
        }

        int [][] a = new int [m][n];

        System.out.println("Enter matrix");

        for(int i = 0; i < m; i++) {

            for(int j = 0; j < n; j++) {

                a[i][j] = sc.nextInt();

                //not zero check


            }
        }

        for(int i = 0; i < m; i++) {

            for(int j = 0; j < n; j++) {

                System.out.printf("%4d" , a[i][j]);


            }
            System.out.println();
        }

        int g;

        for(int k = 0; k < n - 2; k++) {

            for (int i = k + 1; i < m; i++) {

                g = a[i][k];

                for (int j = k; j < m + 1; j++) {

                   a[i][j] = a[i][j] * a[k][k];

                   a[i][j] = a[i][j] - (a[k][j] * g);



                }

            }

        }

        if(a[m-1][m] % a[m-1][m-1] == 0) {

            a[m - 1][m] = a[m-1][m] / a[m-1][m-1];

            a[m-1][m-1] = 1;
        }

        for (int k = m - 1; k > 0; k--) {



            for(int i = k - 1; i >= 0;i--) {

                g = a[i][k];

                for(int j = n - 1;j >= 0;j-- ) {

                    a[i][j] = a[i][j] * a[k][k];

                    a[i][j] = a[i][j] - (a[k][j] * g);

                }

                if(a[k][m] % a[k][k] == 0 ) {

                    a[k][m] = a[k][m] / a[k][k];

                    a[k][k] = 1;

                }



            }

        }

        System.out.println();

       /* for(int i = 0; i < m; i++) {

            for(int j = 0; j < n; j++) {

                System.out.printf("%15d" , a[i][j]);


            }
            System.out.println();
        }

        */

       for(int i = 0; i < m; i++) {

           System.out.println("x" + (i + 1) + " = " + (float) a[i][m]/a[i][i]);
       }

    }
}
