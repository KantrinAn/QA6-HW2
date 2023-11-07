package homework4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*Есть одномерный массив из 10 элементов, заполненный случайными числамиПользователь вводит с клавиатуры число.
        Программа показывает есть ли такое число в созданном до этого массиве.*/
public class RandomArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] randomArray = new int[10];
       for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(10);
        }
        System.out.println("Вкажіть число");
        int number = scanner.nextInt();
        boolean equals = false;
        for (int i = 0; i < randomArray.length && equals == false; i++) {
    if (randomArray[i] == number)
        equals = true;
        }
        if (equals)
            System.out.println("Вказане число є у масиві");
        else{
    System.out.println("Вказане число відсутнє у масиві.");
        }
    }
}


