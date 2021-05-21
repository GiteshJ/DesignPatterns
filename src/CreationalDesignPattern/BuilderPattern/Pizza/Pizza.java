package CreationalDesignPattern.BuilderPattern.Pizza;

/*
 * Product
 */
public class Pizza {

	String dough = "";
	String sauce = "";
	String topping = "";
	
	public String getDough() {
		return dough;
	}
	public void setDough(String dough) {
		this.dough = dough;
	}
	public String getSauce() {
		return sauce;
	}
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	public String getTopping() {
		return topping;
	}
	public void setTopping(String topping) {
		this.topping = topping;
	}
	@Override
	public String toString() {
		return "Pizza [dough=" + dough + ", sauce=" + sauce + ", topping=" + topping + "]";
	}
}
