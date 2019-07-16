import java.util.*;

public class P_10950 {
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		
		int num[] = new int[test];
	
		for(int i = 0; i < test; i++) {
			int A = scan.nextInt();
			int B= scan.nextInt();
			num[i] = A+B;
		}
		
		for(int j = 0; j<test; j++) {
			System.out.println(num[j]);
		}	 
	}	
}