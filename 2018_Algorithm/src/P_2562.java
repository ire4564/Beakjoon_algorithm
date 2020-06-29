import java.util.*;

public class P_2562 {
	public static void main (String args[]) {
	
		Scanner scan = new Scanner(System.in);
		int array[] = new int[9];
		int index = 0;
		
		for(int i=0; i<9; i++) {
			array[i] = scan.nextInt();
		}
		
		int max = array[0];
		for(int i=0; i<9; i++) {
			if(max<array[i]) {
				max = array[i];
				index = i;
			}
		}
		
		System.out.println(max);
		System.out.println(index+1);
				
	}
}