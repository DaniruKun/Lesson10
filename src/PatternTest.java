import java.util.Scanner;

public class PatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sout("Please enter your age");
		Scanner scanner = new Scanner(System.in);
		Human human = new Human();
		int age = scanner.nextInt(); //pattern scan for integer
		if (age < 18) {
			sout("Access is denied");
		}
		else {
			human.age = age;
			sout("Please enter your name");
			human.name = scanner.nextLine();
			
		}
		getID();
		
	}
	public static void sout(String s) {
		System.out.println(s);
	}
	
	public static void getID() {
		System.out.print("Name:");
		sout(Human.name);
		System.out.print("Age:");
		sout(Integer.toString(Human.age));
		
		
	}

}
