package BehaviouralDesignPattern.VisitorPattern.DocumentVisitor;

public interface Visitor {

    void visit(XmlElement xe);

    void visit(JsonElement je);
}
