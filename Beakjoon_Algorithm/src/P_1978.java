import java.util.*;

public class P_1978 {
	public static void main(String args[]){
		int checks = 0;
		
		Scanner scan = new Scanner(System.in);
		int howMany = scan.nextInt(); //몇번 입력받을건지

		for(int i=0; i<howMany; i++) {
			int numbers = scan.nextInt();
			checks += checkThis(numbers);
		} //입력받은 값 넣기
		
		System.out.println(checks);
	}
	
	public static int checkThis(int thisNum) {
		int check = 0;
		if(thisNum == 1) {
			return 0;
		}else {
			for(int devide=2; devide<=thisNum; devide++) {
				int result = thisNum%devide;
				if(result == 0) { //나눈 나머지가 0이 되었을 때
					if(devide == thisNum) { //나눈 숫자와 나눠진 숫자가 같으면
						//소수 맞음
					check = 1;
					} else {
						break;
					}
				} 
			}		
		}
		return check;
	}
}