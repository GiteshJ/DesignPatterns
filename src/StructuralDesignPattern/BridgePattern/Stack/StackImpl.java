package StructuralDesignPattern.BridgePattern.Stack;

interface StackImpl {
    void push(int i);
    int pop();
    int top();
    boolean isEmpty();
    boolean isFull();
}