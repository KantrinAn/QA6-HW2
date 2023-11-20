package homework6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/* 1) Пользователь задает размерность двумерного массива с клавиатуры.
Массив заполняется случайными числами от 0 до 1000.
        Необходимо создать одномерный массив, состоящий из максимальных значений
        каждого отдельного массива входящего в двумерный.
        Новый полученный массив вывести на экран.
*/
public class ArrayFromZeroToHundred {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size first array");
        int sizeFirstArray = scanner.nextInt();
        System.out.println("Enter size second array");
        int sizeSecondArray = scanner.nextInt();
        int [][] manyArrays = new int[sizeFirstArray][sizeSecondArray];
        Random random = new Random();
        for (int i = 0; i < manyArrays.length; i++) {
            for (int j = 0; j < manyArrays[i].length; j++) {
                manyArrays[i][j] = random.nextInt(1000);
            }
        }
        System.out.println(Arrays.deepToString(manyArrays));
      int [] arrayMax = new int[manyArrays.length];
      for (int i = 0; i < manyArrays.length; i++) {
          int max = manyArrays[i][0];
                for (int b =0; b< manyArrays[i].length; b ++) {
              if (manyArrays[i][b] > max) {
                  max = manyArrays[i][b];
              }
                    arrayMax[i] = max;
          }
      }

        System.out.println(Arrays.toString(arrayMax));  }

    }

