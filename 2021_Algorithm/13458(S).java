import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt(); //첫 번째 input
		int arr[] = new int[num];
		
		for(int i=0; i<num; i++) { //input만큼 입력받고 값 받기
			arr[i] = scan.nextInt();
		}
		
		int major = scan.nextInt(); //주감독 담당 수
		int sub = scan.nextInt(); //부 감독 담당 수
		
		long result = 0;
		
		for(int j=0; j<num; j++) {
			if(arr[j] <= major) {
				result++;
				continue;
			}
			else {	
				result++;
				arr[j] -= major;
				
				if(arr[j]%sub == 0) result += arr[j]/sub;
				else if(arr[j]%sub != 0) result += arr[j]/sub + 1;
			}
		}
		
		System.out.println(result);
		
	}
}
