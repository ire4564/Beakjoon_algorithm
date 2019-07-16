import java.util.*;

public class P_10817 {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		int[] num = new int[3];
		int save = 0;
		
		num[0] = A;
		num[1] = B;
		num[2] = C;
		
		if(num[1]>num[2]) {
			save = num[1];
			num[1] = num[2];
			num[2] = save;
		}
		
		if(num[0]>num[1]) {
			save = num[0];
			num[0] = num[1];
			num[1] = save;
		} 
		
		if(num[1]>num[2]) {
			save = num[2];
			num[2] = num[1];
			num[1] = save;
		}
		
		System.out.println(num[1]);
		
		 
	}
			
		
}
