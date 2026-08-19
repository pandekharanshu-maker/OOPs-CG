//Default Constructor
class Animal {
	int age;
	String species;
	double size;
	float weight;
	Animal() {
		age = 5;
		species = "Doggie Clan";
		size = 4.8;
		weight = 25f;
	}
	void Display() {
		System.out.println("Species of animal is "+species);
		System.out.println("Age of "+species+" is "+age);
		System.out.println("Size of "+species+" is "+size);
		System.out.println("Weight of "+species+" is "+weight);
	}
	public static void main(String[] args) {
		Animal a = new Animal();
		a.Display();
	}
}