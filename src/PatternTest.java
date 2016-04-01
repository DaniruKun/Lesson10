import java.util.Scanner;
import java.util.regex.Pattern;
public class PatternTest {
	public static void main(String[] args) {
		String input;
		Scanner scanner = new Scanner(System.in);
		sout("Please enter your age");
		int age = scanner.nextInt();  //fetches age
		scanner.nextLine();
		if (age < 18) {  //checks age
			sout("Access is denied");
		}
		else {
			Human.age = age; //writes age
			sout("Please enter your name");
			Human.name = scanner.nextLine();  //writes name
			do {
				sout("Please enter your email");
				input = scanner.nextLine();
			}
			while (!Pattern.matches("\\w+@\\w+\\.\\w+", input)); //email pattern check
			Human.email = input;
			sout("Enter your hentai preference");  
			Human.pref = scanner.nextLine();  //writes hentai preference
			printID();
		scanner.close();
		}
	}
	
	public static void sout(String s) {  //makes your life easier
		System.out.println(s);
	}
	
	public static void printID() {  //prints your details
		System.out.print("Name:");
		sout(Human.name);
		System.out.print("Age:");
		sout(Integer.toString(Human.age));
		System.out.print("Email:");
		sout(Human.email);
		System.out.print("Hentai preference:");
		sout(Human.pref);
	}
}