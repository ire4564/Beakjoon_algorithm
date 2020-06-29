import java.util.*;
import java.util.stream.IntStream;

public class P_4153 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int number[] = new int[3];
		String result[] = new String[100];
		int index = 0;
		
		while(true) {
			for(int i=0; i<3; i++) {
				number[i] = scan.nextInt();
			} //숫자를 받고
			if(number[0] == 0 && number[1] == 0 && number[2] == 0) {
				//입력값이 모두 0이면
				break;
			} else {
				Arrays.sort(number);
				result[index] = RnW(number);
				index++;
			}
		}
		
		for(int i=0; i<index; i++) {
			System.out.println(result[i]);
		}
		
	
	
	}
	public static String RnW(int number[]) {
		int squad = number[0]*number[0] + number[1]*number[1];
		if(squad == number[2]*number[2]) {
			return "right";
		} else {
			return "wrong";
		}
	}
}