import java.util.Random;
import java.util.Scanner;

public class Lab03 {
    public static int inputInt(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    public static void zad1() {
        System.out.println("Podaj liczbe studentow: ");
        int liczbaStudentow = inputInt();

        int counter = 1;
        int suma = 0;
        int liczba;

        while(counter <= liczbaStudentow){
            System.out.println("Podaj ilosc punktow " + counter + " studenta: ");
            liczba = inputInt();
            suma += liczba;
            counter++;
        }

        double srednia = suma/liczbaStudentow;

        System.out.println("Srednia liczba punktow to: " + srednia);
    }

    public static void zad2(){
        int iloscDodatnich = 0, iloscUjemnych = 0;
        int liczba;
        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj " + (i+1) + " liczbe: ");
            liczba = inputInt();
            if(liczba > 0) iloscDodatnich++;
            else if(liczba < 0) iloscUjemnych++;
        }
        System.out.println("Ilosc dodatnich liczb: " + iloscDodatnich);
        System.out.println("Ilosc ujemnych liczb: " + iloscUjemnych);
    }

    public static void zad3(int liczba){
        int suma = 0;

        for (int i = 0; i <= liczba; i += 2) {
            suma +=i;
        }

        System.out.println("Suma parzystych liczb: " + suma);
    }

    public static void zad4(){
        Random random = new Random();
        int losowaLiczba = random.nextInt(55)-10;

        System.out.println("Wylosowana liczba: " + losowaLiczba);
        zad3(losowaLiczba);
    }

    public static void zad5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj slowo: ");
        String slowo = scanner.nextLine();

        boolean czyPalindrom = true;

        for (int i = 0; i < (slowo.length()/2) - 1; i++) {
            if(slowo.charAt(i) != slowo.charAt(slowo.length()-1)){
                czyPalindrom = false;
            }
        }

        if(czyPalindrom) System.out.println("Slowo " + slowo + " jest palindromem");
        else System.out.println("Slowo " + slowo + " nie jest palindromem");
    }

    public static void main(String[] args) {
        System.out.println("\nZad.1");
        zad1();

        System.out.println("\nZad.2");
        zad2();

        System.out.println("\nZad.3");
        System.out.println("Podaj liczbe (wieksza od 0): ");
        int liczba = inputInt();
        zad3(liczba);

        System.out.println("\nZad.4");
        zad4();

        System.out.println("\nZad.5");
        zad5();
    }
}
