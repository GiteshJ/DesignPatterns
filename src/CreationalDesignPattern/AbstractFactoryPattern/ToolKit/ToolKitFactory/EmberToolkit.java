package CreationalDesignPattern.AbstractFactoryPattern.ToolKit.ToolKitFactory;

import CreationalDesignPattern.AbstractFactoryPattern.ToolKit.CPU.CPU;
import CreationalDesignPattern.AbstractFactoryPattern.ToolKit.CPU.EmberCPU;
import CreationalDesignPattern.AbstractFactoryPattern.ToolKit.MMU.EmberMMU;
import CreationalDesignPattern.AbstractFactoryPattern.ToolKit.MMU.MMU;

public class EmberToolkit implements ToolKitFactory{
	@Override
	public CPU createCPU() {
	    return new EmberCPU();
	}
	
	@Override
	public MMU createMMU() {
	    return new EmberMMU();
	}

}
