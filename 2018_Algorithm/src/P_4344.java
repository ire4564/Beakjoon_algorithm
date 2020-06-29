import java.util.Scanner;

public class P_4344 {
	   public static void main (String args[]) {

	      Scanner scan = new Scanner(System.in);
	      int cycle = scan.nextInt();
	      double sum = 0;
	      double student = 0;
	     
	      for(int i=0; i<cycle; i++) { //cycle번 반복
	    	  
	    	  int array_num  = scan.nextInt();
	    	  double array[] = new double[array_num];
	    	 System.out.println("array_num : " +array_num);
	    	  
	    	  for(int j=0; j<array_num; j++) {
	    		  array[j]= scan.nextDouble();
	    	 System.out.println("array [" + j +"]" + array[j]);
	    	  }
	    	  for(int k=0; k<array_num; k++) {
	    		  sum += array[k];
	    	  }
	    	 System.out.println("sum : " + sum);
	    	  double average = sum/array_num;
	    	 System.out.println("average: " + average);
	    	  for(int a=0; a<array_num; a++) {
	    		  if(array[a]> average) {
	    			  ++student;
	    		  } //평균보다 큰 애들 수
	    	  }
	    	 System.out.println("student: " + student);
	    	  System.out.println(String.format("%.3f", Double.valueOf(student/array_num*100)) + "%");
	    	  
	    	  sum = 0;
	    	  student = 0;
	      }
	     }
	  }
