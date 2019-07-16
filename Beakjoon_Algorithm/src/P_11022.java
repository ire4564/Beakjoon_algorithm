import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class P_11022 {
	public static void main(String args[]) {
		
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum[] = new int[num];
		int A[] = new int[num];
		int B[] = new int[num];
		
		for(int i=0; i<num; i++) {
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			A[i] = num1;
			B[i] = num2;
			sum[i] = num1+num2;
		}
		
		try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			for(int i=0; i<num; i++) {
				bw.write("Case #" + (i+1) + ": " + A[i] + " + " + B[i] + " = " + String.valueOf(sum[i])+ "\n");
			}
			bw.flush();
			bw.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}

}
