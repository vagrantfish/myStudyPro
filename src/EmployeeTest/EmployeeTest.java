package EmployeeTest;
import java.util.*;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("carl cracker",75000,1987,12,15);
		staff[1] = new Employee("Harry Hacker",50000,1989,10,1);
		staff[2] = new Employee("Tony Tester",40000,1990,3,15);
		
		for (Employee e:staff)
			e.raiseSalary(5);
		
		for(Employee e :staff)
			System.out.println("name=" + e.getName()+",salay="+ e.getSalary()+",hireday="+e.getHireDay());
	
		
		double xxx = 1.1;
		double yyy = 0;
		yyy=Math.pow(xxx, 15);
		
		System.out.println(yyy);
	
	}
	

}

class Employee
{
	private static int nextId =1;
	private String name;
	private double salary;
	private Date hireDay;
	private int id;
	
	public Employee(String n, double s, int year, int month, int day)
	{
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month-1,day);
		hireDay = calendar.getTime();
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId()
	{
		id = nextId;
		nextId++;
	}
	
	public static int getNextId()
	{
		return nextId;
	}
	
	
	
	public Date getHireDay()
	{
		return hireDay;
	}
	
	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
	
}
