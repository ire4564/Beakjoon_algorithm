import java.util.Scanner;

public class P_2798 {
	public static void main(String args[]) {
		int index = 0;
		int first = 0;
		int second = 1;
		
		Scanner scan = new Scanner(System.in);
		int time = scan.nextInt(); //몇번 받나
		int numArr[] = new int[time];
		int allhow = (time*(time-1)*(time-2))/6; 
		//몇까지의 경우의 수가 있는지 
		int threeAdd[] = new int[allhow]; //경우의 수 담을 배열
		
		int sum = scan.nextInt(); //얼마의 합을 찾는지
		
		for(int i=0; i<time; i++) {
			numArr[i] = scan.nextInt(); //숫자를 입력받고
		}
		
		while(true){
			if(second == time-1) {
				first++;
				second = first + 1;
			}
			if(first == time-3) {
				threeAdd[index] = numArr[time-1] + numArr[time-2] + numArr[time-3];
				//마지막 숫자들 세 개 더하고 끝내기
				break;
			}
			
			for(int three = second+1; three<time; three++) {
				threeAdd[index] = numArr[first] + numArr[second] + numArr[three];
				index++;
			}
			second++;
		}
		
		int check[] = new int[allhow];
		for(int i=0; i<allhow; i++) {
			int thisis = threeAdd[i] - sum;
			if(thisis<0) { //음수이면
				thisis = thisis * -1;
			}
			check[i] = thisis;
		}//가장 작은 값을 찾아내기
		
		int min = 400000; 
		int thisCheck = 1;
		int thisIndex = 0;
		for(int i=0; i<allhow; i++) {
			if(check[i] == 0) {
				thisCheck = 0;
				break;
			}else if(check[i] < min) {
				//체크 배열 안에 있는 값이 min 값보다 작으면
				if(threeAdd[i] < sum) {
					min = check[i]; //인덱스 불러오기
					thisIndex = i;	
				}
			} else if(check[i] == min) { //같은 값인데
				if(threeAdd[i] < sum) {
					min = check[i];
					thisIndex = i;
				}
				//아니면 그대로
			}
		}
		
		if(thisCheck == 1) {
			System.out.println(threeAdd[thisIndex]);	
		} else {
			System.out.println(sum);
		}	
		
	}
}
