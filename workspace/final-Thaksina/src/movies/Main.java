package movies;

public class Main {
	static void printMovies(){
		MovieManager callout = new MovieManager();
		callout.getMovies("movies.csv");
		
		
	}
	public static void main(String[] args) {
	}

}
