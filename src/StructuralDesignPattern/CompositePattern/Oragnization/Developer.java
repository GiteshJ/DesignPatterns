package StructuralDesignPattern.CompositePattern.Oragnization;

public class Developer implements Employee{

	public Developer(String name, String id, String position) {
		super();
		this.name = name;
		this.id = id;
		this.position = position;
	}

	public String name;
	public String id;
	public String position;
	
	public void showEmployeeDetails() {
		System.out.println(id + " " + name + " " + position );
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
}
