package BehaviouralDesignPattern.InterpreterPattern.QueryInterpreter;

public class QueryDemo {

	public static void main(String[] args) 
    {
        Expression person1 = new TerminalExpression("Kushagra");
        Expression person2 = new TerminalExpression("Lokesh");
        Expression isSingle = new OrExpression(person1, person2);
          
        Expression vikram = new TerminalExpression("Vikram");
        Expression committed = new TerminalExpression("Committed");
        Expression isCommitted = new AndExpression(vikram, committed);    
  
        System.out.println(isSingle.interpreter("Kushagra"));
        System.out.println(isSingle.interpreter("Lokesh"));
        System.out.println(isSingle.interpreter("Achint"));
          
        System.out.println(isCommitted.interpreter("Committed, Vikram"));
        System.out.println(isCommitted.interpreter("Single, Vikram"));
  
        
        test2();
    }
	
	
	//Rule: Robert and John are male
	   public static Expression getMaleExpression(){
	      Expression robert = new TerminalExpression("Robert");
	      Expression john = new TerminalExpression("John");
	      return new OrExpression(robert, john);		
	   }

	   //Rule: Julie is a married women
	   public static Expression getMarriedWomanExpression(){
	      Expression julie = new TerminalExpression("Julie");
	      Expression married = new TerminalExpression("Married");
	      return new AndExpression(julie, married);		
	   }

	   public static void test2() {
	      Expression isMale = getMaleExpression();
	      Expression isMarriedWoman = getMarriedWomanExpression();

	      System.out.println("John is male? " + isMale.interpreter("John"));
	      System.out.println("Julie is male? " + isMale.interpreter("Julie"));
	      System.out.println("Julie is a married women? " + isMarriedWoman.interpreter("Married Julie"));
	   }
}
