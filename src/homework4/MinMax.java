package homework4;

import java.util.Arrays;
import java.util.Random;
/*Заполнить массив на 45 элементов случайными числами от -50 до +50.
        Найти минимальный элемент и вывести его на консоль.
        Найти максимальный элемент и вывести его на консоль.*/
public class MinMax {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[45];
        for (int i = 0; i< array.length; i++) {
            array[i] = random.nextInt(-50, 50);
                    }
        Arrays.sort(array);
        System.out.println("мінімальне число "+ array[0]);
        System.out.println("максимальне число " + array[array.length-1]);


            }
        }
