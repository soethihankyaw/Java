package exercise.learn;

public class A01RemiderOfTwoNumbers {
	
	
	public static void main(String[] args) {
		var num1 = 125;
		var num2 = 24;
		
		var plus = num1 + num2;
		var minus = num1 - num2;
		var multi = num1 * num2;
		var div = num1 / num2;
		var mod = num1 % num2;
		
		System.out.printf("%d + %d = %d%n",num1, num2 , plus );
		System.out.printf("%d - %d = %d%n",num1, num2 , minus );
		System.out.printf("%d * %d = %d%n",num1, num2 , multi );
		System.out.printf("%d / %d = %d%n",num1, num2 , div );
		System.out.printf("%d mod %d = %d%n",num1, num2 , mod );
	}

}
