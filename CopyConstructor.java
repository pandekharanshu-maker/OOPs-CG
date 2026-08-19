class Car {
	int RPM;
	float mileage;
	String Model;
	int ManufacturingYear;
	String paint;
	int passengers;
	Car(int RPM, float mileage, String Model, int ManufacturingYear, String paint, int passengers) {
		this.RPM = RPM;
		this.mileage = mileage;
		this.Model = Model;
		this.ManufacturingYear = ManufacturingYear;
		this.paint = paint;
		this.passengers = passengers;
	}
	Car(Car c) {
		this.RPM = c.RPM;
		this.mileage = c.mileage;
		this.Model = c.Model;
		this.ManufacturingYear = c.ManufacturingYear;
		this.paint = c.paint;
		this.passengers = c.passengers;
	}
	void Display() {
		System.out.println("Model of the car: "+Model);
		System.out.println("Paint of the car: "+paint);
		System.out.println("Seating Capacity: "+passengers);
		System.out.println("Mileage of the car: "+mileage);
		System.out.println("Manufacturing Year of the car: "+ManufacturingYear);
		System.out.println("RPM of the car: "+RPM);
	}
	public static void main(String[] args) {
		Car c1 = new Car(4500,10.5f,"Supra MK-4",2020,"Lime Yellow",4);
		Car c2 = new Car(c1);
		System.out.println("Details of the car");
		c1.Display();
		System.out.println("Details copied successfully");
		c2.Display();
	}
}