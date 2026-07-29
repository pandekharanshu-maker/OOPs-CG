package sample;
import java.util.Scanner;
public class Robust_Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int choice;
		double a = 0,b = 0,result = 0;
		do {
			System.out.println("----------------JAVA CALC----------------");
			System.out.println("1.Addition(+)");
			System.out.println("2.Subtraction(-)");
			System.out.println("3.Multiplication(*)");
			System.out.println("4.Division(/)");
			System.out.println("5.Modulus(%)");
			System.out.println("6.Power(**)");
			System.out.println("7.Exit");
			System.out.println("Enter your choice:");
			choice = sc.nextInt();
			if (choice >= 1 && choice < 7) {
					System.out.println("Enter first number:");
					a = sc.nextDouble();
					System.out.println("Enter second number:");
					b = sc.nextDouble();
			}
			switch(choice) {
			case 1:result = a + b;System.out.println("Addition is "+result);break;
			case 2:result = a - b;System.out.println("Subtraction is "+result);break;
			case 3:result = a * b;System.out.println("Multiplication is "+result);break;
			case 4:if (b == 0) {System.out.println("Enter valid number for denominator");} else {
			result = a / b;System.out.println("Division is "+result);break;}
			case 5:if (b == 0) {System.out.println("Enter valid number for denominator");} else { 
			result = a % b;System.out.println("Modulus is "+result);break;}
			case 6:result = Math.pow(a, b);System.out.println("Power is "+result);break;
			case 7:System.out.println("Exiting......");break;
			default:System.out.println("Enter number between 1 to 7");break;
			}
		}while(choice != 7);
		sc.close();
	}
}