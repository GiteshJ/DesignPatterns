package BehaviouralDesignPattern.InterpreterPattern.EmployeeInterpreter.Expressions;

import BehaviouralDesignPattern.InterpreterPattern.EmployeeInterpreter.Employee;

public interface Expression {
	
	public boolean interpret(Employee context);
}