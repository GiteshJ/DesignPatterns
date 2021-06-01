package BehaviouralDesignPattern.CommandPattern.FileSystem;

public class FileSystemReceiverUtil {

	public static FileSystemReceiver getUnderlyingFileSystem(OS os) {

		switch(os){
			case WINDOWS:
				return new WindowsFileSystemReceiver();
			case LINUX:
				return new UnixFileSystemReceiver();
			default:
				System.out.println("Not Supported");
				return null;
				
		}
	}

}