import java.util.*;

public class P_10952 {
	public static void main (String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		int array[] = new int[100];
		int index = 0;
		int selecter = 1;
	
		while(selecter == 1) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			array[index] = A+B;
			if(array[index] == 0) {
				selecter = 0;
				break;
			} else {
				++index;
			}
		}
		
		for(int i=0; i<index; i++) {
			System.out.println(array[i]);
		}
		
		
	}
}