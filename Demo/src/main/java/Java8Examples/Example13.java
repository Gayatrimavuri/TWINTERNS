package Java8Examples;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Example13 {
public static void main(String[] args) {
	DateTimeFormatter D=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
	List<Employee>list =Arrays.asList(
			new Employee(1, "RAM", LocalDate.parse("01-Jul-2019",D), 90000),
			new Employee(2, "RAVI", LocalDate.parse("01-Jun-2021",D), 40000),
			new Employee(3, "SHEKAR", LocalDate.parse("01-Jan-2020",D), 70000),
			new Employee(4, "NAVEEN", LocalDate.parse("01-Sep-2018",D), 50000)
			);
	
	Function<Employee,Employee>F=new Function<Employee,Employee>(){

		@Override
		public Employee apply(Employee t) {
			// TODO Auto-generated method stub
		 t.setBasic(t.getBasic()+0.1*t.getBasic());
		 return t;
		}

		
	
	};
	
	
	list.stream().map(t->{t.setBasic(t.getBasic()+0.1*t.getBasic()); return t;}).forEach(i->System.out.println(i));
	
//list.stream().map(F).forEach(i->System.out.println(i));
	
}
}
