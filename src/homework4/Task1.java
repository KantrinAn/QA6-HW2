package homework4;

import java.util.Scanner;
import java.util.SimpleTimeZone;

/*Написать программу, которая будет считывать введенные пользователем слова с клавиатуры слова,
        и склеивать их в одно предложение до тех пор, пока пользователь не введет с клавитуры слово STOP.
        Все слова введенные до этого должны отобразится в консоли одним предложением.*/
public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String result = new String();
        System.out.println("Введите слово!");
        String x = scanner.nextLine();
        while (!x.equals("STOP")) {
        result = result + " " + x;
            x = scanner.nextLine();
            if (result.equals("STOP")) {
           break;
            }
            System.out.println(result);
        }


    }
}





       /* while ((line=s.nextLine())!=null)

        { String line1 = s.nextLine() + " " + line;
                       // IF STOP:


            // do what you want

            System.out.println(line+ " ");

        }

    }}*/



