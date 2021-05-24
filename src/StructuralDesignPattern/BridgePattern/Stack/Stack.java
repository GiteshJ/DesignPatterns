package StructuralDesignPattern.BridgePattern.Stack;

class Stack {
    protected StackImpl impl;

    public Stack( StackImpl s ) {
        this.impl = s;
    }


    public void push(int in) {
        impl.push( in );
    }

    public int pop() {
        return impl.pop();
    }

    public int top() {
        return impl.top();
    }

    public boolean isEmpty() {
        return impl.isEmpty();
    }

    public boolean isFull() {
        return impl.isFull();
    }
}