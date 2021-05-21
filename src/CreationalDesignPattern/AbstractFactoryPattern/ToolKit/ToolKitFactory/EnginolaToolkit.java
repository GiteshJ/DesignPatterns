package CreationalDesignPattern.AbstractFactoryPattern.ToolKit.ToolKitFactory;

import CreationalDesignPattern.AbstractFactoryPattern.ToolKit.CPU.CPU;
import CreationalDesignPattern.AbstractFactoryPattern.ToolKit.CPU.EnginolaCPU;
import CreationalDesignPattern.AbstractFactoryPattern.ToolKit.MMU.EnginolaMMU;
import CreationalDesignPattern.AbstractFactoryPattern.ToolKit.MMU.MMU;

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
