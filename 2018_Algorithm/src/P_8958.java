import java.util.*;

public class P_8958 {
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String ox[] = new String[num];
		
		for(int i=0; i<num; i++) {
			ox[i]= scan.next();
		}
		scan.close();

		int score, count;
		for(String oxString : ox) {
			score = 0;
			count = 0;
			for(int i=0; i<oxString.length(); i++) {
				if(oxString.charAt(i) == 'O') {
					score += ++count;
				} else {
					count = 0;
				}
			}
			System.out.println(score);
		}

	}
	
}
