import java.util.*;
import java.util.stream.IntStream;

public class P_3009 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int spotX[] = new int[3]; //X축 값
		int spotY[] = new int[3]; //Y축 값
		
		int indexX = 0; int indexY = 0;
		
	for(int i=0; i<6; i++) {
		if(i%2 == 0) {
			//짝수일경우 0 2 4
			spotX[indexX] = scan.nextInt();
			indexX++;
		} else {
			//홀수일 경우 1 3 5
			spotY[indexY] = scan.nextInt();
			indexY++;
		}
	}//꼭짓점 6개를 넣는다
	
	Arrays.sort(spotX);
	Arrays.sort(spotY);
	
	for(int x=0; x<3; x++) {
		if(spotX[0] != spotX[1]) {
			System.out.println(spotX[0]);
			break;
		} else if(spotX[1] != spotX[2]) {
			System.out.print(spotX[2] + " ");
			break;
		}
	}
	for(int x=0; x<3; x++) {
		if(spotY[0] != spotY[1]) {
			System.out.println(spotY[0]);
			break;
		} else if(spotY[1] != spotY[2]) {
			System.out.println(spotY[2]);
			break;
		}
	}
	
	
	}
}
