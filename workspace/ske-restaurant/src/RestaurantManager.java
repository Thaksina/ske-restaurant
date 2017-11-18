import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class RestaurantManager extends skeRestaurant {
	public static ArrayList<String> keeper = new ArrayList<>();
	public static String[] menuName;
	public static double[] price;
	public static int[] qty;
public static double[] total;
	
	public static void Menufiles() throws IOException {
		FileReader menufile = new FileReader("src\\data\\Menu.txt");
		BufferedReader reader = new BufferedReader(menufile);
		String readline = reader.readLine();
		while (readline != null) {
			if (!readline.startsWith("+")) {
				keeper.add(readline);

			}
			readline = reader.readLine();
		}

	}

	public static String[] getMenuitems() {
		menuName = new String[keeper.size()];
		for(int i = 0 ; i<keeper.size() ; i++){
			menuName[i]= keeper.get(i).split("/")[0];
		}
		return menuName;
	}
	
	public static double[] getPrices(){
		price = new double[keeper.size()];
		for(int i = 0 ; i<keeper.size() ; i++){
			price[i] = Double.valueOf(keeper.get(i).split("/")[1]);
		}
		return price;
	}
	
	public static int[] getQty(){
		qty = new int[keeper.size()];
		for(int i = 0 ; i<keeper.size() ; i++){
			qty[i] = 0;
		}
		return qty;
	}
	
	

}
