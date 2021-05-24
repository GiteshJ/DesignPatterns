package StructuralDesignPattern.BridgePattern;

/*
 * Links - (https://www.geeksforgeeks.org/bridge-design-pattern/, https://sourcemaking.com/design_patterns/bridge,
 * 		https://refactoring.guru/design-patterns/bridge , https://www.tutorialspoint.com/design_pattern/bridge_pattern.htm)
 *
 * Check list
1 .Decide if two orthogonal dimensions exist in the domain. 
	These independent concepts could be: abstraction/platform, or domain/infrastructure, 
	or front-end/back-end, or interface/implementation.
2 .Design the separation of concerns: what does the client want, and what do the platforms provide.
3. Design a platform-oriented interface that is minimal, necessary, and sufficient. 
	Its goal is to decouple the abstraction from the platform.
4. Define a derived class of that interface for each platform.
5. Create the abstraction base class that "has a" platform object and delegates the platform-oriented functionality to it.
6. Define specializations of the abstraction class if desired.


 * Elements of Bridge Design Pattern

1. Abstraction – core of the bridge design pattern and defines the crux. Contains a reference to the implementer.
2. Refined Abstraction – Extends the abstraction takes the finer detail one level below. 
						Hides the finer elements from implementors.
3. Implementer – It defines the interface for implementation classes. 
				This interface does not need to correspond directly to the abstraction interface and can be very different.
				Abstraction imp provides an implementation in terms of operations provided by Implementer interface.
4. Concrete Implementation – Implements the above implementer by providing concrete implementation.
 */
public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
