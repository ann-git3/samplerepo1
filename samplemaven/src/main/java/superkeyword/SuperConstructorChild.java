package superkeyword;

public class SuperConstructorChild extends SuperConstructorParent{
public  SuperConstructorChild() 
{
super(2,4);
 System.out.println("ann");

}
public static void main(String args[]) {
	
	SuperConstructorChild obj = new SuperConstructorChild();
}


}
