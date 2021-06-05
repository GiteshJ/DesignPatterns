package BehaviouralDesignPattern.MementoPattern.Editor;

public class TextWindow {
	
	private StringBuilder text;
	
	public TextWindow() {
		this.text = new StringBuilder();
	}
	
	public String getCurrentText() {
        return text.toString();
    }

	
	public void addText(String text) {
		this.text.append(text);
	}
	
	public TextWindowState save() {
		return new TextWindowState(this.text.toString());
	}
	
	public void restore(TextWindowState save) {
		this.text = new StringBuilder(save.getText());
	}

}
