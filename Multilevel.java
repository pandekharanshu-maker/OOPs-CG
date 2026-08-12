class Animal {
	void display() {
		System.out.println("Animals covers all species");
	}
}
class Dog extends Animal {
	void print() {
		System.out.println("Dog comes under animal");
		System.out.println("Single Inheritance Successful");
	}
}
class Habit extends Dog {
	void show() {
		System.out.println("Dogs often need food for their survival");
		System.out.println("Multilevel Inheritance Successful");
	}
}
public class Multilevel {
	public static void main(String[] args) {
		Habit h = new Habit();
		h.display();
		h.print();
		h.show();
	}
}