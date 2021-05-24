package StructuralDesignPattern.BridgePattern.Stack;

class StackHanoi extends Stack {
    private int totalRejected = 0;

    
    public StackHanoi(StackImpl s) {
    	super(s);
    }

    public int reportRejected() {
        return totalRejected;
    }

    public void push(int in) {
        if (!isEmpty() && in > top()) {
            totalRejected++;
        }
        else {
            super.push(in);
        }
    }
}
