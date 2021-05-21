package CreationalDesignPattern.BuilderPattern.House;

public class House {

	public String basement;
	public String structure;
	public String roof;
	public String interior;
	public String getBasement() {
		return basement;
	}
	public void setBasement(String basement) {
		this.basement = basement;
	}
	public String getStructure() {
		return structure;
	}
	public void setStructure(String structure) {
		this.structure = structure;
	}
	public String getRoof() {
		return roof;
	}
	public void setRoof(String roof) {
		this.roof = roof;
	}
	public String getInterior() {
		return interior;
	}
	public void setInterior(String interior) {
		this.interior = interior;
	}
	@Override
	public String toString() {
		return "House [basement=" + basement + ", structure=" + structure + ", roof=" + roof + ", interior=" + interior
				+ "]";
	}
}
