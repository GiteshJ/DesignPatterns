package StructuralDesignPattern.CompositePattern.Directory;

import java.util.ArrayList;

//Directory implements the "lowest common denominator"
class Directory implements AbstractFile {
	private String name;
	private ArrayList<AbstractFile> includedFiles = new ArrayList<>();

	public Directory(String name) {
		this.name = name;
	}

	public void add(AbstractFile obj) {
		includedFiles.add(obj);
	}

	public void ls() {
		System.out.println(DirectoryDemo.compositeBuilder + name);
		DirectoryDemo.compositeBuilder.append("   ");
		includedFiles.forEach(AbstractFile::ls);
		DirectoryDemo.compositeBuilder.setLength(DirectoryDemo.compositeBuilder.length() - 3);
	}
}