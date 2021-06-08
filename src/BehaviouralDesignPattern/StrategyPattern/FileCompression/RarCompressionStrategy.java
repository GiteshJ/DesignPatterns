package BehaviouralDesignPattern.StrategyPattern.FileCompression;

import java.io.File;
import java.util.ArrayList;

public class RarCompressionStrategy  implements CompressionStrategy {
	public void compressFiles(ArrayList<File> files) {
		System.out.println("Rar  File Compression");
	}
}
