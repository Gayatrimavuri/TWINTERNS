package Java8Examples;
@FunctionalInterface
interface InterfaceEx3
{
	void Method1(int a);
}
public class Example3 {
	public static void main(String[] args) {
		InterfaceEx3 I=i->System.out.println("Method1 called " + i);
				
		I.Method1(10);
		
	}
}
