package AbstractFactoryPattern.ToolKit.ToolKitFactory;

import AbstractFactoryPattern.ToolKit.CPU.CPU;
import AbstractFactoryPattern.ToolKit.CPU.EnginolaCPU;
import AbstractFactoryPattern.ToolKit.MMU.EnginolaMMU;
import AbstractFactoryPattern.ToolKit.MMU.MMU;

public class EnginolaToolkit implements ToolKitFactory{
	
	@Override
	public CPU createCPU() {
	    return new EnginolaCPU();
	}
	
	@Override
	public MMU createMMU() {
	    return new EnginolaMMU();
	}
}
