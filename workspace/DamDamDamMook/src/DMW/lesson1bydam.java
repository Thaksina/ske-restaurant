//package DMW;
//
//public class lesson1bydam {
//	
//	 public static void main (String[] args)
//	    {int [][] a = {{90,5,12,-3},{-8,15,-7,52},{0,23,-8,1}};
//	    
//	        
//
//
//	        System.out.println("Matrix is");
//	        for(int i=0 ; i<3 ; i++){
//	        	
//	        	for(int j=0 ; j<4 ; j++){
//	        		System.out.printf("  %2d",a[i][j]);
//	        	}
//	        System.out.println();}
//
//	    }
//	}

package DMW;
import java.util.Scanner;

public class lesson1bydam {
	public static void main(String[] args) {
		double sum = 0;
		Scanner Scan = new Scanner (System.in);
		System.out.print("How many students? ");
		int students = Scan.nextInt();
		System.out.print("How many tests? ");
		int test = Scan.nextInt();
		
		double [][] a = new double[students][test];
		
		
		
		for(int i = 0 ; i<students ;i++){
			for(int j = 0 ; j<test ;j++ ){
				System.out.printf("Enter test%d score of student%d: ",j+1,i+1);
				a[i][j] = Scan.nextDouble();

			}
			
		}
		
		double [] highest = new double[test];
		int [] studentnum = new int [test];
		
		for (int i = 0 ; i < test ; i++){
			
			for (int j = 0 ; j < students ; j++){
				if(j==0 || a[j][i]>highest[i]){
					highest[i] = a[j][i];
					studentnum[i] = j+1;
				}
			}
		}
		
		for(int i = 0 ; i<test ;i++){
			System.out.printf("Test%d: Student%d receives highest score = %.2f%n",i+1,studentnum[i],highest[i]);
		}
		
		
		
//		System.out.print("Find average of which test: ");
//		int averfind = Scan.nextInt();
//		
//		for(int i = 0 ; i<students ; i++){
//		sum = sum + a[i][averfind-1];
//		}
//		double aver = sum/students;
//		
//		System.out.printf("Average of test%d = %.2f",averfind,aver);
//		
		
		
		
		
		
		
//		System.out.print("Find average of which test: ");
//		int averfind = Scan.nextInt();
//		double avr = sum/averfind;
//		System.out.printf("Average of test1 = ");
//		
		
		

		
		
		
		
		
		
//		System.out.println("Score table is");
//		
//		System.out.print("     ");
//		for(int k = 0 ; k<students ; k++){
//		System.out.printf(" Student%d",k+1);}
//		
//		System.out.println();
//		
//		for(int i=0 ; i<test ; i++){
//			System.out.printf("test%d",i+1);
//			for(int j = 0 ; j<students ; j++){
//			System.out.printf("%9.1f",a[j][i]);
//			}
//			System.out.println("");
//			
//			
//		}
		
		
		
		
		
		
		
		
	}

}