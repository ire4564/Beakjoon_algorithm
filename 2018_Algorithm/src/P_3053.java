import java.util.*;
import java.util.stream.IntStream;

public class P_3053 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		//반지름 입력받기
		
		//일반 반지름을 이용해 구하기
		String ordin = String.format("%.6f", Math.PI*r*r);
		System.out.println(ordin);
		
		//유클리드 기하학
		//입력받은 숫자를 좌표로 본다
		String ucl = String.format("%.6f", (double)r*r*2);
		System.out.println(ucl);
	}
}
