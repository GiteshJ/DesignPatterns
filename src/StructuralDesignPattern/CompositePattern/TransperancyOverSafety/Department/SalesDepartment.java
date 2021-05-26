package StructuralDesignPattern.CompositePattern.TransperancyOverSafety.Department;

public class SalesDepartment implements Department {

    public SalesDepartment(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	private Integer id;
    private String name;

    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName() +  " " + id +  " " + name);
    }

    public void removeDepartment(Department department) {
    	System.out.println("Cannot remove deparment from leaf level departments");
    }
    
    public String getName() {
    	return this.name;
    }
}
