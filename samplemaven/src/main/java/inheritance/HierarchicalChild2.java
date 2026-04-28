package inheritance;

public class HierarchicalChild2 extends HierarchicalParent {

	public void print() {
		System.out.println("Child2 class");
		
	
		
	}
	
public static void main(String args[]) {
		
		HierarchicalChild2 obj= new HierarchicalChild2();
		obj.print();
		obj.display();
	}
}