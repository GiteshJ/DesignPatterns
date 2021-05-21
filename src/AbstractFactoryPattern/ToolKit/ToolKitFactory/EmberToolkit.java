package AbstractFactoryPattern.ToolKit.ToolKitFactory;

import AbstractFactoryPattern.ToolKit.CPU.CPU;
import AbstractFactoryPattern.ToolKit.CPU.EmberCPU;
import AbstractFactoryPattern.ToolKit.MMU.EmberMMU;
import AbstractFactoryPattern.ToolKit.MMU.MMU;

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
