package homework8;
public class Tree {
    public String type;
    public int height;

    @Override
    public String toString() {
        return "Tree{" +
                "type='" + type + '\'' +
                ", height=" + height +
                ", coutOfsticks=" + coutOfsticks +
                ", colour='" + colour + '\'' +
                '}';
    }

    public int coutOfsticks;
    public String colour;

    public Tree(String type, int height) {
        this.type = type;
        this.height = height;
        this.coutOfsticks = 13;
        this.colour = "green";
    }
    public Tree(int height, int coutOfsticks, String colour) {
        this.height = height;
        this.coutOfsticks = coutOfsticks;
        this.colour = colour;
        this.type = "pihta";
    }
    public Tree ( String type){
        this.height = 350;
        this.coutOfsticks = 29;
        this.colour = "yellow";
        this.type= type;
    }
    public Tree (int height, int coutOfsticks, String colour, String type) {
    this(height, coutOfsticks, colour);
       this.type = type;

    }

}