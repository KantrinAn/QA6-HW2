package homework8;

import java.util.Scanner;

public class Calkulator {
    /*
        summ, minus, multiply, division.
                Сложение, вычитание, умножение и деление соответственно.
        Каждый метод принимает в качестве параметров два значения типа double.
        И выводит в консоль результат действия.

        Также в классе есть метод старт. Который выводит сообщение в консоль, что
        калькулятор запущен. И предлагает ввести действие в вашей консоли.

        Калькулятор должен принимать только следующие типы действий:
                2+4;    - пример синтаксиса сложения;
    5-6;    - пример синтаксиса вычитания;
    25*3;   - пример синтаксиса умножения;
    34/3;   - пример синтаксиса деления;*/
    public void summ(double one, double second) {
        double summ = one + second;
        System.out.println("Result: " + summ);
    }

    public void minus(double one, double second) {
        double minus = one - second;
        System.out.println("Result: " + minus);
    }

    public void multiply(double one, double second) {
        double multiply = one * second;
        System.out.println("Result: " + multiply);
    }

    public void division(double one, double second) {
        double division = one / second;
        System.out.println("Result: " + division);
    }

    /*   Также в классе есть метод старт. Который выводит сообщение в консоль, что
       калькулятор запущен. И предлагает ввести действие в вашей консоли.*/
    public void start() {
        System.out.println("калькулятор запущен.");
        Scanner scanner = new Scanner(System.in);
        String conditional;
        do {
            System.out.println("введите пример");
            conditional = scanner.nextLine();
            if (conditional.equalsIgnoreCase("stop")) {
                System.out.println("Калькулятор закрыт");
                break;
            } else if (conditional.contains("+")) {
                double one = Double.parseDouble(conditional.split("\\+")[0]);
                double second = Double.parseDouble(conditional.split("\\+")[1]);
                summ(one, second);
            } else if (conditional.contains("-")) {
                double one = Double.parseDouble(conditional.split("\\-")[0]);
                double second = Double.parseDouble(conditional.split("\\-")[1]);
                minus(one, second);
            } else if (conditional.contains("*")) {
                double one = Double.parseDouble(conditional.split("\\*")[0]);
                double second = Double.parseDouble(conditional.split("\\*")[1]);
                multiply(one, second);
            } else if (conditional.contains("/")) {
                double one = Double.parseDouble(conditional.split("\\/")[0]);
                double second = Double.parseDouble(conditional.split("\\/")[1]);
                division(one, second);
            } else {
                System.out.println("Введите корректное действие");
            }
        }
            while (!conditional.equalsIgnoreCase("stop")) ;

    }
}
