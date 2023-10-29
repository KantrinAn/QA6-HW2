package homework3;

import java.util.Scanner;
/*которая выводит на консоль ссылку для скачивания программы.
 Из выбора программ взять: IntelliJ IDEA, Git, Java.
 Из выбора ОС взять: Linux, macOS, Windows. Программа должна спросить пользователя какая программа ему интересна,
также спросить какую ОС он использует, а после вывести в консоль необходимую ссылку.
Если программа с таким названием не существует выводит сообщение в консоль,
 о том что такой программы не существует. Если указанной пользователем ОС нет,
 то выводится сообщение в консоль, о том что такой ОС не существует.*/
public class Task6 {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Вкажіть назву програми");
        String program = scanner.nextLine();

        switch (program.toLowerCase()) {
            case ("intellij idea"):
            case  ("idea"):
            case ("intellij"):
                System.out.println(" Вкажіть операційну систему");
                String os = scanner.nextLine();
                switch (os.toLowerCase()) {
                    case ("macos"):
                    case ("mac"):
                        System.out.println("https://www.jetbrains.com/idea/download/?section=mac");
                        break;
                    case ("windows"):
                        System.out.println("https://www.jetbrains.com/idea/download/?section=windows");
                        break;
                    case ("linux"):
                        System.out.println("https://www.jetbrains.com/idea/download/?section=linux");
                        break;
                    default:
                        System.out.println("Такої ОС немає.");
                }
                break;
            case ("git"):
                System.out.println(" Вкажіть операційну систему");
                String osForGit = scanner.nextLine();
                switch (osForGit.toLowerCase()){
                    case ("macos"):
                    case ("mac"):
                        System.out.println("https://git-scm.com/download/mac");
                        break;
                    case ("windows"):
                        System.out.println("https://git-scm.com/download/win");
                        break;
                    case ("linux"):
                        System.out.println("https://git-scm.com/download/linux");
                        break;
                    default:
                        System.out.println("Такої ОС немає.");
                }
                break;
            case ("java"):
                System.out.println(" Вкажіть операційну систему");
                String osForJava = scanner.nextLine();
                switch (osForJava.toLowerCase()){
                    case ("macos"):
                    case ("mac"):
                        System.out.println("https://www.oracle.com/java/technologies/downloads/#jdk21-mac");
                        break;
                    case ("windows"):
                        System.out.println("https://www.oracle.com/java/technologies/downloads/#jdk21-windows");
                        break;
                    case ("linux"):
                        System.out.println("https://www.oracle.com/java/technologies/downloads/#jdk21-linux");
                        break;
                    default:
                        System.out.println("Такої ОС немає.");
                }
                break;
            default: System.out.println("Такої програми немає.");
        }
    }
}
