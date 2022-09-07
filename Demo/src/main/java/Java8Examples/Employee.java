package Java8Examples;

import java.time.LocalDate;

public class Employee {
private int empNo;
private String ename;
private LocalDate doj;
private double basic;
public Employee(int empNo, String ename, LocalDate doj, double basic) {
	super();
	this.empNo = empNo;
	this.ename = ename;
	this.doj = doj;
	this.basic = basic;
}
public int getEmpNo() {
	return empNo;
}
public String getEname() {
	return ename;
}
public LocalDate getDoj() {
	return doj;
}
public double getBasic() {
	return basic;
}
public void setEmpNo(int empNo) {
	this.empNo = empNo;
}
public void setEname(String ename) {
	this.ename = ename;
}
public void setDoj(LocalDate doj) {
	this.doj = doj;
}
public void setBasic(double basic) {
	this.basic = basic;
}
@Override
public String toString() {
	return "Employee [empNo=" + empNo + ", ename=" + ename + ", doj=" + doj + ", basic=" + basic + "]";
}

}
