package movies;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MovieManager {
	private List<Movie> movies = new ArrayList();
	private int id;
	private String title;
	private int year;
	
	public MovieManager() {
		// empty
	}

	
	public int readMovies(String filename) {
		ClassLoader classloader = Movie.class.getClassLoader();
		InputStream inputstream = classloader.getResourceAsStream(filename);
		if (inputstream == null) {
			String.format("it's null");
			return -1;
		}
		int countmovie = 0;
		Scanner readfile = new Scanner(inputstream);
		while (readfile.hasNextLine()) {
			readfile.nextLine();
			countmovie++;
		}
		return countmovie;
	}

	
	
	public String getMovie(int movieId) {
		for(int i = 0 ; i <movies.size();i++){
			this.id=movieId;
		}
			return this.title+this.id;
	}

	public List<Movie> getMovies(String filename) {
		ClassLoader classloader = Movie.class.getClassLoader();
		InputStream inputstream = classloader.getResourceAsStream(filename);
		Scanner readfile = new Scanner(inputstream);

		while (readfile.hasNextLine()) {
			String tilte = readfile.nextLine();
			String[] title2 = title.split(",");
			id = Integer.parseInt(title2[0]);
			title = title2[1].trim();
			year = Integer.parseInt(title2[2]);
			Movie each = new Movie(id, title, year);
			movies.add(each);
		}
		return movies;
	}

	public boolean addMovie(Movie movie) {
		for (Movie chmovie : movies) {
			if (movie.equals(chmovie)) {
				return true;
			}
		}
		return false;
	}
}


