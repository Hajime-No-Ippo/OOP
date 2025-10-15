import java.io.File;

public class Main {
	
	public static void main(String args[]) {
		File root = new File("/Users/evajiao/Downloads/TestFileExplorer");
		FileSystemNode tree = FileExplorer.buildTree(root);
		tree.print("");
		
		if(tree instanceof DirectoryNode) {
			long totalSize = ((DirectoryNode)tree).getSize();
			System.out.println("Total Size: " + totalSize + "bytes");
		}
		
		FileSystemNode found = ((DirectoryNode)tree).search("file.txt");
		
		if(found != null) {
			System.out.println("File name is " + found.getName());
		}else {
			System.out.println("No File Found.");
		}
		
	}

}
