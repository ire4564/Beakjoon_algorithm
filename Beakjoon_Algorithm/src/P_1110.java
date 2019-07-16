import java.util.*;

public class P_1110 {
	public static void main (String args[]) {
		
		Scanner scan = new Scanner(System.in);
		int S[] = new int[2]; //고정	
		int A[] = {0, 0};
		int B[] = {0, 0};
		int swich = 1; //(S[0]==B[0])&&(S[1]==B[1])
		int cycle = 1;
		
		int first = scan.nextInt();
	
		S[0] = first/10; //처음 숫자의 십의자리
		S[1] = first - (10 * S[0]); //처음 숫자의 일의 자리

		A[0] = first/10; //십의자리
		A[1] = first - (10 * A[0]); // 일의 자리
		
		while(swich == 1) { //숫자가 같을 때까지 반복
			
			int number = A[0] + A[1];
			
			if(number<10) {
				B[0] = A[1];
				B[1] = number;
			} else {
				B[0] = A[1];
				B[1] = number - (10 * (number/10));
			}
			
			if((S[0]==B[0])&&(S[1]==B[1])) {
				swich = 0;
				break;
			} else {
				A[0] = B[0];
				A[1] = B[1];
				++cycle;
			}
		}
		
		System.out.println(cycle);
	
	}
}