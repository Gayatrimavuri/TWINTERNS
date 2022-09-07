package Java8Examples;
@FunctionalInterface
interface InterfaceEx2
{
	void Method1();	
	int hashCode();
	String toString();
	boolean equals(Object obj);
}
public class Example2 {
public static void main(String[] args) {
//	InterfaceEx2 I=new InterfaceEx2() {
//		@Override
//		public void Method1() {
//			int n=10;
//			int sum=0;
//			for(int i=0;i<=n;i++)
//			{
//				sum=sum+i;
//			}
//			System.out.println("sum "+sum);	
//		}
//	};

	InterfaceEx2 I=()->{
		int n=10;
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum "+sum);		
		};
	I.Method1();	
}
}
