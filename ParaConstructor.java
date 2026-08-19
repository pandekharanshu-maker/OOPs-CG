class Rohan {
	int marks;
	String behaviour;
	double salary;
	String designation;
	Rohan(int m, String b, double s, String d) {
		marks = m;
		behaviour = b;
		salary = s;
		designation = d;	
	}
	void Display() {
		System.out.println("Marks is "+marks);
		System.out.println("Behaviour is "+behaviour);
		System.out.println("Salary is "+salary);
		System.out.println("Designation is "+designation);
	}
	public static void main(String[] args) {
		Rohan R = new Rohan(20,"Idiotic",0.000000,"Unknown");
		R.Display();
	}
}