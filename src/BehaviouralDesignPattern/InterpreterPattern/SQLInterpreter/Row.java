package BehaviouralDesignPattern.InterpreterPattern.SQLInterpreter;

public class Row {

	public Row(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}
	String name;
	String surname;
	@Override
	public String toString() {
		return  name + " " + surname ;
	}
	
	
}
