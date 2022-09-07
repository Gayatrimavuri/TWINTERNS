package Java8Examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Example10 {
public static void main(String[] args) {
	List<Integer>L=Arrays.asList(40,20,30,10,60,70);
	
//	for(int i=0;i<L.size();i++)
//	{
//		if(L.get(i)>50)
//		System.out.println(L.get(i));
//	}
	
//	Predicate<Integer> P=new Predicate<Integer>() {
//
//		@Override
//		public boolean test(Integer t) {
//			// TODO Auto-generated method stub
//			return t>50;
//		}
//	};
	
 Predicate<Integer>P=t->t>50;
	
	
	
	Stream<Integer>	s=L.stream();
	//Stream<Integer> F=s.filter(P);
	Stream<Integer>F=s.filter(i->i>50);
	F.forEach(i->System.out.println(i));
	
	L.stream().filter(i->i>50).forEach(i->System.out.println(i));
}
}
