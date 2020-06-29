import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class P_15552 {
	public static void main(String args[]) throws Exception {
	
		try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))){
			int test = Integer.parseInt(bf.readLine());
			int num[] = new int[test];
			
			for(int i = 0; i < test; i++) {
				StringTokenizer st = new StringTokenizer(bf.readLine());
				int A = Integer.parseInt(st.nextToken());
				int B= Integer.parseInt(st.nextToken());
				num[i] = A+B;
				//st.nextToken()bf.readLine()
			}
			bf.close();
			
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			for(int j = 0; j<test; j++) {
				bw.write(String.valueOf(num[j])+ "\n");
			}
			bw.flush();
			bw.close();
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		catch (IOException ex) {
			System.out.println(ex);
		}
	}	
}