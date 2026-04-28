package inheritance;

public class Multilevelchild extends GrandParent{

	public void show() {
		System.out.println("it is a child class");
		
		
	}
	
	public static void main() {
		Multilevelchild obj=new Multilevelchild();
		
		obj.show();
		obj.display();
		
	}
}
