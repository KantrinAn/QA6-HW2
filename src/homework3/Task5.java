package homework3;

import java.util.Scanner;

public class Task5 {
    /*Написать программу, используя тернарный оператор, где пользователь вводит с клавиатуры два числа
    и символ – или + или % или / или *. На экран выводится резултат действия над двумя введенными числами.
    Если пользователь ввел что-то кроме данных символов, то необходимо вывести 0.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше число");
        double firstNumber = scanner.nextDouble();
        System.out.println("Введіть друге число");
        double secondNumber = scanner.nextDouble();
        System.out.println("Введіть символ");
        String symbol = scanner.next();
        double result = symbol.equals("-") ? firstNumber - secondNumber :
                symbol.equals("+") ? firstNumber + secondNumber :
                symbol.equals("%") ? firstNumber % secondNumber :
                symbol.equals("/") ? firstNumber / secondNumber :
                symbol.equals("*") ? firstNumber * secondNumber : 0;
        System.out.println(result);

    }
}
