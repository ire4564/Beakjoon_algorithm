import java.util.Scanner;

public class P_2675 {
    public static void main (String args[]) {
    	
    	Scanner scan = new Scanner(System.in);
    	int howMuch = scan.nextInt(); //몇번 입력할것인지 횟수
    	
    	int whatTime[] = new int[howMuch]; //반복할 횟수 입력
    	String Double[] = new String[howMuch]; //반복하여 바뀐 문자열 P
    	 
    	for(int i=0; i<howMuch; i++) { //우선 각각 반복할 횟수와 문자열을 입력받는다
    		whatTime[i] = scan.nextInt();
    		Double[i] = scan.next();
    	}
    	
    	for(int a=0; a<howMuch; a++) {
    		char strings[] = new char[Double[a].length()]; //그 문자열의 길이만큼 char형 배열을 만들고
    		for(int snum=0; snum<Double[a].length(); snum++) {
    			strings[snum] = Double[a].charAt(snum); //문자열을 한글자씩 분리해서 배열에 넣기
    		}
    			
    			int allTime = whatTime[a]*(Double[a].length()); //원래 문자 크기*횟수
    			char newString[] = new char[allTime];//원래 있던 배열의 크기 곱하기 횟수한 만큼의 char 배열 생성
    			
    			int index = 0;
    			for(int all=0; all<strings.length; all++) { //문자열 개수만큼 반복
    				for(int b=0; b<whatTime[a]; b++) {
        				newString[index] = strings[all];
        				++index;
    				}
    			}
    		for(int fin=0; fin<newString.length; fin++) {
    			System.out.print(newString[fin]);
    		}
    		System.out.println(" ");
    	}
    }
}