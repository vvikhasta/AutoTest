package Testing;

public class A {
	
	int a=10; // global variable
	
	public void hello()
	{
	System.out.println("This is hello mtd of Testing");
	}
	
	public void sum ()
	{
		int b=20; //local variable, can be use only in method sum
		int result = a+b;
		System.out.println(result);
	}

	public void sumFlex (int q, int b)
	{
		
		int resultFlex = q+b;
		System.out.println(resultFlex);
	}



}

