package Java8Examples;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class Example11 {
public static void main(String[] args) {
	DateTimeFormatter D=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
	List<Employee>list =Arrays.asList(
			new Employee(1, "RAM", LocalDate.parse("01-Jul-2019",D), 90000),
			new Employee(2, "RAVI", LocalDate.parse("01-Jun-2021",D), 40000),
			new Employee(3, "SHEKAR", LocalDate.parse("01-Jan-2020",D), 70000),
			new Employee(4, "NAVEEN", LocalDate.parse("01-Sep-2018",D), 50000)
			);
list.stream().filter(i->i.getBasic()>50000).forEach(j->System.out.println(j.getEmpNo()));
LocalDate L=LocalDate.parse("31-Dec-2019",D);
list.stream().filter(i->(i.getDoj().compareTo(L)<1) && i.getBasic()>60000).forEach(j->System.out.println(j.getEmpNo()));
}

}
