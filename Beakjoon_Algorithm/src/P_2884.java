import java.util.*;

public class P_2884 {
	public static void main(String args[]) {
	
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int M = scan.nextInt();
		
		if(M-45 < 0) { //만약 분에서 45분을 뺐는데 음수라면
			M = M - 45 + 60;
			H = H - 1;
		} else {
			M += -45;
		}
		
		if(H < 0) { //시간이 만약 음수라면
			H = H + 24;
		}
		
		System.out.println(H + " " + M);

	}
}
