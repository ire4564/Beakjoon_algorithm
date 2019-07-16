import java.util.*;

public class P_2438 {
	public static void main (String args[]) {
		
		Scanner scan = new Scanner(System.in);
		int star = scan.nextInt();
		
		for(int i=0; i<star; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
