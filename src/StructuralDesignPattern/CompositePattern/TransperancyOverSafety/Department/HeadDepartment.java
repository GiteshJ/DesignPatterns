package StructuralDesignPattern.CompositePattern.TransperancyOverSafety.Department;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department {
    private Integer id;
    private String name;

    private List<Department> childDepartments;

    public HeadDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.childDepartments = new ArrayList<>();
    }

    public void printDepartmentName() {
    	if(this.getComositeDepartment()!=null) System.out.println(getClass().getSimpleName() +  " " + id + " " + name);
        childDepartments.forEach(Department::printDepartmentName);
    }

    public void addDepartment(Department department) {
    	System.out.println("Added " + department.getName());
        childDepartments.add(department);
    }

    public void removeDepartment(Department department) {
    	System.out.println("Removed " + department.getName());
        childDepartments.remove(department);
    }
    
    @Override
    public Department getComositeDepartment() {
    	return this;
    }
    
    public String getName() {
    	return this.name;
    }
}