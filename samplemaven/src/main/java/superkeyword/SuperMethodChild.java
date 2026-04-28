package superkeyword;

public class SuperMethodChild  extends SuperMethodParent{

	public void display() {
		super.print(); // to print the details in parent class
		System.out.println("child");
	}
	
	public static void main(String[] args) {
		SuperMethodChild obj=new SuperMethodChild();
		obj.display();
		
	}

}
