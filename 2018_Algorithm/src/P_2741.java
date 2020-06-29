import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class P_2741 {
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			for(int i=1; i<=num; i++) {
				bw.write(String.valueOf(i) + "\n");
			}
			bw.flush();
			bw.close();
		}catch(IOException ex) {
			System.out.println(ex);
		}

	}
}