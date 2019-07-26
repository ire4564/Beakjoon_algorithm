import java.util.Scanner;

public class P_11720 {
    public static void main (String args[]) {
    	int sum = 0;
    	
    	Scanner scan = new Scanner(System.in);
    	int scale = scan.nextInt();
    	int numbers[] = new int[scale]; //넣을 배열
    	
    	String num_string = scan.next(); //한번에 문자열로 받기
    	
    	for(int i = 0; i<scale; i++) { //String 문자열 int로 변환하기
    		numbers[i] = Integer.parseInt(String.valueOf(num_string.charAt(i)));
    		sum += numbers[i];
    	}
    	
    	System.out.println(sum);
    }
}