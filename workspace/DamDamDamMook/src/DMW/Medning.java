package DMW;

import java.util.Scanner;

public class Medning {
	
	public static void ShowMatrix(double matrix[][]){
		System.out.println("Current matrix is:");
		
		for(int i = 0 ; i<matrix.length ; i++){
			System.out.print("|");
			for (int j = 0 ; j<matrix[0].length ; j++){
				System.out.printf("%6.2f",matrix[i][j]);
			}System.out.print("|");
			System.out.println();
		
	}
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
				ShowMatrix(matrix);
					}
				else if (command.equals("+")){
					int row = Scan.nextInt();
					double plus = Scan.nextDouble();
					System.out.printf("Success row operation, row%d is updated",row);
					for(int i = 0 ; i<columns ; i++){
					matrix[row-1][i]	+=  plus;
					
					
					}System.out.println();
					
				}
				else if (command.equals("-")){
					int row = Scan.nextInt();
					double plus = Scan.nextDouble();
					System.out.printf("Success row operation, row%d is updated",row);
					for(int i = 0 ; i<columns ; i++){
						matrix[row-1][i]	-=  plus;
					
					
					}System.out.println();
					
				}
				else if (command.equals("*")){
					int row = Scan.nextInt();
					double plus = Scan.nextDouble();
					System.out.printf("Success row operation, row%d is updated",row);
					for(int i = 0 ; i<columns ; i++){
						matrix[row-1][i]	*=  plus;
					
					
					}System.out.println();
					
				}
				else if (command.equals("/")){
					int row = Scan.nextInt();
					double plus = Scan.nextDouble();
					System.out.printf("Success row operation, row%d is updated",row);
					for(int i = 0 ; i<columns ; i++){
						matrix[row-1][i]	/= plus;
		}System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
	}
				else if (command.equals("STOP")){
					System.out.print("END");
					break;
				}
		}
	}
}