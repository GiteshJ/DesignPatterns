package BehaviouralDesignPattern.VisitorPattern.ElementVisitor;

interface Visitor {
    void visit(FOO foo);
    void visit(BAR bar);
    void visit(BAZ baz);
}