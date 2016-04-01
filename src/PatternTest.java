import java.util.Scanner;

public class PatternTest {

	public static void main(String[] args) {
		char complete;
		Scanner scanner = new Scanner(System.in);
		Human human = new Human();
		sout("Please enter your age\n");
		int age = scanner.nextInt(); //pattern scan for integer
		if (age < 18) {
			sout("Access is denied");
		}
		
		else {
			do {
			Human.age = age;
			sout("Please enter your name");
			Human.name = scanner.nextLine();
			scanner.nextInt();
			sout("Enter your hentai preference");
			Human.pref = scanner.nextLine();
			scanner.nextLine();
			printID();
			sout("Is the above information correct? (y/n)");
			complete = scanner.nextLine().charAt(0); 
			} while (complete != 'y');
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