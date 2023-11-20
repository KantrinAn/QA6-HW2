package homework6;

public class Main {
    public static void main(String[] args) {
        Shoot aim = new Shoot();
        String[][] createAim = new Shoot().createAim();
        aim.printAim(createAim);
        aim.playGame(createAim, aim.enterName());
    }
}

