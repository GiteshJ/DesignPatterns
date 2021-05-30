package StructuralDesignPattern.ProxyPattern.YouTube;

public class Video {

	String id;
	String title;
	String data;
	
	public Video(String id, String title) {
		this.id = id;
		this.title = title;
		this.data = "Random Video ";
	}
}
