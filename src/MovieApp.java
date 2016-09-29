import java.util.Scanner;

/**
 * @author Kimberli
 *
 */
public class MovieApp {
	/**
	 * @param args
	 */
	// variables
	static String choice = "y";
	static String category;
	static String title;
	static String animated;
	static String drama;
	static String horror;
	static String scifi;

	public static void main(String[] args) {
		System.out.println("Welcome to the Movie List Application!");
		System.out.println();

		System.out.println("There are 100 movies in this list.");
		System.out.println();
		
		Movies animated = new Movies[](0, 0);
		animated.add("Toy Story");
		animated.add("Toy Story 2");
		animated.add("Toy Story 3");

		while (choice.equalsIgnoreCase("y"));
		System.out.println("What category are you interested in?  ");
		Scanner k = new Scanner(System.in);
		category = k.nextLine();

		switch (category) {// begin switch
		case "animated":
			System.out.println(animated);
			break;

		case "drama":
			System.out.println(drama);
			break;

		case "horror":
			System.out.println(horror);
			break;

		case "scifi":
			System.out.println(scifi);
			break;
		}// end switch

		System.out.println("Continue? y/n");
		k.nextLine();
		choice = k.nextLine();

	}// psvm

}// end movie app class
