package superkeyword;

public class SuperVariablechild extends SuperVariableParent{
String color="blue";
public void display() {
	
	System.out.println(color);
	
	System.out.println(super.color);
}


	public static void main(String[] args) {
		SuperVariablechild obj= new SuperVariablechild();
		obj.display();
	}

}
