package Java8Examples;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example9 {
public static void main(String[] args) {
	DateTimeFormatter D=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
	List<Employee>list =Arrays.asList(
			new Employee(1, "RAM", LocalDate.parse("01-Jul-2022",D), 90000),
			new Employee(2, "RAVI", LocalDate.parse("01-Jun-2021",D), 40000),
			new Employee(3, "SHEKAR", LocalDate.parse("01-Jan-2020",D), 70000),
			new Employee(4, "NAVEEN", LocalDate.parse("01-Sep-2021",D), 80000)
			);
//	Comparator<Employee> C=new Comparator<Employee>() {
//
//		@Override
//		public int compare(Employee o1, Employee o2) {
//			if(o1.getBasic()>o2.getBasic())
//				return 1;
//			else if(o1.getBasic()<o2.getBasic())
//				return -1;
//			else
//				return 0;
//		}
//	};
//	
//	List<Employee> L=list.stream().sorted(C).collect(Collectors.toList());

	Comparator<Employee>C=(o1,o2)->{
		return (int)(o1.getBasic()-o2.getBasic());
		
	};
	
	//List<Employee> L=list.stream().sorted(C).collect(Collectors.toList());
	//List<Employee>L=list.stream().sorted((o1,o2)->(int)(o1.getBasic()-o2.getBasic())).collect(Collectors.toList());
	//L.stream().forEach(i->System.out.println(i.getEmpNo()));
	list.stream().sorted((o1,o2)->(int)(o1.getBasic()-o2.getBasic())).forEach(i->System.out.println(i.getEmpNo()));
	
	list.forEach(i->System.out.println(i.getEmpNo()));
	
	Collections.sort(list,(o1,o2)->(int)(o1.getBasic()-o2.getBasic()));
	list.forEach(i->System.out.println(i.getEmpNo()));
	
//	for(int i=0;i<list.size();i++)
//	{
//		if(list.get(i).getBasic()>=50000)
//		{
//			System.out.println(list.get(i).getEmpNo()+ " "+ list.get(i).getEname());
//		}
//	}
}
}
