package exercises.Patterns;
import java.util.Scanner;

public class Pattern1 {
	
		public static void main(String[] args) {
					Scanner sc= new Scanner(System.in);
					
					int n;
					System.out.println("Give row number: ");
					n=sc.nextInt();
					
					pattern1(n);
					pattern2(n);
		}
		
		public static void pattern1(int n) {
			int row,col;
			for(row=1; row<=n; row++){
				for(col=1;col<=row;col++) {
					System.out.print(row+"   ");
				}
				System.out.println(" ");
			}
		}
		
		public static void pattern2(int n) {
			int row, col;
			for(row=n; row>=1; row--){
				for(col=1;col<=row;col++) {
					System.out.print("*  ");
				}
				System.out.println(" ");
			}
		}
}
