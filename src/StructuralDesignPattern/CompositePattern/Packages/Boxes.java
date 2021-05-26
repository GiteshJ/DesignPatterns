package StructuralDesignPattern.CompositePattern.Packages;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Boxes implements Package{
	public int boxingCost;
	
	ArrayList<Package> packageList;
	
	public Boxes(int boxingCost) {
		this.boxingCost =  boxingCost;
		packageList  = new ArrayList<>();
	}
	
	public int getPrice(){
		int cost = packageList.stream().collect(Collectors.summingInt(Package::getPrice));
		cost += boxingCost;
		return cost;
	}

	public int getBoxingCost() {
		return boxingCost;
	}

	public void setBoxingCost(int boxingCost) {
		this.boxingCost = boxingCost;
	}

	public ArrayList<Package> getPackageList() {
		return packageList;
	}

	public void setPackageList(ArrayList<Package> packageList) {
		this.packageList = packageList;
	}
	
	public void addPackage(Package pack) {
		packageList.add(pack);
	}
	
	public void removePackage(Package pack) {
		packageList.remove(pack);
	}
	
}
