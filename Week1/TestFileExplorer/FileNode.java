import java.io.File;
public class FileNode extends FileSystemNode{

    private long size;

    public FileNode(File file){
        super(file.getName());
        this.size = file.length();
    }

    @Override
    public void print(String indent){
        System.out.println(indent + "- " + this.name);
    }

    public long getSize(){
        return this.size;
    }

    public String getName(){
        return name;
    }
}