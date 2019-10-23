import java.util.Scanner;
import java.util.Random;

 public class Matrix41 {
	 
	 public static void main(String [] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 Random rdm = new Random();
		 
		 System.out.print("Enter M x N pls\n");
		 
		 int m = sc.nextInt();
		 int n = sc.nextInt();
		 int k = 1;
		 int max = 1;
		 int maxa = 0;
		 
		 int[][] a = new int[m][n];
		 
		 System.out.println();
		 
		  for(int i = 0; i < m; i++) {
			  for(int j = 0; j < n; j++) {
		        
				a[i][j] = rdm.nextInt(9) + 1;
				System.out.print(a[i][j] + " ");
				
			  }
				 System.out.println();
		  }
		  
		  System.out.println();
		  
		  System.out.println(" Result:");
		  
		  for(int i = 0; i < n; i++) {
			  for(int j = 1; j < m; j++) {
				  
				  if(a[j][i] == a[j-1][i]) {
					  k++;
				  }
				  else {
					  k =1;
				  }
				  
			  }
			  if(k > max) {
				  
				  maxa = i;
				  
			  }
			  k = 1;
		  }
		  
		  System.out.println(maxa + 1);
		  
	 }
	 
 }