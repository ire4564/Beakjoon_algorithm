import java.util.*;

public class P_10871 {
	public static void main (String args[]) {
		
		Scanner scan = new Scanner(System.in);
		int ary = scan.nextInt(); //배열 크기
		int num = scan.nextInt(); //비교 숫자
		 
		int array[] = new int[ary]; //배열 생성
		
		for(int k=0; k<ary; k++) { //배열 안에 수 넣기
			int numbers = scan.nextInt();
			array[k] = numbers;
		}
		
		for(int i=0; i<ary; i++) { //배열 검색
			if(array[i]<num) {
				System.out.print(array[i] +" ");
			}
		}	
		
	}
}