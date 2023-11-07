package homework4;

import java.util.Scanner;

public class WhoWhereWhen {
    /*Первый будет состоять из следующих имен: “Петя”, “Маша”, “Алёна”, “Федя”, “Саша”, “Антон”, “Глеб”.
    Второй будет содержать следующие значения типа int: 10, 12, 14, 16, 18, 20.
    Третий будет содержать следующие значения: “школу”, “магазин”, “церковь”, “тренажерный зал”, “кино”, “поликлинику”.
    Пользователь вводит три числа с клавиатуры, которые будут соответствовать индексам каждого из элементов массивов.
    Пример1. после ввода 3,2,1: На экране должно вывестись следующее сообщение:
        “Федя будет идти в магазин в 14:00” Пример2. после ввода 1,2,3:
    На экране должно вывестись следующее сообщение: “Маша будет идти в тренажерный зал в 14:00”*/
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     String [] names = { "Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб"};
     int [] time = {10, 12, 14, 16, 18, 20};
     String [] place = {"школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику"};
     int name;
      do {
          System.out.println("Type number form 0 to 6");
         int who = scanner.nextInt();
          name = who;
      }
         while (name<0 || name >= names.length);
         int hour;
         do {
             System.out.println("Type number from 0 to 5");
             int when = scanner.nextInt();
             hour = when;
         } while (hour < 0 || hour>= time.length);
         int building;
         do {
             System.out.println("Type number from 0 to 5");
             int where = scanner.nextInt();
             building = where;
         } while (building< 0 || building>= place.length);
        System.out.println(names[name]+ " будет идти в " + place[building]+ " в " + time[hour]);


    }
}
