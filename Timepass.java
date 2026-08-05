import java.util.Scanner;
class Math {
	void operations() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		double a = sc.nextDouble();
		System.out.println("Enter second number: ");
		double b = sc.nextDouble();
		System.out.println("Round down of "+a+" is "+java.lang.Math.floor(a)+" and "+b+" is "+java.lang.Math.floor(b));
		System.out.println("Sine of "+a+" is "+java.lang.Math.sin(a)+" and "+b+" is "+java.lang.Math.sin(b));
		System.out.println("Cosine of "+a+" is "+java.lang.Math.cos(a)+" and "+b+" is "+java.lang.Math.cos(b));
		System.out.println("Inverse Sine of "+a+" is "+java.lang.Math.asin(a)+" and "+b+" is "+java.lang.Math.asin(b));
		System.out.println("Inverse Cosine of "+a+" is "+java.lang.Math.acos(a)+" and "+b+" is "+java.lang.Math.acos(b));
		System.out.println("Logarithm of "+a+" is "+java.lang.Math.log(a)+" and "+b+" is "+java.lang.Math.log(b));
	}
}
public class Timepass {
	public static void main(String[] args) {
		Math m = new Math();
		m.operations();
	}
}