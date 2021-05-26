package StructuralDesignPattern.CompositePattern.TransperancyOverSafety.Department;

public interface Department {
    void printDepartmentName();
    
    String getName();
    default Department getComositeDepartment() {
    	return null;
    }
    
    // either we can give default implementation that can be used by leaf classes 
    // or we can make leaf classes give meaningful implementation of it
    default void addDepartment(Department department) {
    	System.out.println("Cannot add deparment from leaf level departments");
    }

    public void removeDepartment(Department department);
}