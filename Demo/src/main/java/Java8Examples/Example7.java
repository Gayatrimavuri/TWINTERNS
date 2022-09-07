package Java8Examples;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Example7 {
public static void main(String[] args) {
	List<Integer>list=Arrays.asList(10,30,20,35,60,30);
//	for(int i=0;i<list.size();i++)
//	{
//		System.out.println(list.get(i));
//	}
//	Consumer<Integer>C=new Consumer<Integer>()
//	{
//		@Override
//		public void accept(Integer t) {
//			// TODO Auto-generated method stub
//			System.out.println(t);
//		}
//			
//	};
////	
//	list.forEach(C);

//	list.forEach(new Consumer<Integer>()
//	{
//		@Override
//		public void accept(Integer t) {
//			// TODO Auto-generated method stub
//			System.out.println(t);
//		}
//			
//	});
//	
	//Consumer<Integer> C=(t)->	{System.out.println(t);};	
	Consumer<Integer>C=t->System.out.println(t);
	
	
	
	
	list.forEach(i->System.out.println(i));
	
	
	//list.forEach(i->System.out.println(i));
}

}
