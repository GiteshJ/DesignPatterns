package StructuralDesignPattern.BridgePattern.Stack;

class StackFIFO extends Stack {
    
	
	private StackImpl stackImpl = new StackList();
	public int pop() {
        while (!isEmpty()) {
            stackImpl.push(super.pop());
        }
        int ret = stackImpl.pop();
        while (!stackImpl.isEmpty()) {
            push(stackImpl.pop());
        }
        return ret;
    }
	
    public StackFIFO(StackImpl s) {
    	super(s);
    }


    
}
