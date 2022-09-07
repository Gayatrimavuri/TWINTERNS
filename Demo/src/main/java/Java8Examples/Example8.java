package Java8Examples;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class Example8 {
public static void main(String[] args) {
	DateTimeFormatter D=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
	List<Employee>list =Arrays.asList(
			new Employee(1, "RAM", LocalDate.parse("01-Jul-2022",D), 30000),
			new Employee(2, "RAVI", LocalDate.parse("01-Jun-2021",D), 40000),
			new Employee(3, "SHEKAR", LocalDate.parse("01-Jan-2020",D), 70000),
			new Employee(4, "NAVEEN", LocalDate.parse("01-Sep-2021",D), 80000)
			);
list.forEach(i->System.out.println(i.getEmpNo()+ " "+i.getEname()+ " "+D.format(i.getDoj())+ " "+i.getBasic()));			
			
}
}
