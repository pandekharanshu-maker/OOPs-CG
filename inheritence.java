import java.util.*;

class Animal {
	void sound() {
		System.out.println("Makes different sound");
	}
}
class Dog extends Animal {
	void bark() {
		System.out.println("Dog Barks....");
	}
}
class Cat extends Animal {
	void meow() {
		System.out.println("Cat Meows....");
	}
}

class Person {
	public void DetailsDisplay() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		System.out.println("Enter your favorite language: ");
		String lang = sc.nextLine();
		System.out.println("Your name is "+name);
		System.out.println("Your age is "+age);
		System.out.println("Your favorite language is "+lang);
	}
}
class Info extends Person {
	void Display() {
		System.out.println("Successfully Inherited");
	}
}
class inheritence {
    public static void main(String[] args) {
       	//Multiple Inheritance
		Dog d = new Dog();
		d.sound();
		d.bark();
		Cat c = new Cat();
		c.meow();
		//Single Inheritance
		Info p = new Info();
		p.Display();
		p.DetailsDisplay();
    }
}