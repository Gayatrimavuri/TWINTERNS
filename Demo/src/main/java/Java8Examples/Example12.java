package Java8Examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Example12 {
public static void main(String[] args) {
	List<Integer>L=Arrays.asList(40,20,30,10,60,70);
	Stream<Integer> s=L.stream();

//	Function<Integer,Integer>F=new Function<Integer, Integer>() {
//
//		@Override
//		public Integer apply(Integer t) {
//			// TODO Auto-generated method stub
//			return t*2;
//		}
//	};
//	s.filter(j->j>50).map(F).forEach(i->System.out.println(i));
s.filter(j->j>50).map(t->t*2).forEach(i->System.out.println(i));
}
}













int sum=0;
20	40	20	10	50
for(int i=0;i<5;i++)
{
	sum=suM+a[i];
}










