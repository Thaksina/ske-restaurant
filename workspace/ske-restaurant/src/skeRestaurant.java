import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class skeRestaurant {
	static Scanner Scan = new Scanner(System.in);
	static double sum = 0;
	
	public static void main(String[] args) throws IOException {
		RestaurantManager.Menufiles();
		ArrayList<String> a = RestaurantManager.keeper;
		RestaurantManager.getMenuitems();
		RestaurantManager.getPrices();
		RestaurantManager.getQty();
		printMenu();
	}

	public static void printMenu() {
		System.out.println("============== Welcome to SKE Restaurant =================");
		for (int i = 0; i < RestaurantManager.keeper.size(); i++) {

			System.out.printf("[%d]   %-40s %11.2f%n", i + 1, RestaurantManager.menuName[i],
					RestaurantManager.price[i]);
		}
		System.out.println();
		System.out.println("[m] Open Menu");
		System.out.println("[p] Print Order");
		System.out.println("[x] Exit");
		command();
		
	}

	public static void command() {
		while (true) {
			System.out.println();
			System.out.print("Enter your Choice : ");
			String command = Scan.next();
			switch (command) {
			case "p":
				printOrder();
			case "x":
				exitPrograme();
				break;
			case "m":
				printMenu();
				return;
			default:
				getOrder(command);
				break;
			}
			if (command.equals("x")) {
				payment();
				exit();
				exitPrograme();
				break;
			}
		}
	}

	public static void getOrder(String command) {
		int command2 = Integer.parseInt(command);
		if (command2 > 0 && command2 < RestaurantManager.keeper.size()) {
			System.out.print("Enter your Quantity : ");
			int Qty = Scan.nextInt();
			RestaurantManager.qty[command2] = Qty;
		}
	}
	
	public static void printOrder() {
		System.out.println("+========== Order =============+=== QTY ===+=== Total ===+");

		for (int i = 0; i < RestaurantManager.keeper.size(); i++) {
			if (RestaurantManager.qty[i] != 0) {
				System.out.printf("| %-28s | %7d   | %10.2f  |%n", RestaurantManager.menuName[i],
						RestaurantManager.qty[i], RestaurantManager.price[i] * RestaurantManager.qty[i]);
				// System.out.println(RestaurantManager.menuName[i]);
				// System.out.println(RestaurantManager.qty[i]);
				// System.out.printf("%.2f
				// %n",RestaurantManager.price[i]*RestaurantManager.qty[i]);
			}
		}
		System.out.println("+==============================+===========+=============+");
	}

	public static boolean exitPrograme() {
		return false;
	}

	public static void exit() {
		System.out.println("+========================================+");
		System.out.printf("%-40s %s%n", "|", "|");
		System.out.printf("|%22s %18s%n", "Thanks !", "|");
		System.out.printf("%-40s %s%n", "|", "|");
		System.out.println("+========================================+");
	}

	public static void total() {
		for (int i = 0; i < RestaurantManager.keeper.size(); i++)
			if (RestaurantManager.qty[i] != 0) {
				sum = sum + RestaurantManager.price[i] * RestaurantManager.qty[i];
			}
	}

	public static void payment() {
		total();
		System.out.println("\nYour total is : " + sum);
		System.out.print("Enter your money : ");
		double money = Scan.nextDouble();
		System.out.printf("%nYour Change is : %.2f%n%n", money - sum);
	}
	
	
	
}
