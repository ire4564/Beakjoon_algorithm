import java.util.*;

public class P_2439 {
	public static void main (String args[]) {
		
		Scanner scan = new Scanner(System.in);
		int star = scan.nextInt();
		
		for(int j=0; j<star; j++) {
			for(int i=2; i<=star-j; i++) {
				System.out.print(" ");
			} 
			for(int k=0; k<=j; k++) {
				System.out.print("*");
			}
			System.out.println(" ");
					
		}
		
	}
}