package BehaviouralDesignPattern.MementoPattern.Editor;

public class TextWindowState {
	
	public TextWindowState(String text) {
		super();
		this.text = text;
	}

	private String text;

	public String getText() {
		return text;
	}
	

}
