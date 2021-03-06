package StructuralDesignPattern.CompositePattern.Directory;

//File implements the "lowest common denominator"
class File implements AbstractFile {
	private String name;

	public File(String name) {
		this.name = name;
	}

	public void ls() {
		System.out.println(DirectoryDemo.compositeBuilder + name);
	}
}