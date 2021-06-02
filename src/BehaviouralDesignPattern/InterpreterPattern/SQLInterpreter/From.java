package BehaviouralDesignPattern.InterpreterPattern.SQLInterpreter;

import java.util.List;

public class From implements Expression{
	
	public From(String table) {
		super();
		this.table = table;
	}
	public From(String table, Where where) {
		super();
		this.table = table;
		this.where = where;
	}
	String table;
	Where where;
	
	@Override
	public List<String> interpret(Context cx) {
		cx.setTable(table);
		if(where==null) {
			return cx.search();
		}
		return where.interpret(cx);
		
	}
	
	

}
