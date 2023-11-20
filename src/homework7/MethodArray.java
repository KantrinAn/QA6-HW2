package homework7;

import java.util.ArrayList;
import java.util.List;

/*Написать метод, принимающий в качестве параметра массив целых чисел.
        И выводит на экран все четные числа списком, a также нечетные числа списком.*/
public class MethodArray {

    public void returnCountNumbers (int[] array){
        String even = "";
        String odd= "";
        List<Integer> evenArrayList = new ArrayList<>();
        List <Integer> oddArrayList = new ArrayList<>();
for (int i =0; i< array.length; i++){
    if (array[i]%2 == 0) {
        evenArrayList.add(array[i]);
        even = evenArrayList + " ";
    }
    else {
        oddArrayList.add(array[i]);
        odd = oddArrayList+ " ";

    }
}
        System.out.println("Even numbers "+ even);
        System.out.println("Odd numbers "+ odd);

    }
}
