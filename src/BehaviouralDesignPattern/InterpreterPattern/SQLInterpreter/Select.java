package BehaviouralDesignPattern.InterpreterPattern.SQLInterpreter;

import java.util.List;

public class Select implements Expression{
	
	public Select(String column, From from) {
		super();
		this.column = column;
		this.from = from;
	}
	String column;
	From from;
	
	@Override
	public List<String> interpret(Context cx){
		
		cx.setColumn(column);
		return from.interpret(cx);
	}

}
