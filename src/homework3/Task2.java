package homework3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
         /*2)
        Пользователь вводит с клавиатуры три целочисленных значения. На экран выводится информация можно ли из этих
        сторон построить треугольник.
    (необходимо вспомнить правило построения треугольника по трем сторонам).*/
        Scanner scanner = new Scanner(System.in);
      System.out.println("Вкажіть три числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
         if (a+b>=c && a+c >= b && b+c >= a){
             System.out.println("Можливо побудувати трикутник");
         } else {
             System.out.println("Не можливо побудувати трикутник");}
    }
}
