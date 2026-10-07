public class OperatorPart2{
	public static void main(String[] args)
	{
		
		int num1 = 50;
		int num2 = 80;
		int num3 = 30;
		//AND
		boolean isAND = (num1 > num2) && (num1 > num3);
		
		//OR
		boolean isOR = (num1 > num2) || (num1 > num3);
		
		//NOT
		boolean isNOT = !((num1 > num2) || (num1 > num3));
		
		System.out.printf("Is(%d > %d) && (%d > %d): %b%n",num1,num2,num1,num3,isAND);
		System.out.printf("Is(%d > %d) || (%d > %d): %b%n",num1,num2,num1,num3,isOR);
		System.out.printf("Is((%d > %d) || (%d > %d)): %b%n",num1,num2,num1,num3,isNOT);
		
		System.out.println("-----------------------------------------------------");
		int x = 5;
		int y = 2;
		
		//pre-increment
		System.out.println("-----------------------pre-increment------------------------------");
		System.out.printf("The value of X is ", ++x);
		System.out.printf("The value of y is " ,++y);
		System.out.println("-----------------------pre-increment------------------------------");
		
		//post-increment
		System.out.println("-------------------post-increment----------------------------------");
		System.out.printf("The value of X is ", x++);
		System.out.printf("The value of y is ", y++);
		System.out.printf("The value of X is " + x);
		System.out.printf("The value of y is " + y);
		
		//Decrement
		//pre-decrement
		System.out.println("---------------------------Decrement--------------------------");
		System.out.printf("The value of X is ", --x);
		System.out.printf("The value of y is " ,--y);
		System.out.println("---------------------------pre-decrement--------------------------");
		
		//post-decrement
		System.out.println("-------------------post-decrement----------------------------------");
		System.out.printf("The value of X is ", x--);
		System.out.printf("The value of y is ", y--);		
		System.out.printf("The value of X is " + x);
		System.out.printf("The value of y is " + y);
	}
		
}