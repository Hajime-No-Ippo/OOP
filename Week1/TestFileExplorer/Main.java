import java.io.File;
public class Main{
    public static void main(String[]args){
    //excample usage:
    File root = new File("/Users/tobymiles/CS627C OOP/Week1");
    FileSystemNode tree = FileExplorer.buildTree(root);
    tree.print(" ");
    

    if(tree instanceof DirectoryNode){
        long totalSize = ((DirectoryNode) tree).getSize();
        System.out.println("Total size: " + totalSize + " bytes");
    }
    
    FileSystemNode found = ((DirectoryNode)tree).search("w.csv");
		
	if(found != null) {
		System.out.println("File name is " + found.getName());
	}else {
		System.out.println("No File Found.");
	}
		

}
}