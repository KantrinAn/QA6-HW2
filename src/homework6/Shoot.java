package homework6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Shoot {
 /*   2) Написати програму “стрільба по цілі”.
    Технічні вимоги:

            • Даний квадрат 5х5, де програма випадковим чином ставить ціль.
            • Перед початком гри на екран виводиться текст: All Set. Get ready to rumble!.
            • Сам процес гри обробляється у нескінченному циклі.
• Гравцеві пропонується ввести лінію для стрільби; програма перевіряє, щоб було введено число, і введена лінія
• знаходиться в межах ігрового поля (1-5). У випадку, якщо гравець помилився, пропонує ввести число ще раз.
            • Гравцю пропонується ввести стовпчик для стрільби (має проходити аналогічну перевірку).
            • Після кожного пострілу необхідно показувати оновлене ігрове поле у консолі. Клітинки, куди гравець вже стріляв, слід зазначити як *.
            • Гра закінчується при попаданні в ціль. Наприкінці гри вивести в консоль фразу You have won!, а також ігрове поле.
            • Уражену ціль відзначити як x.
• Завдання повинно бути виконане за допомогою масивів (НЕ використовуйте інтерфейси List, Set, Map).*/

    public String[][] createAim() {
        String[][] arrayOfAims = new String[6][6];
        for (int i = 0; i < arrayOfAims.length; i++) {
            for (int j = 0; j < arrayOfAims[i].length; j++) {
                if (i == 0) {
                    arrayOfAims[i][j] = String.valueOf(j);
                } else if (j == 0) {
                    arrayOfAims[i][j] = String.valueOf(i);
                } else {
                    arrayOfAims[i][j] = "-";


                }
            }

        }
        return arrayOfAims;  }

    public void printAim (String[][] aim){
        for (String[] strings : aim){
            System.out.println(Arrays.toString(strings));
        }

    }
public int[] setAim () {
        int[] aim = new int[]{
                new Random().nextInt(1, 5),
                new Random().nextInt(1,5)
        };
        return aim;
}
public int[] enterCoordinate (){
    Scanner scanner = new Scanner(System.in);
       int firstCoordinate;
    do {
        System.out.println("Enter first coordinate");
        firstCoordinate =scanner.nextInt();
    }
    while (firstCoordinate < 1 ||firstCoordinate >  5);

    int secondCoordinate;
    do {
        System.out.println("Enter second coordinate");
        secondCoordinate =scanner.nextInt();
    }
    while (secondCoordinate < 1 ||secondCoordinate> 5);
    return new int[] {firstCoordinate, secondCoordinate};
}

    public void playGame(String[][] field, String name){
        int[] finalAim = setAim();
        do{
            int[] aim = enterCoordinate();
            if(Arrays.equals(aim,finalAim)){
                field[aim[0]][aim[1]]= "x";
                printAim(field);
                System.out.println("Congratulation: "+name);
                break;
            } else {
                field[aim[0]][aim[1]]= "*";
                printAim(field);
                System.out.println("You lose. Try agan");
            }
        }
        while (true);
}
public String enterName() {
        Scanner scanner = new Scanner(System.in);
    System.out.println("Type you name");
    String name = scanner.nextLine();
return name;
    }
}
