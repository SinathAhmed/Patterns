package exercises.Patterns;
import java.util.*;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("give value: ");
		int n= sc.nextInt();
		
		int row, col;
		for(row=0; row<n; row++) {
			//space
			for(col=0; col<n-row-1; col++) {
				System.out.print(" ");
			}
			//stars
			for(col=0; col<2*row+1;col++) {
				System.out.print("*");
			}
			//space
			for(col=0; col<n-row-1; col++) {
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		
			for(row=0; row<n; row++) {
				//space
				for(col=0; col<row; col++) {
					System.out.print(" ");
				}
				//stars
				for(col=0; col<2*n-(2*row+1);col++) {
					System.out.print("*");
				}
				//space
				for(col=0; col<row; col++) {
					System.out.print(" ");
				}
				System.out.println(" ");
			}
	}

}
