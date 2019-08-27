import java.util.*;
import java.util.stream.IntStream;

public class Todays {
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		int roop = scan.nextInt(); //반복할 횟수
		String userNum[] = new String[10001];
		int checkIndex[] = new int[10001];
		String thisFinal[] = new String[roop];
		
		int index = 0;
		int finalIndex = 0;
		int userNumCheck = 0;
		
		int mill[] = new int[1001];
		mill = returnPrime(); //만까지의 소수를 다 구해서 저장
		
		for(int i=0; i<roop; i++) { //횟수만큼 반복해서 숫자 넣기
			userNumCheck = scan.nextInt();
			if(userNumCheck<4) {
				System.out.println("try again");
				userNumCheck = scan.nextInt();
			}else {
				//입력받은 숫자를 처리할 수 있을 때
				for(int k=0; k<mill.length; k++) {
					//10000까지의 소수 배열 안에서 작은수 부터 하나씩 뺴보며
					//그 수가 소수인지 아닌지를 판단
					if(userNumCheck<=mill[k]) { //mill 배열 안의 소수값이 기존의 소수값보다 더 클 경우
						break;
					} else {
						 //입력값-소수=소수일경우
						int checkThis = userNumCheck-mill[k];
						boolean contains = IntStream.of(mill).anyMatch(x -> x == checkThis);	
						if(contains == true) { //소수가 그 배열에 있다는 뜻
							userNum[index] = mill[k] + " " + checkThis;
							checkIndex[index] = checkThis - mill[k]; //차이가 가장 적게 나는 것을 출력하기 위해 차이를 넣는 배열 따로 선언
							
							if(index == roop-1) {
								int thisMin = minIndex(checkIndex); //최소값이 들어있는 인덱스
								thisFinal[finalIndex] = userNum[thisMin];
								System.out.println(thisFinal[finalIndex]);
								index = 0;
								finalIndex++;
								break;
							} else {
								++index;	
							}
						}
						
					}
				}	
			}
		}
	
	}
	public static int minIndex(int[] array) { //최소값 찾는 함수
		int min = array[0];
		int minIndex = 0;
		for(int i=0; i<array.length; i++) {
			if(min > array[i]) {
				min = array[i];
				minIndex = i;
			}
		}
		System.out.println(minIndex);
		return minIndex;
	}
	
	public static int[] returnPrime() {
		boolean isPrime[] = new boolean[10001];
		
		isPrime[0] = isPrime[1] = false;
		
		for(int i=2; i<=10000; i++) {
			isPrime[i] = true;
		}
		
		for(int i=2; i*i<=10000; i++) {
			int index = 2;
			if(isPrime[i]) {
				for(int j=i*index; j<=10000; j=i*index) {
					isPrime[j] = false;
					index++;
				}
			}
		}
		int thisPrime[] = new int[10001];
		int thisIndex = 0;
		for(int i=2; i<=10000; i++) {
			if(isPrime[i]) {
				thisPrime[thisIndex] = i;
				thisIndex++;
			}
		}
		return thisPrime;
	}
}