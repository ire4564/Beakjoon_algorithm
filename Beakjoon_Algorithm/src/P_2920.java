import java.util.*;

public class P_2920 {
	public static void main (String args[]) {
	
		Scanner scan = new Scanner(System.in);
		int array[] = {1, 2, 3, 4, 5, 6, 7, 8};
		int piano[] = new int[8];
		int as = 0;
		int de = 0;
		int none = 0;
		
		for(int i=0; i<8; i++) {
			piano[i] = scan.nextInt();
		}
		
		for(int j=0; j<8; j++) {
			if(piano[j] == array[j]) {
				++as;
			} else if(piano[j] == array[7-j]) {
				++de;
			} else {
				++none;
			}
		}
		
		if(as == 8) {
			System.out.println("ascending");
		} else if(de == 8) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
	}
}