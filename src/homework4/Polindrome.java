package homework4;

import java.util.Scanner;

public class Polindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Написать программу в которой пользователь вводит с клавиатуры число, а программа определяет,
        является она полиндромом или нет. И выводит данную информацию на экран.*/
        System.out.println("Введіть число");
        String firstNumber = scanner.nextLine();
        String secondNumber = "";
        for (int i = firstNumber.length()-1; i >=0; i-- ) {
            secondNumber = secondNumber + firstNumber.charAt(i);
        }
            if (secondNumber.equals(firstNumber)) {
                System.out.println("Дане число поліндром");
            } else {
                System.out.println("Дане число не являється поліндромом");
            }

        }
    }

