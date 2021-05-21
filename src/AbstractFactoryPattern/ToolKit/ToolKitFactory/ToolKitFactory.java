package AbstractFactoryPattern.ToolKit.ToolKitFactory;

import AbstractFactoryPattern.ToolKit.Architecture;
import AbstractFactoryPattern.ToolKit.CPU.CPU;
import AbstractFactoryPattern.ToolKit.MMU.MMU;

public interface ToolKitFactory {

	 static ToolKitFactory getFactory(Architecture architecture) {
		 ToolKitFactory factory = null;
	        switch (architecture) {
	            case ENGINOLA:
	                factory = new EnginolaToolkit();
	                break;
	            case EMBER:
	                factory = new EmberToolkit();
	                break;
	        }
	        return factory;
	    }
	 
	public CPU createCPU();
	
	public MMU createMMU();
}
