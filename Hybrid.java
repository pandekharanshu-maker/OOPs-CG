class Kaffee {
	void display() {
		System.out.println("Kaffee contains Kaffeine");
	}
}
class Cappucino extends Kaffee {
	void print() {
		System.out.println("Cappucino is Light Kaffee which contains milk");
	}
}
interface Expresso {
	void show();
}
class Kaffeine extends Cappucino implements Expresso {
	public void show() {
		System.out.println("Expresso is Dark Kaffee which doesn't contain milk");
	}
	void contents() {
		System.out.println("Kaffee is good and helps you stay awake when consumed in adequate amounts");
		System.out.println("Cappucino is good for everyone including those didn't consume Kaffee ever as it has Low Kaffeine");
		System.out.println("Expresso is not suitable for everyone as it contains Large amount of Kaffeine and no milk");
	}
}
public class Hybrid {
	public static void main(String[] args) {
		System.out.println("Hello, World! Some important facts before you go to Cafe");
		Kaffeine k = new Kaffeine();
		k.display();
		k.print();
		k.show();
		k.contents();
	}
}