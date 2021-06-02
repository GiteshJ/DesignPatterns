package BehaviouralDesignPattern.InterpreterPattern.SQLInterpreter;

import java.util.List;

public interface Expression {

	public List<String> interpret(Context cx);
}
