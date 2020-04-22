package entities;
import java.lang.Math;

public class Retangulo {
	
	public double a;
	public double b;
	
	public double area() {
		return a * b;
	}
	public double perimetro() {
		return (a + b) * 2;
	}
	public double diagonal() {
		
		double quad = (Math.pow(a, 2) + Math.pow(b, 2));
		double result = Math.sqrt(quad);
		
		return result;
	}  
}
