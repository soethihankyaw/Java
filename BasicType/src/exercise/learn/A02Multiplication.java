package exercise.learn;

public class A02Multiplication {
	
	public static void main(String[] args) {
		
		var num = 8;
		
		for(var i = 1; i <= 10; i++) {
			var result = num * i;
			System.out.printf("%d x %d = %d%n", num , i, result);
		}
	}
}
