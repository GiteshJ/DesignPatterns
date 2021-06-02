package BehaviouralDesignPattern.InterpreterPattern.SQLInterpreter;

import java.util.List;
import java.util.function.Predicate;

public class Where implements Expression{
	
	public Where(Predicate<String> filter) {
		super();
		this.filter = filter;
	}

	Predicate<String> filter;

	@Override
	public List<String> interpret(Context cx) {
		cx.setWherefilter(filter);
		return cx.search();
	}

	public Predicate<String> getFilter() {
		return filter;
	}

	public void setFilter(Predicate<String> filter) {
		this.filter = filter;
	}

	
}
