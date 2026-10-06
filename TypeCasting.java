public class TypeCasting{
	public static void main (String[] args) {
		
		double price = 765;
		
		System.out.printf("The price of fuel is %f%n",price);
		
		double quantity = 5.7;
		int convertedQuantity = (int) quantity;
		
		System.out.printf("Ordered %d loaves of bread yesterday%n",convertedQuantity);
		
	}
}