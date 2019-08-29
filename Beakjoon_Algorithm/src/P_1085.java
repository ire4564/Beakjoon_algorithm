import java.util.*;
import java.util.stream.IntStream;

public class P_1085 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int postion[] = new int[4];
		for(int i=0; i<4; i++) {
			postion[i] = scan.nextInt();
		} //수들을 받아와서 각각 위치에 넣어준다. 중x 중Y 오X 오Y
		
		int thisPosition[] = new int[4]; //차이들을 담기 위한 배열
		
		thisPosition[0] = postion[0] - 0;
		thisPosition[1] = postion[2] - postion[0];
		thisPosition[2] = postion[3] - postion[1];
		thisPosition[3] = postion[1] - 0;
		
		Arrays.sort(thisPosition);
		
		System.out.println(thisPosition[0]);
	}
}