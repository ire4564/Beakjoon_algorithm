import java.util.*;

public class P_1546 {
	public static void main (String args[]) {
		
		double max = 0;
		double sum = 0;
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		double score[] = new double[num];
		
		for(int i=0; i<num; i++) { //입력받은 값 배열에 넣기
			score[i] = scan.nextInt();
		}
		
		for(int i=0; i<num; i++) { //최대값 찾기
			if(max < score[i]) {
				max = score[i];
			}
		}
		
		for(int i=0; i<num; i++) {
			score[i] = score[i]/max*100;
		}
		
		for(int i=0; i<num; i++){
			sum += score[i];
		}
		
		System.out.println(sum/num);
	}
}