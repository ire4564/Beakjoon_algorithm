import java.util.Scanner;

public class P_1065 {
	public static void main(String args[]) {
		int oneNum = 0;
		//int check[] = new int[100];
		//int index = 0;
		
		Scanner scan = new Scanner(System.in);
		int lang = scan.nextInt();
		
		for(int num=1; num<=lang; num++) { //1부터 입력받은 숫자까지 세기
			if(num>0 && num<100) { //만약 num이 1~98사이라면 한수이니 통과
				++oneNum;
			} else if(num>=100) { //num이 두자리 수를 넘으면 (세자리 숫자)
				//자릿수 나눠서 사이값 체크하기
				if(devide100(num) == 1) {
					++oneNum;
					//check[index] = num;
					//++index;
				}	
			}
		}
		System.out.println(oneNum);
		
	}
	//세자리일떄
	public static int devide100(int num) {
		int num100, num10, num1; //천의 자리 백의자리 십의자리 일의 자리
		int A, B;
		
		num100 = num/100;
		num10 = (num % 100) / 10; 
		num1 = num - ((num100 * 100) + (num10 * 10));
		
		if((num100 == num1) && (num100 != num10)) {
			return 0;
		} else { //같은 자릿수 숫자가 아니면
		
		A = num1- num10; //1의 차이
		B = num10 - num100; //2의 차이
		
		if(A<0 && B<0) {
			A = A * -1;
			B = B * -1;
		} else if(A<0) { //음수이면 처리
			A = A * -1;
		} else if(B<0) {
			B = B * -1;
		}
		
		if(A==B) {
			return 1; //두개의 차이가 같을 떄
		}else {
			return 0; //차이가 같지 않으면 0을 리턴
			}
		}
	}

}


