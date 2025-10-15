import java.io.File;
public class Main{
    public static void main(String[]args){
    //excample usage:
    File root = new File("C:\\Users\\p260040\\Desktop\\CS627C OOP-20251015T150923Z-1-001\\CS627C OOP\\Week1\\TestFileExplorer");
    FileSystemNode tree = FileExplorer.buildTree(root);
    tree.print(" ");
    }

    if(tree instanceof DirectoryNode){
        long totalSize = ((DirectoryNode) tree).getSize();
        System.out.println("Total size: " + totalSize + " bytes");
    }
}
