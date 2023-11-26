package homework8;

public class Converter {
    private String name;
    public Converter(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
public int convertToInt (byte o) {
        return o;
}
public int convertToInt (short o) {
        return o;
}
public int convertToInt (int o) {
        return o;
}
public  int convertToInt (long o) {
        return (int) o;
}
public int convertToInt (char o) {
    return o;
}
public int convertToInt (float o){
    return (int) o;
}
public int convertToInt (double o) {
    return (int) o;
}
public int convertToInt (String o){

    return Integer.parseInt(o);
}
public void convertToInt(boolean o) {
    System.out.println("введен тип boolean.");
}
public double convertToDouble (byte b) {
    return b;
}
public double convertToDouble (short b) {
    return b;
    }
public double convertToDouble (int b) {
    return b;
}
public double convertToDouble (long b)  {
    return b;
}
public double convertToDouble (char b) {
    return b;
}
    public double convertToDouble (float b) {
    return b;
    }
    public double convertToDouble (double b) {
    return b;
    }
    public double convertToDouble (String b) {
    return Double.parseDouble(b);
    }
public void convertToDouble () {
        System.out.println("введен тип boolean.");
    }
 /*convertToString; (конвертирует byte, short, int, long, char, boolean, float, double, String).*/
public String convertToString (byte s) {
    return Byte.toString(s);
}
    public String convertToString (short s) {
    return Short.toString(s);
    }
    public String convertToString (int s) {
    return Integer.toString(s);
    }
    public String convertToString (long s){
    return  Long.toString(s);
    }
    public String convertToString (char s){
    return Character.toString(s);
    }
    public String convertToString (boolean s) {
    return Boolean.toString(s);
    }
    public String convertToString (float s){
    return Float.toString(s);
    }
    public String convertToString (double s) {
    return Double.toString(s);
    }
    public String convertToString (String s) {
        return s;
    }
}


