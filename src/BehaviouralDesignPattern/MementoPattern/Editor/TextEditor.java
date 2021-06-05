package BehaviouralDesignPattern.MementoPattern.Editor;

public class TextEditor {

	private TextWindow textWindow;

	public TextEditor(TextWindow textWindow) {
		super();
		this.textWindow = textWindow;
	}

	private TextWindowState savedTextWindow;

	public void hitSave() {
		savedTextWindow = textWindow.save();
	}

	public void hitUndo() {
		textWindow.restore(savedTextWindow);
	}

	public void write(String text) {
		textWindow.addText(text);
	}

	public String print() {
		return textWindow.getCurrentText();
	}

}
