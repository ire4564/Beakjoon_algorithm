import java.util.*;

public class P_2577 {
	public static void main (String args[]) {
	
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int sum = a*b*c;
		String same = " " + sum; //문자로 형변환
		String numbers[] = new String[same.length()]; //문자로 형변환 한 만큼 크기의 배열 생성
	
		for(int i=0; i<same.length(); i++) {
			numbers[i] = String.valueOf(same.charAt(i));
		}
		
		int one = 0, two=0, three=0, four=0, five=0, six=0, seven=0, eight=0, nine=0, ten=0, zero=0;
		
		for(int i=0; i<same.length(); i++) {
			switch(numbers[i]){
			case "0": ++one;
					  break;
			case "1": ++two;
			  break;
			case "2": ++three;
			  break;
			case "3": ++four;
			  break;
			case "4": ++five;
			  break;
			case "5": ++six;
			  break;
			case "6": ++seven;
			  break;
			case "7": ++eight;
			  break;
			case "8": ++nine;
			  break;
			case "9": ++zero;
			  break;
				}
			}
		
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);
		System.out.println(five);
		System.out.println(six);
		System.out.println(seven);
		System.out.println(eight);
		System.out.println(nine);
		System.out.println(zero);
	
	}
}