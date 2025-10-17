import java.util.ArrayList;
public class DirectoryNode extends FileSystemNode{
    public ArrayList<FileSystemNode> children = new ArrayList<>();
    public DirectoryNode(String name)
    {
        super(name);
    }

    public String getName(){
        return name;
    }

    public void addChild(FileSystemNode child){
        children.add(child);
    }

    @Override
    public void print(String indent){
        System.out.println(indent + "+ " + this.name);
        for(FileSystemNode child : children)
        {
            child.print(indent + " ");
        }
    }

    public long getSize(){
        long totalSize = 0;
        for(FileSystemNode child : children){
            if(child instanceof FileNode){
                totalSize += ((FileNode) child).getSize();
            }else if(child instanceof DirectoryNode){
                totalSize += ((DirectoryNode) child).getSize();
            }
        }
        return totalSize;
    }
    
    public FileSystemNode search(String targetName){
        if(this.name.equals(targetName)){
            return this;
        }

        for(FileSystemNode child: children){
            if(child instanceof DirectoryNode){
                FileSystemNode result = ((DirectoryNode)child).search(targetName);
                if(result != null)
                {
                    return result;
                }
            }else if(child instanceof FileNode && child.getName().equals(targetName)){
                return child;
            }
        }
        return null;
    }
}
