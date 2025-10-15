public abstract class FileSystemNode {
	protected String name;
	
	public FileSystemNode (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public abstract void print(String indent);


	
	/*public static void setName (String name) {
		this.name = name;
	}*/
}
