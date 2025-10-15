import java.io.File;
public class FileExplorer{
    public static FileSystemNode buildTree(File file){
        if(file.isFile()){
            return new FileNode(file);
        }else{
            DirectoryNode dirNode = new DirectoryNode(file.getName());
            File[] files = file.listFiles();
            if(files != null){
                for(File child : files){
                    dirNode.addChild(buildTree(child));
                }
            }
            return dirNode;
        }
        
        
    }
}