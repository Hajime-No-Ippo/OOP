public abstract class FileSystemNode{
    protected String name;

    public FileSystemNode(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void print(String indent){
        System.out.println();
    }
}