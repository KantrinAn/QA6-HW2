package homework8;

public class Main {
    public static void main(String[] args) {
       Computer first = new Computer("asus",32,23000,435);
        Computer second = new Computer("Mac", 32,50000, 435);
        Computer third = new Computer("asus",32,32000, 435);
        first.getInfo();
        second.getInfo();
        third.getInfo();
        System.out.println("Does first computer equal third computer equals ?" + first.equals(third));
        System.out.println("Does first computer equal second computer? " + first.equals(second));
        System.out.println("Does second computer equal the third computer? " + second.equals(third));

        Tree one = new Tree("dub", 123);
        Tree two = new Tree(140,456,"green");
        Tree thee = new Tree( "topol");
        Tree four = new Tree(34,234,"brown","klen");
        System.out.println(one);
        System.out.println(two);
        System.out.println(thee);
        System.out.println(four);

        System.out.println(new Converter("Conv").convertToString(123));
Calkulator calkulator = new Calkulator();
calkulator.start();
    }
}
