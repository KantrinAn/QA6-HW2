public class Homework2 {
    public static void main(String[] args) {
       /* Создать строку string = "Testing, is my favourite job".
                Вывести на экран отдельно каждое слово и длину этого слова в след виде:
        Cлово1 = (значение слова), Длина этого слова = (значение длины слов).
        Cлово2 = (значение слова), Длина этого слова = (значение длины слов).
        и т.д.                Вывести на консоль true, если первое слово длиннее остальных, в
        противном случае вывести false.*/
        String string = "Testing , is my favourite job.";
        String[] arrayOfWords = string.split("\\s");
        int lengthWordFirst = arrayOfWords[0].length();
        int lengthWordSecond = arrayOfWords[2].length();
        int lengthWordThird = arrayOfWords[3].length();
        int lengthWordForth = arrayOfWords[4].length();
        int lengthWordFifth = arrayOfWords[5].length();
        System.out.println(arrayOfWords[0] + "-"+ lengthWordFirst);
        System.out.println(arrayOfWords[2] + "-" + lengthWordSecond);
        System.out.println(arrayOfWords[3] + "-"+ lengthWordThird);
        System.out.println(arrayOfWords[4] + "-"+ lengthWordForth);
        System.out.println(arrayOfWords[5] + "-"+ lengthWordFifth);
        boolean longest = lengthWordFirst > lengthWordSecond && lengthWordFirst> lengthWordThird && lengthWordFirst> lengthWordForth && lengthWordFirst>lengthWordFifth;
        System.out.println(longest);
    }
}