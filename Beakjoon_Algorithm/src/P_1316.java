import java.util.Scanner;
import java.util.Arrays;

public class P_1316 {
    public static void main (String args[]) {
    	
    	Scanner scan = new Scanner(System.in);
    	int cycle = scan.nextInt();
    	int count = cycle; //단어의 개수
    
    	String words[] = new String[cycle];
    	for(int t=0; t<cycle; t++) {
    		words[t] = scan.next();
    	} //각각 배열에 삽입하기

    	int over = 0;
    	for(int c=0; c<cycle; c++) { //돌면서 각 배열마다 검사
    		int key = words[c].length();
    		char check[] = new char[key];
    		for(int chars=0; chars<key; chars++) {
    				check[chars] = words[c].charAt(chars);
    				//char 배열에 한 글자씩 분리해서 넣기
    			}
    		char overlap[] = new char[key]; //비교용 배열
    		
    		for(int a=0; a<key; a++) { //중복되지 않은 숫자는 새로운 배열에 넣기
    			for(int b=0; b<key; b++) {
    				if(check[a] == overlap[b]) {
    					if(a == b) { //인덱스가 같은 경우는 패스
    						break;
    					} else {
    						if(a == b+1) { //검사 배열의 인덱스 + 1이 현재 인덱스 값인지 확인
        						overlap[b] = ' '; //공백으로 두고
        						overlap[b+1] = check[a];//문자열 옮기기
        					} else {
        						++over;
        						//그룹단어가 아님
        					}
    					}
    				} else {
    					overlap[a] = check[a];
    				}
    			}
    		}
    		
    		if(over != 0) {
    			//그룹 단어가 아님
    			--count;
    		}
    		over = 0;//초기화
    	}
    	
    	System.out.println(count);
    }
}

