package StructuralDesignPattern.CompositePattern;

/*
 * Composite Design Pattern
The Composite Design Pattern is meant to "compose objects into a tree structure to represent part-whole hierarchies. Composite Pattern lets clients treat individual objects and compositions of objects uniformly".

1. The Composite Design patterns describe groups of objects that can be treated in the same way as a single instance of the same object type.
2. The Composite pattern allows us to "compose" objects into tree structures to represent part-whole hierarchies.
3. In addition, the Composite patterns also allow our clients to treat individual objects and compositions in the same way.
4. The Composite patterns allow us to have a tree structure for each node that performs a task.
5. In object-oriented programming, a Composite is an object designed as a composition of one-or-more similar objects, all exhibiting similar functionality. This is known as a “has-a” relationship between objects.

Below is the list of classes/objects used in the composite pattern, which has four :

1. Component – Component is the interface (or abstract class) for the composition of the objects and methods for accessing/processing its child or node components. It also implements a default interface to define common functionalities/behaviors for all component classes.
2. Leaf – The leaf class defines a concrete component class, which does not have any further composition. The leaf class implements the component interface. It performs the command/task at its end only.
3. Composite – The composite class defines a concrete component class, which stores its child components. The composite class implements the component interface. It forwards the command/task to the composite objects it contains. It may also perform additional operations before and after forwarding the command/task.
4. Client – The client class uses the component interface to interact/manipulate the objects in the composition (Leaf and Composite).
 */
public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
