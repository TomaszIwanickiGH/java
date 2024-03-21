package Running;

import Figures.*;

public class Run {
    Input input = new Input();
    public void running() {
        int wybor;
        while (true){
            Menu();
            wybor = input.inputInt();
            switch (wybor){
                case 1 -> viewCircle();
                case 2 -> viewKwadrat();
                case 3 -> viewProstokat();
                case 4 -> viewSzescian();
                case 5 -> viewProstopadloscian();
                case 6 -> viewKula();
                case 7 -> viewStozek();
                case 8-> Close();
                default -> defaultInstructioon();
            }
            System.out.println("\nNacisnij (i zatwierdź enterem) dowolny przycisk aby kontynuować");
            input.inputString();

        }
    }

    private void viewStozek() {
        Stozek stozek = new Stozek();
        System.out.println("Podaj nazwe figury: ");
        stozek.setName(input.inputString());

        System.out.println("Podaj promien: ");
        double r = input.inputDouble();
        if(r < 0){
            System.out.println("Podano wartosc ujemną, zamieniam ją na wartosć dodatanią");
            r = Math.abs(r);
        } else if(r == 0) {
            System.out.println("Podano wartosć 0, zamieniam na 1");
            r = 1;
        }

        System.out.println("Podaj wysokosc: ");
        int h = input.inputInt();
        if(h < 0){
            System.out.println("Podano wartosc ujemną, zamieniam ją na wartosć dodatanią");
            h = Math.abs(h);
        } else if(h == 0) {
            System.out.println("Podano wartosć 0, zamieniam na 1");
            h = 1;
        }

        stozek.setR(r);
        stozek.setH(h);

        stozek.view();
    }

    private void viewKula() {
        Kula kula = new Kula();
        System.out.println("Podaj nazwe figury: ");
        kula.setName(input.inputString());

        System.out.println("Podaj promien: ");
        double r = input.inputDouble();
        if(r < 0){
            System.out.println("Podano wartosc ujemną, zamieniam ją na wartosć dodatanią");
            r = Math.abs(r);
        } else if(r == 0) {
            System.out.println("Podano wartosć 0, zamieniam na 1");
            r = 1;
        }
        kula.setR(r);

        kula.view();
    }

    private void viewProstopadloscian() {
        Prostopadloscian prostopadloscian = new Prostopadloscian();
        System.out.println("Podaj nazwe figury: ");
        prostopadloscian.setName(input.inputString());

        System.out.println("Podaj dlugosc boku a: ");
        int a = input.inputInt();
        if(a < 0){
            System.out.println("Podano wartosc ujemną, zamieniam ją na wartosć dodatanią");
            a = Math.abs(a);
        } else if(a == 0) {
            System.out.println("Podano wartosć 0, zamieniam na 1");
            a = 1;
        }

        System.out.println("Podaj dlugosc boku b: ");
        int b = input.inputInt();
        if(b < 0){
            System.out.println("Podano wartosc ujemną, zamieniam ją na wartosć dodatanią");
            b = Math.abs(b);
        } else if(b == 0) {
            System.out.println("Podano wartosć 0, zamieniam na 1");
            b = 1;
        }

        System.out.println("Podaj dlugosc boku c: ");
        int c = input.inputInt();
        if(c < 0){
            System.out.println("Podano wartosc ujemną, zamieniam ją na wartosć dodatanią");
            c = Math.abs(c);
        } else if(c == 0) {
            System.out.println("Podano wartosć 0, zamieniam na 1");
            c = 1;
        }

        prostopadloscian.setA(a);
        prostopadloscian.setB(b);
        prostopadloscian.setC(c);

        prostopadloscian.view();
    }

    private void viewSzescian() {
        Szescian szescian = new Szescian();
        System.out.println("Podaj nazwe figury: ");
        szescian.setName(input.inputString());

        System.out.println("Podaj dlugosc boku: ");
        int a = input.inputInt();
        if(a < 0){
            System.out.println("Podano wartosc ujemną, zamieniam ją na wartosć dodatanią");
            a = Math.abs(a);
        } else if(a == 0) {
            System.out.println("Podano wartosć 0, zamieniam na 1");
            a = 1;
        }
        szescian.setA(a);

        szescian.view();
    }

    private void viewProstokat() {
        Prostokat prostokat = new Prostokat();
        System.out.println("Podaj nazwe figury: ");
        prostokat.setName(input.inputString());

        System.out.println("Podaj dlugosc boku a: ");
        int a = input.inputInt();
        if(a < 0){
            System.out.println("Podano wartosc ujemną, zamieniam ją na wartosć dodatanią");
            a = Math.abs(a);
        } else if(a == 0) {
            System.out.println("Podano wartosć 0, zamieniam na 1");
            a = 1;
        }

        System.out.println("Podaj dlugosc boku b: ");
        int b = input.inputInt();
        if(b < 0){
            System.out.println("Podano wartosc ujemną, zamieniam ją na wartosć dodatanią");
            b = Math.abs(b);
        } else if(b == 0) {
            System.out.println("Podano wartosć 0, zamieniam na 1");
            b = 1;
        }

        prostokat.setA(a);
        prostokat.setB(b);

        prostokat.view();
    }

    private void viewKwadrat() {
        Kwadrat kwadrat = new Kwadrat();
        System.out.println("Podaj nazwe figury: ");
        kwadrat.setName(input.inputString());

        System.out.println("Podaj dlugosc boku: ");
        int a = input.inputInt();
        if(a < 0){
            System.out.println("Podano wartosc ujemną, zamieniam ją na wartosć dodatanią");
            a = Math.abs(a);
        } else if(a == 0) {
            System.out.println("Podano wartosć 0, zamieniam na 1");
            a = 1;
        }
        kwadrat.setA(a);

        kwadrat.view();
    }

    private void defaultInstructioon() {
        System.out.println("Bledne dane, koniec programu");
        System.exit(0);
    }

    private void Close() {
        System.out.println("Czy na pewno chcesz wyjść? t || T");
        String znak = input.inputChar();
        String str1 = "t", str2 = "T";
        if (znak.equals(str1) || znak.equals(str2)) System.exit(0);
    }

    private void viewCircle() {
        Circle circle = new Circle();
        System.out.println("Podaj nazwe figury: ");
        circle.setName(input.inputString());

        System.out.println("Podaj promien: ");
        double r = input.inputDouble();
        if(r < 0){
            System.out.println("Podano wartosc ujemną, zamieniam ją na wartosć dodatanią");
            r = Math.abs(r);
        } else if(r == 0) {
            System.out.println("Podano wartosć 0, zamieniam na 1");
            r = 1;
        }
        circle.setR(r);

        circle.view();
    }

    private void Menu() {
        System.out.println("\nKalkulator figur geometrycznych");
        System.out.println("1. Kolo\n"+
                "2. Kwadrat \n"+
                "3. Prostokat \n"+
                "4. Szescian \n"+
                "5. Prostopadloscian \n"+
                "6. Kula \n"+
                "7. Stozek \n"+
                "8. Wyjscie");
        System.out.println("\nWybierz opcje: ");
    }
}
