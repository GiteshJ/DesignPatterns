package AbstractFactoryPattern.ToolKit;

import AbstractFactoryPattern.ToolKit.CPU.CPU;
import AbstractFactoryPattern.ToolKit.MMU.MMU;
import AbstractFactoryPattern.ToolKit.ToolKitFactory.ToolKitFactory;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CPU cpu;
		MMU mmu;
		ToolKitFactory factory;
		
		System.out.println("Ember Factory");
		factory = ToolKitFactory.getFactory(Architecture.EMBER);
		cpu = factory.createCPU();
		cpu.show();
		mmu = factory.createMMU();
		mmu.show();
		
		System.out.println("Enginola Factory");
		factory = ToolKitFactory.getFactory(Architecture.ENGINOLA);
		cpu = factory.createCPU();
		cpu.show();
		mmu = factory.createMMU();
		mmu.show();
	}

}
