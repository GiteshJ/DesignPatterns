package StructuralDesignPattern.ProxyPattern.ImageSystem;

public interface Image {

	public void load();

	public void show();

	public void showSummary();

	public void resize();

	public void remove();

	public void close();
}