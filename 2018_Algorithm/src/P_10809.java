import java.util.Scanner;

public class P_10809 {
    public static void main (String args[]) {
    	int[] alpha = new int[26];
    	
    	for(int i=0; i<26; i++) {
    		alpha[i] = -1; //기본으로 -1을 모두 채우고
    	}
    	
    	Scanner scan = new Scanner(System.in);
    	String some = scan.next();
    	char one_alpha[] = new char[some.length()]; //알파벳을 잘라서 저장
    	
    	for(int a=0;a<some.length(); a++) {
    		one_alpha[a] = some.charAt(a); //한 글자씩 넣기
    		for(int b=0;b<a; b++) {
    			if(one_alpha[b] == some.charAt(a)) { //이미 존재하는 값이었다면
    				one_alpha[a] = ' '; //공백 삽입
    			}
    		}
    	}
    	
    	for(int j=0;j<some.length(); j++) {
    	switch (one_alpha[j]) {
		case 'a': 
			alpha[0] = j; //현재 인덱스 번호 넣기
			break;
		case 'b': 
			alpha[1] = j; //현재 인덱스 번호 넣기
			break;
		case 'c': 
			alpha[2] = j; //현재 인덱스 번호 넣기
			break;
		case 'd': 
			alpha[3] = j; //현재 인덱스 번호 넣기
			break;
		case 'e': 
			alpha[4] = j; //현재 인덱스 번호 넣기
			break;
		case 'f': 
			alpha[5] = j; //현재 인덱스 번호 넣기
			break;
		case 'g': 
			alpha[6] = j; //현재 인덱스 번호 넣기
			break;
		case 'h': 
			alpha[7] = j; //현재 인덱스 번호 넣기
			break;
		case 'i': 
			alpha[8] = j; //현재 인덱스 번호 넣기
			break;
		case 'j': 
			alpha[9] = j; //현재 인덱스 번호 넣기
			break;
		case 'k': 
			alpha[10] = j; //현재 인덱스 번호 넣기
			break;
		case 'l': 
			alpha[11] = j; //현재 인덱스 번호 넣기
			break;
		case 'm': 
			alpha[12] = j; //현재 인덱스 번호 넣기
			break;
		case 'n': 
			alpha[13] = j; //현재 인덱스 번호 넣기
			break;
		case 'o': 
			alpha[14] = j; //현재 인덱스 번호 넣기
			break;
		case 'p': 
			alpha[15] = j; //현재 인덱스 번호 넣기
			break;
		case 'q': 
			alpha[16] = j; //현재 인덱스 번호 넣기
			break;
		case 'r': 
			alpha[17] = j; //현재 인덱스 번호 넣기
			break;
		case 's': 
			alpha[18] = j; //현재 인덱스 번호 넣기
			break;
		case 't': 
			alpha[19] = j; //현재 인덱스 번호 넣기
			break;
		case 'u': 
			alpha[20] = j; //현재 인덱스 번호 넣기
			break;
		case 'v': 
			alpha[21] = j; //현재 인덱스 번호 넣기
			break;
		case 'w': 
			alpha[22] = j; //현재 인덱스 번호 넣기
			break;
		case 'x': 
			alpha[23] = j; //현재 인덱스 번호 넣기
			break;
		case 'y': 
			alpha[24] = j; //현재 인덱스 번호 넣기
			break;
		case 'z': 
			alpha[25] = j; //현재 인덱스 번호 넣기
			break;
		default:
			break;
			}
    	}
    	
    	for(int all=0;all<26; all++) {
    		System.out.print(alpha[all] + " ");
    	}
    
    	
    }
}