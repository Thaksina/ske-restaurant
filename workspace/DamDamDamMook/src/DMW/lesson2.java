package DMW;

import java.util.Scanner;

public class lesson2 {
	public static void main(String[] args) {
		Scanner Scan = new Scanner (System.in);
		
		System.out.print("Input size of square: ");
		int squ = Scan.nextInt();
		
		int[][] square = new int[squ][squ];
		
		for(int i =0 ; i<squ ; i++){
			for(int j = 0 ; j<squ ; j++){
				square[i][j] = Scan.nextInt();
//				if(square[i][j]==square[i][j]){
//					System.out.print("Result: This is Magic Square.");
//				}else {
//					System.out.print("Result: This is not Magic Square.");
//				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
//		
//		while(true){
//		System.out.print("Input command: ");
//		String command = Scan.next();
//		if(command.equals("add")){
//			System.out.print("Date (1-7): ");
//			int date = Scan.nextInt();
//			if(date<=7 && 1<=date){
//				System.out.print("Hour (1-24): ");
//				int hour = Scan.nextInt();
//				
//			}
//		}else {
//				System.out.print("Invalid date!");
//			}
//		
//		
//		
//		
//	}
//	}
	}
}
