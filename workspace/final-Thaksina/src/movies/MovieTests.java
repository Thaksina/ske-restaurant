package movies;

public class MovieTests {
	static void testConstructor() {
		Movie checkerCon = new Movie(1234, "Revenge of SKE", 2016);
		System.out.println("obj2: " + checkerCon);
		System.out.printf("Test Id: %d%n", checkerCon.getId());
		System.out.printf("Test Title: %s%n", checkerCon.getTitle());
		System.out.printf("Test Year: %d%n", checkerCon.getYear());
	}

	static void testEquals(Object obj1) {
		Movie checkerEq2 = new Movie(1234, "Revenge of SKE", 2016);
		if (checkerEq2.equals(obj1)) {
			System.out.println("It is equal");
		} else {
			System.out.println("error !");
		}
	}

	public static void main(String[] args) {
		Movie objtest1 = new Movie(1234, "Revenge of SKE", 2017);
		Movie objtest2 = new Movie(1234, "Revenge of SKE", 2016);

		System.out.println("obj1: " + objtest1);
		// System.out.println(objtest1.equals(objtest2));
		// System.out.println();

		testConstructor();
		testEquals(objtest1);
	}
}

