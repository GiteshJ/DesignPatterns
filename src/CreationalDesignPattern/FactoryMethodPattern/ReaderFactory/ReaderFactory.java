package CreationalDesignPattern.FactoryMethodPattern.ReaderFactory;

public class ReaderFactory {
	
	public static Reader getReader(ReaderType type) {

		Reader reader = null;
		switch(type) {
			case XML:
				reader = new XmlReader();
				break;
			case CSV:
				reader = new CsvReader();
				break;
			case DB:
				reader = new DBReader();
				break;
		}
		
		return reader;
	}
}
