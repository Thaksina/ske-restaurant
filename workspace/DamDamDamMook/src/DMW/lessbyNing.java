package DMW;

import java.util.Scanner;

public class lessbyNing {
	
	public static void ShowMatrix(double matrix[][]){
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int rows = Scan.nextInt();
		System.out.print("Enter number of columns: ");
		int columns = Scan.nextInt();
		double [][] matrix = new double[rows][columns];
		System.out.println("Enter your matrix:");
		for (int i = 0 ; i<rows ; i++){
			for(int j = 0 ; j<columns ; j++){
				matrix [i][j] = Scan.nextDouble();
			}
		}
		
		while(0==0){
			System.out.print("Enter command: ");
			String command = Scan.next();
			if(command.equals("SHOW")){
				System.out.println("Current matrix is: ");
				
				for(int i = 0 ; i<rows ; i++){
					System.out.print("|");
					for (int j = 0 ; j<columns ; j++){
						System.out.printf("%8.2f",matrix[i][j]);
					}System.out.print("|");
					System.out.println();
					}
				}
			
				else if (command.equals("+")){
					int row = Scan.nextInt();
					int plus = Scan.nextInt();
					System.out.printf("Success row operation, row%d is updated",row);
					for(int i = 0 ; i<columns ; i++){
					matrix[row][i]	= matrix[row][i] + plus;
					
					
					}System.out.println();
					
				}
				else if (command.equals("-")){
					int row = Scan.nextInt();
					int plus = Scan.nextInt();
					System.out.printf("Success row operation, row%d is updated",row);
					for(int i = 0 ; i<columns ; i++){
					matrix[row][i]	= matrix[row][i] - plus;
					
					
					}System.out.println();
					
				}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
//
//import java.util.Scanner;
//
//public class lessbyNing {
//	public static void main(String[] args) {
//		Scanner Scan = new Scanner(System.in);
//		System.out.print("Input #rows? " );
//		int row = Scan.nextInt();
//		System.out.print("Input #columns? ");
//		int columns = Scan.nextInt();
//		int[][] ele = new int [row][columns];
//		
//		for(int i=0 ; i<row ; i++){
//			for(int j = 0 ; j<columns ; j++){
//				System.out.printf("Input element[%d][%d]: ",i+1,j+1);
//				ele[i][j] = Scan.nextInt();
//				
//				
//			}
//		}
//		
//		System.out.println("Matrix A is");
//		for(int i =0 ;i<row ; i++ ){
//			for(int j = 0 ; j<columns ; j++){
//				
//				System.out.printf("%5d",ele[i][j]);
//			}System.out.println();
//		}
//		
//		System.out.print("Print row(r) or column(c)? ");
//		String corr = Scan.next();
//		if(corr.equals("r")){
//			System.out.print("Input row number: ");
//			int rownum = Scan.nextInt();
//			for(int i = 0 ; i<columns ; i++){
//				System.out.printf("%5d",ele[rownum-1][i]);
//			}
//		}
//			else if(corr.equals("c")){
//				System.out.print("Input column number: ");
//				int colnum = Scan.nextInt();
//				for(int i = 0 ; i<row ; i++){
//					System.out.printf("%5d",ele[i][colnum-1]);
//			
//		}
//	
//	}
//
//	}
//}
//
//
//
//
//
//
//
//

//
//import java.util.Scanner;
//
//public class lessbyNing {
//	public static void main(String[] args) {
//		Scanner Scan = new Scanner(System.in);
//		int sum = 0;
//		System.out.print("Input n: ");
//		int input = Scan.nextInt();
//		int [][] element = new int [input][input];
//		for(int i = 0 ; i<input ; i++){
//			for(int j = 0 ; j<input ; j++){
//				System.out.printf("Input element[%d][%d]: ",i+1,j+1);
//				element [i][j] = Scan.nextInt();
//				if(i==j){
//					sum = sum + element[i][j];
//				}
//				
//			}
//		}
//		
////		System.out.println("Matrix A is");
////		for(int i =0 ;i<input ; i++ ){
////			for(int j = 0 ; j<input; j++){
////				
////				System.out.printf("%5d",element[i][j]);
////			}System.out.println();
//		
//		System.out.printf("Sum of its diagonal elements is %d",sum);
//		
//	}
//
//}


//package DMW;
//
//import java.util.Scanner;
//
//public class lessbyNing {
//	public static void main(String[] args) {
//		Scanner Scan = new Scanner(System.in);
//		System.out.print("Input #rows? " );
//		int row = Scan.nextInt();
//		System.out.print("Input #columns? ");
//		int columns = Scan.nextInt();
//		int[][] ele = new int [row][columns];
//		
//		for(int i=0 ; i<row ; i++){
//			for(int j = 0 ; j<columns ; j++){
//				System.out.printf("Input element[%d][%d]: ",i+1,j+1);
//				ele[i][j] = Scan.nextInt();
//				
//				
//			}
//		}
//		
//		System.out.println("Matrix A is");
//		for(int i =0 ;i<row ; i++ ){
//			for(int j = 0 ; j<columns ; j++){
//				
//				System.out.printf("%5d",ele[i][j]);
//			}System.out.println();
//		}
//		
//		System.out.println("Transpose of Matrix A is");
//		for(int i = 0 ; i<columns ; i++){
//			for(int j = 0 ;j<row ; j++){
//				System.out.printf("%5d",ele[j][i]);
//			}System.out.println();
//		}
//	
//	}
//
//}
