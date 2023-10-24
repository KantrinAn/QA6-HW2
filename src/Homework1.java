public class Homework1 {
    public static void main(String[] args) {
        /*Создать переменную string1 = "This line that i want to cut, cause it is too long".
Создать строку string2 в которой должно быть помещено значение строки string1,
Обрезанное до "This line that i want to cut, cause".
Создать строку string3 на основе string2 которое будет содержать значение
"This line that don't want to cut, cause it is perfect".
Вывести на консоль каждое сообщение и его длину. */
        String string1 = "This line that i want to cut, cause it is too long.";
        System.out.println(string1);
        System.out.println("Довжина речення: "+ string1.length());
        String string2 = string1.substring(0,36);
        System.out.println(string2+".");
        System.out.println("Довжина речення: "+ string2.length());
        String string3 = string2.replace("This line that i", "This line that don't");
        System.out.println(string3 + " it is perfect.");
        System.out.println("Довжина речення: "+ string3.length());
        }
    }

