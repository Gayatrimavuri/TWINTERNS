package Java8Examples;
@FunctionalInterface
interface InterfaceEx6
{
	void Method1();
	default void Method2() 
	{
		System.out.println("Method2 of interface");
	}
}
class Class1 implements InterfaceEx6
{

	@Override
	public void Method1() {
		System.out.println("Method1 in class1");
		
	}
	}
class Class2 implements InterfaceEx6
{

	@Override
	public void Method1() {
		System.out.println("Method1 in class2");
		
	}
	}
class Class3 implements InterfaceEx6
{
@Override
public void Method2()
{
System.out.println("Method3 in class3");	
}
	
	
	@Override
	public void Method1() {
		System.out.println("Method1 in class2");
		
	}
	}


public class Example5 {
public static void main(String[] args) {
Class1 C1=new Class1();
Class2 C2=new Class2();
Class3 C3=new Class3();
C1.Method1();
C1.Method2();
C2.Method1();
C2.Method2();
C3.Method1();
C3.Method2();

}
}





