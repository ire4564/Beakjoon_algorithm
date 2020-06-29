import java.util.Scanner;
import java.util.Arrays;

public class P_1577 {
    public static void main (String args[]) {
    	int alpha[] = new int[26]; //알파벳 배열 만들기
    	
    	Scanner scan = new Scanner(System.in);
    	String word = scan.next();
    	
    	word = word.toLowerCase(); //모두 소문자로 변환
    	
    	if(word.length() == 1) { //문자가 하나만 입력된 경우
    		System.out.println(word.toUpperCase());
    		System.exit(0);
    	}
    	
    	for(int i=0; i<word.length(); i++) { //문자 길이만큼 돌면서
    		alpha[Integer.valueOf(word.charAt(i))-'a']++;
    	} //해당 문자열의 인덱스에 접근해서 ++시키기
    	
    	int max = -1; //최대값 찾기
    	int index = 0;
    	int overlap = 0;
    	for(int a=0; a<26; a++) {
    		if(max == alpha[a]) { //중복 값 발견시 overlap = 1
    			overlap = 1;
    		} else if(max<alpha[a]) {
    			max = alpha[a];
    			index = a; //알파벳을 파악하기 위해
    			overlap = 0;
    		} 
    	}
    	if(overlap == 1) { //중복 값이 있었으면
    		System.out.println("?");
    	} else {
    		int final_alpha = index+'a';
        	System.out.println(Character.toString((char)final_alpha).toUpperCase());
    	}
    	
    }
}

