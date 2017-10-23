import java.util.ArrayList;
import java.util.Scanner;

/**
 * Complete the methods in this class.
 * Each method uses a method from the ArrayList class.
 * 
 * When you run the main() method it calls consoleDialog.
 * Run the code and explore how ArrayList works.
 * 
 * @author your name
 */
public class ListExplorer {
	private static final Scanner console = new Scanner(System.in);
	
	/**
	 * Print the elements of a list on the system output,
	 * up to 10 elements per line with a comma and one space
	 * between elements.
	 * Print { and } around the whole thing, so it looks
	 * like a collection,
	 * Example output:
	 * list = { something, something2, ..., something10
	 * something11 }
	 <pre>
	   list = { apple, banana, grape, orange }
	 </pre>
	 * If the list is empty then print:
	 <pre>
	   list = { }
	 </pre>
	 * @param list is the List of Strings to print.
	 * 
	 */
	
	public static void printList(ArrayList<String> list) {
		int space = 0 ;
		System.out.print("list = {");
		for(int i = 0 ; i<list.size() ; i++){
			System.out.print(list.get(i));
			space++;
			if(i<list.size()-1){
				System.out.print(", ");
			}
			if(space%10==0){
				System.out.println();
				
			}
			
		}System.out.print("}");
		System.out.println();
	}
	
	
	public static void append(String arg, ArrayList<String> list) {
		list.add(arg);
	}
	
	
	public static void insert(String arg, int index, ArrayList<String> list) {
		
		if (index >list.size() ) {
			System.out.printf("Index %d is too large. Last index is %d.",index,list.size() - 1);
			return ;
		}
		else{
			list.add(index, arg);
		}
	}
	
	public static void remove(int index, ArrayList<String> list) {
		
		if(index > list.size()){
			System.out.printf("%d is too large. Last index is %d.",index,list.size()-1);
		}
		else{
			System.out.printf("Removed %s%n", list.remove(index));
		}
	}
	
	
	public static void find(String arg, ArrayList<String> list) {
		
		int index = list.indexOf(arg);
		if(index == -1){
			System.out.printf("%s not in list",arg);
		} else {
			System.out.printf("%s in list at index %d",arg,list.size());
		}
		
		
	}
	
	
	public static void consoleDialog() {
		ArrayList<String> list = new ArrayList<String>( );
		
		String prompt = "Input one of the following:\n"+
				"a value       - append value to the end of list\n"+
				"i index value - insert a value into list at index (integer)\n"+
				"d index       - delete element at index\n"+
				"f value       - find value in the list, print its location\n"+
				"p             - print the list\n"+
				"q             - quit\n"+
				"?             - print this menu again";
		
		String line = ""; // input line
		String[] args = {"?"};    // input arguments
		do {
			String command = args[0];
			switch(command) {
			case "a":
			case "add":
			case "append":
				if (args.length >= 2) append(args[1], list);
				else error("Must specify value to append");
				break;
			case "d":
			case "delete":
				if (args.length >= 2) {
					int index = parseInt(args[1]);
					if (index >= 0) remove(index, list);
				}
				else error("Must specify index");
				break;
			case "i":
			case "insert":
				if (args.length >= 3) {
					int index = parseInt(args[1]);
					if (index >= 0) insert(args[2], index, list);
				}
				else error("Must specify index and value");
				break;
			case "f":
			case "find":
				if (args.length >= 2) find(args[1], list);
				else error("Must specify value to find");
				break;
			case "p":
			case "print":
				printList(list);
				break;
			case "q":
			case "quit":
				System.out.println("Goodbye");
				return;
			case "?":
			case "help":
				System.out.println(prompt);
				break;
			default:
				System.out.println("invalid input: "+command);
				System.out.println("Enter ? for help");
			}
			// get next user input
			do {
				System.out.print("Input: ");
				line = console.nextLine().trim();
				args = line.split("\\s+",3);
			} while (args.length == 0);
		} while (true);
	}
	
	private static int parseInt(String arg) {
		try {
			int k = Integer.parseInt(arg);
			return k;
		} catch (NumberFormatException nfe) {
			System.out.println(arg+" is not an integer");
			return -1;
		}
	}
	
	/** print an error message on console. */
	private static void error(String message) {
		System.out.println(message);
	}
	
	/** Run the application. */
	public static void main(String[] args) {
		
		consoleDialog();
	}
}
