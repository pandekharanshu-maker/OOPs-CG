interface BreakingBad {
	void review();
}
interface PeakyBlinders {
	void worse();
}
interface TheBoys {
	void feedback();
}
interface Chernobyl {
	void good();
}
class Review implements BreakingBad, PeakyBlinders, TheBoys, Chernobyl {
	void display() {
		System.out.println("My Opinion on few series includes BreakingBad, PeakyBlinders, TheBoys, Chernobyl");
	}
	public void review() {
		System.out.println("Breaking Bad is GODDAMN MASTERPIECE!!!!");	
	}
	public void worse() {
		System.out.println("Peaky Blinders wasn't that great and feels OVERHYPED like Stranger Things");
	}
	public void feedback() {
		System.out.println("The Boys is AWESOME until SEASON 3 but DOWNFALL is real after that");
	}
	public void good() {
		System.out.println("Chernobyl is SOLID  one time watch");
	}
}
public interface Series {
	public static void main(String[] args) {
		Review R = new Review();
		R.display();
		R.review();
		R.worse();
		R.feedback();
		R.good();
	}
}