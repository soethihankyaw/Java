package exercise.learn;

public class A03ParameterOfCircle {
	
	public static void main(String[] args) {
		
		var radius = 7.5;
		
		var area = Math.PI * Math.pow(radius, 2);
		
		var perimeter = 2 * Math.PI * radius;
		
		System.out.println("Area :: " + area);
		
		System.out.println("Perimeter :: " + perimeter);
	}
}
