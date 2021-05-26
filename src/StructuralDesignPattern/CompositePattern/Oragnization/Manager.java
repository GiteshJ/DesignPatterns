package StructuralDesignPattern.CompositePattern.Oragnization;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee{
	
	
	
	private List<Employee> employeeList = new ArrayList<Employee>();
	
	@Override
    public void showEmployeeDetails() 
    {
		employeeList.forEach(Employee::showEmployeeDetails);
    }
       
    public void addEmployee(Employee emp)
    {
        employeeList.add(emp);
    }
       
    public void removeEmployee(Employee emp)
    {
        employeeList.remove(emp);
    }
}