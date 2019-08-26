import java.util.Scanner;

public class P_1929 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt(); //범위 입력받기
		int num2 = scan.nextInt();
		
		boolean isPrime[] = new boolean[1000001];
		
		isPrime[0] =  isPrime[1] = false;
		//첫번쨰와 두번째 칸은 false로 남겨둔다
		//인덱스가 곧 숫자라는 것을 명심한다
		for(int i=2; i<=num2; i++) {
			isPrime[i] = true;
			//범위까지 해당 인덱스를 true로 바꿔준다
		}
		
		//에라토스테네스의 체 방법을 이용함/ n루트까지만 확인하면 되는 것
		for(int i=2; i*i<=num2; i++) {
			int index = 2;
			if(isPrime[i]) {
				for(int j=i*index; j<=num2; j=i*index) { //각각의 배수들을 없애주는 역할
					isPrime[j] = false;
					index++;
				}
			}
		}
		for(int i=num1; i<=num2; i++) {
			if(isPrime[i]) {
				System.out.println(i);
			}
		}
		
	}
}