package BehaviouralDesignPattern.StrategyPattern.FileCompression;

import java.io.File;
import java.util.ArrayList;

public class ZipCompressionStrategy  implements CompressionStrategy {
	public void compressFiles(ArrayList<File> files) {
		System.out.println("Zip File Compression");
	}
}
