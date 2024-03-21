package Running;

import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);

    public int inputInt() {
        int liczbaInt = scanner.nextInt();
        return liczbaInt;
    }
    public double inputDouble() {
        double liczbaDouble = scanner.nextDouble();
        return liczbaDouble;
    }

    public String inputChar() {
        String znak = scanner.next();
        return znak;
    }
    public String inputString() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        return text;
    }
}
