package homework4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
      /*  Написать проограмму, условно для склада приема металла.
        Представим, что склад может хранить определенный вес металла.
        Пользователь вводит с клавиатуры вес, который может хранится на складе.
        Дальше пользователь вводит с клавиатуры вес, который условно собирается сдать на склад пользователь.
        Программа должна после каждой сдачи металла показывать сколько веса еще может принять склад.
                Если пользователь хочет сдать металла больше чем осталось места на складе,
        то программа не дает ему это сделать и уведомляет пользователя, о невозможности данной операции.
                Если пользователь сдает металл весом меньше чем 5,
                программа тоже предупреждает о невозможности приемки такого малого веса.
        Программа завершается, когда место на складе закончилось.*/
        Scanner scanner = new Scanner(System.in);
        int weight = 0;
        while (weight <= 500) {
            System.out.println("Enter the weight do you give ");
            int tempWeight = scanner.nextInt();
            if (weight + tempWeight > 500) {
                System.out.println("The limit has been reached");
                System.out.println("You can add " + (500 - weight));
                continue;
            }
            if (weight+ tempWeight == 500) {
                break;
            }
            if (tempWeight == 500) {
                break;
            }
            if (tempWeight<= 5) {
                System.out.println("Weight is too small");
                continue;
            }
            weight = weight + tempWeight;
            System.out.println("You can add " + (500 - weight));
        }
        System.out.println("FINAL");
    }
}
