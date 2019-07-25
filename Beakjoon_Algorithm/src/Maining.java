import java.util.Scanner;

public class Maining {
	public static void main(String args[]) {
		int square = 1; //3의 제곱 횟수
		
		Scanner scan = new Scanner(System.in);
		int star = scan.nextInt();
		
		for(int round = 0; round<star; round++) {
			if(round%3 != 0) { //3의 배수가 아니라면 반복 출력
				for(int N = 0; N<star; N++) {
					System.out.print("*");
				}
				System.out.println(" ");
				System.out.print("*");
				for(int A = 0; A<(star-3)/3; A++) {
					System.out.print(" **");
				}
				System.out.print(" *");
				System.out.println(" ");
			} else if(round%3 == 0) { //빈 곳 출력하기
				for(int i=0; i<square; i++) {
					threeGo();
				} for(int i=0; i<square; i++) {
					threeRemove();
				}
				System.out.println(" "); //dma....
			}
			
		}
	}

	public static void threeGo() { //그냥 가기
		System.out.print("***");
	}
	public static void threeRemove() { //지우기
		System.out.print("   ");
	}
}
