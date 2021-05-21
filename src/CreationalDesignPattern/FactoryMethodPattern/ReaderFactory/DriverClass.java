package CreationalDesignPattern.FactoryMethodPattern.ReaderFactory;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader xmlReader = ReaderFactory.getReader(ReaderType.XML);
		System.out.println(xmlReader.read());
		
		Reader csvReader = ReaderFactory.getReader(ReaderType.CSV);
		System.out.println(csvReader.read());
		
		Reader dbReader = ReaderFactory.getReader(ReaderType.DB);
		System.out.println(dbReader.read());
	}

}
