package ClassWork;

public class Aquarium {
    private  int length;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    private int width;
    private  int height;
    private String name;


public void setLength(int length){
        this.length = length;
    }
    public int getLength(){
        return length;

    }
    public void setName (String name) {
    this.name = name;
    }
    public String getName (){
    return name;
    }
    public void getInfo (){
        System.out.println("Длина аквариума "+length);
        System.out.println("Ширина аквариума "+ width);
        System.out.println("Высота аквариума " + height);
        System.out.println("Название аквариума " + name);
    }
}
