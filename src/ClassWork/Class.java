
package ClassWork;

public class Class {


    public static void main(String[] args) {
   /*3) Создать класс Aquarium, в нем три поля типа int (length, width, height),

    а также поле Типа String c названием фирмы данного аквариума. Сделать все поля класса приватными.

    Сделать геттеры и сеттеры для данных полей. Создать метод выводящий в консоль информацию о данном аквариуме.*/
        Aquarium aquarium = new Aquarium();
        aquarium.getInfo();
    {
            aquarium.setHeight(32);
            aquarium.setLength(33);
            aquarium.setWidth(43);
            aquarium.setName("ribka");
            aquarium.getInfo();

        }
    }
}

