
public class test {
	public void main (String[]args) {

		boolean isPrime[] = new boolean[10001];
		
		isPrime[0] = isPrime[1] = false;
		
		for(int i=2; i<=10000; i++) {
			isPrime[i] = true;
		}
		
		for(int i=2; i*i<=10000; i++) {
			int index = 2;
			if(isPrime[i]) {
				for(int j=i*index; j<=10000; j=i*index) {
					isPrime[j] = false;
					index++;
				}
			}
		}
		int thisPrime[] = new int[10001];
		int thisIndex = 0;
		for(int i=2; i<=10000; i++) {
			if(isPrime[i]) {
				//thisPrime[thisIndex] = i;
				//thisIndex++;
				System.out.println(i);
			}
		}
		//return thisPrime;
		}
	}

