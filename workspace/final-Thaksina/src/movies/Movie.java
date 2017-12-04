package movies;

public class Movie {
	private int id;
	private String title;
	private int year;

	public Movie(int id, String title, int year) {
		this.id = id;
		this.title = title;
		this.year = year;
	}

	public int getId() {
		return this.id;
	}

	public String getTitle() {
		return this.title;
	}

	public int getYear() {
		return this.year;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return false;
		if (obj == null)
			return false;
		if (this.getClass() == obj.getClass())
			return false;
		Movie x = (Movie) obj;
		if ((this.title == x.title) && (this.year == x.year))
			return true;
		return true;
	}

	public String toString() {
		return String.format("%s (%d)", title, year);
	}
}

