import java.util.*;

public class P_2588 {
	public static void main (String args[]) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int one = a * (b%10); //ÀÏÀÇÀÚ¸®¶û °öÇÑ °Í
		int ten = a * ((b%100)/10); //½ÊÀÇ ÀÚ¸®¶û °öÇÑ °Í
		int hun = a * (b/100); //¹éÀÇÀÚ¸®¶û °öÇÑ °Í
		
		
		//System.out.println((b%10));
		//System.out.println(((b%100)/10));
		//System.out.println(b/100);
		
		System.out.println(one);
		System.out.println(ten);
		System.out.println(hun);
		System.out.println(one+ten*10+hun*100);
		
	}
}