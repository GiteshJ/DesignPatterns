package StructuralDesignPattern.AdapterPattern.Shapes.Shape;

public interface Shape {
    void draw();
    void resize();
    String description();
    boolean isHide();
}