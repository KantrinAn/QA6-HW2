package homework7;

public class Main {
    public static void main(String[] args) {
        int array []  = {2,4,54,67,899,90,55,93,66};
        new MethodArray().returnCountNumbers(array);
        System.out.println("==============");
        Method method= new Method();
        method.someOperation();
        method.someOperation(new int[] {2,3,4,5});
        method.someOperation("words");
        method.someOperation(new String[]{"do","re","mi"});
        method.someOperation("my text",43);
    }
}
