package Java8Examples;
@FunctionalInterface
interface InterfaceEx7
{
	void Method1();
	static void Method2()
	{
		System.out.println("Method2");
	}
	static void Method3()
	{
		System.out.println("Method3");
	}
	default void Method4()
	{
		System.out.println("Method4");
	}

}
class Child1 implements InterfaceEx7
{

	@Override
	public void Method1() {
		// TODO Auto-generated method stub
		System.out.println("Method1 of Child1");
		InterfaceEx7.Method2();
	}
	
}
class Child2 implements InterfaceEx7
{

	@Override
	public void Method1() {
		// TODO Auto-generated method stub
		System.out.println("Method1 of Child2");
		InterfaceEx7.Method2();
	}
	
}




public class Example6 {
public static void main(String[] args) {
	
InterfaceEx7 C1=new Child1();
C1.Method1();
C1=new Child2();
C1.Method1();
InterfaceEx7.Method2();
}
}
