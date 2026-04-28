package polymorphism;

public class PolyChild extends PolyParent{

	public void display() {
		super.display();
		System.out.println("Child class");
		
	}
	public static void main(String[] args) {
		PolyChild obj = new PolyChild();
		obj.display();
		
	}

}
