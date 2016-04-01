import java.util.Scanner;
import java.util.regex.Pattern;
public class PatternTest {
	public static void main(String[] args) {
		char complete;
		String input;
		Pattern email = Pattern.compile("\\w+@\\w+.\\w+"); //email check pattern
		Scanner scanner = new Scanner(System.in);
		sout("Please enter your age\n");
		int age = scanner.nextInt(); //pattern scan for integer
		if (age < 18) {
			sout("Access is denied");
		}

		else {
			
			Human.age = age;
			sout("Please enter your name");
			Human.name = scanner.nextLine();
			do {
				sout("Please enter your email");
				input = scanner.nextLine();
			}
			while (!Pattern.matches("\\w+@\\w+.\\w+", input));
			Human.email = input;
			
			
			sout("Enter your hentai preference");
			Human.pref = scanner.nextLine();
		
			printID();
			
		scanner.close();
		}
	}
	
	public static void sout(String s) {
		System.out.println(s);
	}
	
	public static void printID() {
		System.out.print("Name:");
		sout(Human.name);
		System.out.print("Age:");
		sout(Integer.toString(Human.age));
	}
}