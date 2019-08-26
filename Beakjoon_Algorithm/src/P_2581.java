import java.util.Arrays;
import java.util.Scanner;

public class P_2581 {
	public static void main(String args[]){
		int checks = 0;
		
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt(); //범위 입력받기
		int num2 = scan.nextInt();
		
		checkThis(num1, num2);	
		
	
	}
	
	public static void checkThis(int upNum, int downNum) {
		int check = 0;
		int checkArray[] = new int[downNum-upNum];
		int index = 0;
		for(int range=upNum; range<=downNum; range++) {
			if(range == 1) {
				
			}else {
				for(int devide=2; devide<=range; devide++) {
					int result = range%devide;
					if(result == 0) { //나눈 나머지가 0이 되었을 때
						if(devide == range) { //나눈 숫자와 나눠진 숫자가 같으면
							//소수 맞음
						check += range; //합을 구하기 위해
						checkArray[index] = range; //제일 작은 수를 찾기 위해
						++index; //index를 옮기기 위해
						} else {
							break;
						}
					} 
				}		
			}	
		}
		if(check == 0) {
			System.out.println(-1);
		} else {
			Arrays.sort(checkArray); //오름차순 정렬
			System.out.println(check); //총합
			for(int i=0; i<checkArray.length; i++) {
				if(checkArray[i] != 0) {
					System.out.println(checkArray[i]); //제일 작은 수
					break;
				}
			}
		}
		
	}
}