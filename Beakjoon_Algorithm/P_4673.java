import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


//셀프넘버는 생성자가 없다
//생성자란 자기자신+각자리 숫자=다른 숫자가 될 수 있는 경우에서의 자기 자신
//예를들어 33은 39의 생성자, 그러니까 39는 셀프넘버가 아니라는 뜻

//목적: 10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력하는 프로그램 작성


public class P_4673  {
	public static void main(String args[]) {
		
		int result[] = new int[10000]; //self_none_num
		int not_self[] = new int[10000];
		int loop = 0; //배열 출력을 위해 세는 index
		int select = 1;
		int index = 0;
		int no_array_index = 0;
		
		for(int numbers=0; numbers<10000; numbers++) {
			self_number(String.valueOf(numbers), result, numbers);
		} //만번 함수 반복
		
		Arrays.sort(result); //오름차순으로 정렬
		
		while(select == 1) {
			 if((index == 9999) || (loop == 10000)) { //범위를 초과했는지 안 초과했는지 확인
					select = 0;
					break;
			 } else if(result[index] == result[index+1]) { //다음 숫자 중복 체크
						++index;
						
				} else if(result[index] == loop) { //self 배열에 존재하는 수일 경우
					++index; //그냥 지나가기
					++loop;
				
				} else if(result[index] > loop) { //배열에 없는 수일 경우
					not_self[no_array_index] = loop;
					++no_array_index;
					++loop;
				}
			}
		
		//확인용 출력
		for(int i=0;  i<no_array_index; i++) {
			System.out.println(not_self[i]);
		}
		
	}

public static void self_number(String self, int result[], int index) { //숫자 넣기(현재 숫자), 결과를 담을 배열, index(현재 숫자)
	
	int divide[] = new int[5]; //한자리수씩 담을 숫자
	int is_self = Integer.valueOf(self); //연산 결과 나온 숫자, 자기 자신먼저 더해놓기
	
	for(int i=0; i<self.length(); i++) { //네 자리를 다 받아야 하기 떄문에 (만까지 자릿수가 5개)
		//System.out.println("self.charAt(i)" + (self.charAt(i) - '0'));
		divide[i] = self.charAt(i) - '0'; //'0'의 아스키코드 값을 주면 바로 char->int형 전환 가능
		is_self += divide[i];
	}
	
	result[index] = is_self; //해당하는 인덱스의 배열 안에 selft_none인 숫자를 담음

	
	//함수의 목적: 생성자가 없는 수를 걸러내고 출력하는 역할
	//for문으로 해결

	
	}
}