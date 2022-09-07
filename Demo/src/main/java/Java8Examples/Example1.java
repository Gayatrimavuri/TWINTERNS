package Java8Examples;
//Anonymous inner type
interface InterfaceEx {
	void Method1();
	void Method2();
}
public class Example1 {
	public static void main(String[] args) {
		InterfaceEx I=new InterfaceEx() {
			
			@Override
			public void Method2() {
				// TODO Auto-generated method stub
				System.out.println("Method1");
			}
			
			@Override
			public void Method1() {
				// TODO Auto-generated method stub
				System.out.println("Method2");
			}
		};
		InterfaceEx I1=new InterfaceEx() {
			
			@Override
			public void Method2() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void Method1() {
				// TODO Auto-generated method stub
				
			}
		};
		I.Method1();
		I.Method2();
	}
}
