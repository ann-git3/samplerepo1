package inheritance;

public class HierarchicalChild1 extends HierarchicalParent  {

	public void show() {
		
		System.out.println("Child1 class");
		
	}
	
	public static void main(String args[]) {
		
		HierarchicalChild1 obj= new HierarchicalChild1();
		obj.show();
		obj.display();
		
	}
}
