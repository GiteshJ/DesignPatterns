package StructuralDesignPattern.CompositePattern.Oragnization;

public class CompanyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee dev = new Developer("1","Tom","Developer");
		Employee prodev = new Developer("1","Jerry","Pro Developer");
		
		Employee hr = new Developer("1","Tom","HR");
		Employee prohr = new Developer("1","Jerry","Pro HR");
		
		Manager manager = new Manager();
		Manager promanager = new Manager();
		
		manager.addEmployee(dev);
		manager.addEmployee(hr);
		
		promanager.addEmployee(prodev);
		promanager.addEmployee(prohr);
		promanager.addEmployee(manager);
		
		promanager.showEmployeeDetails();
	}
}
