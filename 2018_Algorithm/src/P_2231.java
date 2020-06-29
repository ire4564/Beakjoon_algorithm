import java.util.Scanner;

public class P_2231 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int result = 0;
		
		for(int i=num; i>0; i--) {
			String newNum = String.valueOf(i-1);
			int size = newNum.length(); //문자의 개수만큼
			int sum = 0;
			
			for(int j=0; j<size; j++) {
				sum += Integer.parseInt(String.valueOf(newNum.charAt(j)));
			}
			
			if(Integer.valueOf(newNum) == num - sum) {
				result = Integer.valueOf(newNum);
			}
		}
		
		if(result == 0) {
			System.out.println(0);
		} else {
			System.out.println(result);
		}
		
	}
}