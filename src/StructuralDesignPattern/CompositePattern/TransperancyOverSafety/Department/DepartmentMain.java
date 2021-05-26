package StructuralDesignPattern.CompositePattern.TransperancyOverSafety.Department;

public class DepartmentMain {
	public static void main(String args[]) {
        Department salesDepartment = new SalesDepartment(1, "Sales department");
        Department financialDepartment = new FinancialDepartment(2, "Financial department");

        
        testLeafDepartment(salesDepartment);
        testLeafDepartment(financialDepartment);
        
        Department headDepartment = new HeadDepartment(3, "Head department");

        if(headDepartment.getComositeDepartment()!=null) {
	        headDepartment.addDepartment(salesDepartment);
	        headDepartment.addDepartment(financialDepartment);
	
        }
        headDepartment.printDepartmentName();
    }
	
	public static void testLeafDepartment(Department department) {
		System.out.println("Testing " + department.getName());
		department.addDepartment(department);
		department.removeDepartment(department);
        if(department.getComositeDepartment()!=null) {
        	department.addDepartment(department);
        	department.removeDepartment(department);
        }
	}
}
