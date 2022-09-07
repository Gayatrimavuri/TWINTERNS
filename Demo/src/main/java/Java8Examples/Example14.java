package Java8Examples;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Example14 {
public static void main(String[] args) {
	List<Integer>list= Arrays.asList(20,40,10,40,70,80,90);
	DateTimeFormatter D=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
	List<Employee>lista =Arrays.asList(
			new Employee(1, "RAM", LocalDate.parse("01-Jul-2019",D), 90000),
			new Employee(2, "RAVI", LocalDate.parse("01-Jun-2021",D), 40000),
			new Employee(3, "SHEKAR", LocalDate.parse("01-Jan-2020",D), 70000),
			new Employee(4, "NAVEEN", LocalDate.parse("01-Sep-2018",D), 50000)
			);
//	BinaryOperator<Integer> B=new BinaryOperator<Integer>() {
//
//		@Override
//		public Integer apply(Integer t, Integer u) {
//			// TODO Auto-generated method stub
//			System.out.println(t+ " "+u);
//			return t+u;
//		}
//	
//	};
	
//BinaryOperator<Integer> B=(t,u)-> t+u;
	
		
	//System.out.println(list.stream().reduce(0, B));
	System.out.println(list.stream().filter(i->i>45).map(j->j*3).reduce(0, (t,u)->t+u));
	System.out.println(lista.stream().map(i->i.getBasic()).reduce(0.0, (t,u)->t+u));
}
}
