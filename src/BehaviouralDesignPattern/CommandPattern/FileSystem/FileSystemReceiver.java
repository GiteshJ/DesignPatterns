package BehaviouralDesignPattern.CommandPattern.FileSystem;

public interface FileSystemReceiver {

	void openFile();
	void writeFile();
	void closeFile();
}