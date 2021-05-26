package StructuralDesignPattern.CompositePattern.Gird;

//A different kind of "container" classes.  Most of the "meat" is in the Composite base class.
class Column extends Composite {
    public Column(int val) {
        super(val);
    }

    public void traverse() {
        System.out.print("Col");
        super.traverse();
    }
}

