import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class P_11021 {
	public static void main(String args[]) {
		
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum[] = new int[num];
		
		for(int i=0; i<num; i++) {
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			sum[i] = num1+num2;
		}
		
		try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			for(int i=0; i<num; i++) {
				bw.write("Case #" + (i+1) + ": " + String.valueOf(sum[i])+ "\n");
			}
			bw.flush();
			bw.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}

}