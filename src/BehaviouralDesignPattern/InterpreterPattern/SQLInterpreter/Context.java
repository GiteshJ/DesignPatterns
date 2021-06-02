package BehaviouralDesignPattern.InterpreterPattern.SQLInterpreter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Context {
	
	private static Map<String ,List<Row>> tables = new HashMap<String, List<Row>>();
	
	static {
		List<Row> data  = new ArrayList<Row>();
		data.add(new Row("John", "Doe"));
		data.add(new Row("Jan", "Kowalski"));
		data.add(new Row("Dominic", "Doom"));
		
		tables.put("people", data);
	}
	
	
	String table;
	String column;
	
	private static final Predicate<String> matchAnyString = s -> s.length()>0;
	private static final Function<String, Stream<? extends String>> matchAllColumns = Stream::of;
	
	
	private  Predicate<String> whereFilter = matchAnyString;
	private  Function<String, Stream<? extends String>> columnMapper = matchAllColumns;
	
	
	private int colIndex = -1;
	public void setTable(String table) {
		this.table = table;
	}
	
	public void setColumn(String column) {
		this.column = column;
		setColumnMapper();
	}
	void setWherefilter(Predicate<String> filter) {
		this.whereFilter = filter;
	}
	
	void clear() {
		column = "";
		columnMapper = matchAllColumns;
		whereFilter = matchAnyString;
	}
	
	private void setColumnMapper() {
		switch(column) {
			case "*":
				colIndex = -1;
				break;
			case "name":
				colIndex = 0;
				break;
			case "surnmae":
				colIndex = 1;
				break;
		}
		if(colIndex!=-1) columnMapper = s-> Stream.of(s.split(" ")[colIndex]);
	}
	
	List<String> search(){
		
		 List<String> result = tables.entrySet()
				.stream()
				.filter(entry -> entry.getKey().equalsIgnoreCase(table))
				.flatMap(entry -> Stream.of(entry.getValue()))
				.flatMap(Collection::stream)
				.map(Row::toString)
				.flatMap(columnMapper)
				.filter(whereFilter)
				.collect(Collectors.toList());
		 
		 clear();
		 
		 return result;
	}
	
	
	

}
