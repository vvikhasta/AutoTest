package first;

public class SecondClass {
	
	final int i = 34; //const, not final int i;
	final long l = 10; //const
	
	public void first() //function
	{
		System.out.println("Welcome this is SecondClass first mtd"); //syso+ctrl+space
	}
	public void second ()
	{
		System.out.println("Welcome SecondClass second mtd");
	}
  public static void main(String[] args) { //main+ctrl+space
	
	  System.out.println("Welcome main");
	  
	  //call first() only in void main!!!
	  SecondClass obj = new SecondClass();
	  obj.first();
}
}
