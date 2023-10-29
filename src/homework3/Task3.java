package homework3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
             /* 3)
        При помощи тернарного оператора необходимо получить разность двух чисел введенных с клавиатуры,
        и всегда отнимать от большего меньшее. Вывести эту разность в консоль.*/
       System.out.println("Type first number");
        int x = scanner.nextInt();
        System.out.println("Type second number");
        int y = scanner.nextInt();
        int m = x - y;
        int n = y - x;
        int result = x>=y ? m : n;
        System.out.println(result);

    }
}
