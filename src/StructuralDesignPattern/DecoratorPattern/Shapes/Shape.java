package StructuralDesignPattern.DecoratorPattern.Shapes;

public interface Shape {
    void draw();
    void resize();
    String description();
    boolean isHide();
}