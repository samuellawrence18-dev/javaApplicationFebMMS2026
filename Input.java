import java.util.Scanner;

public class UserInput{
	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  
	  System.out.println("---------------------------Input from user---------------------");
	  System.out.print("Enter your name: ");
	  String name = scan.nextLine();
	  
	  System.out.print("Enter your gender: ");
	  String gender = scan.next();
	  scan.next();
	  
	  System.out.print("Enter your address: ");
	  String address = scan.nextLine();
	  
	  System.out.print("Enter your age: ");
	  int age = scan.nextInt();
	  
	  System.out.print(name + " Are you learning Java?(true/false): ");
	  boolean answer = scan.nextBoolean();
	  System.out.println("------------------------Input from user-----------------------");
	  
	  System.out.printf("Welcome %s to NIIT%n",name);
	  System.out.printf("You are a %s and you are living in %s",gender,address);
	  System.out.printf("You are %d years old.Nice meeting you%n",age);
	  System.out.printf("Wow you said %b. it means you are a professional Java Programmer%n",answer);
	  }
}