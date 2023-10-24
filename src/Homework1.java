public class Homework1 {
    public static void main(String[] args) {
        /*1.*/
        String string1 = "This line that i want to cut, cause it is too long.";
        System.out.println(string1);
        System.out.println("Довжина речення: "+ string1.length());
        String string2 = string1.substring(0,36);
        System.out.println(string2+".");
        System.out.println("Довжина речення: "+ string2.length());
        String string3 = string2.replace("This line that i", "This line that don't");
        System.out.println(string3 + " it is perfect.");
        System.out.println("Довжина речення: "+ string3.length());
        System.out.println("===============");
       /* 2. */
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
        System.out.println("=============");
         // 3.
        String sentence = "Completely random text in English. In it," +
                " we just need to determine how many times the character 'a' occurs there. " +
                "And we can use the split method and the length method.";
        String [] arrayOfString = sentence.split(" ");
        int size = arrayOfString.length;
        System.out.println("Length = "+ size);
        String [] arrayOfA = sentence.split("a".toLowerCase());
        int count = arrayOfA.length;
        System.out.println("Count 'a' = " + count);

    }
}