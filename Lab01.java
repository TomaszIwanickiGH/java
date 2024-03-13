import java.util.Random;
import java.util.Scanner;
public class Main {
    public static String imie(){
        return "Tomasz";
    }
    public static int wiek(){
        return 20;
    }
    public static void zad2(int a, int b){
        System.out.println("Suma " + a + " + " + b + ": " + (a+b));
        System.out.println("Roznica " + a + " - " + b + ": " + (a-b));
        System.out.println("Iloczyn " + a + " * " + b + ": " + (a*b));
    }
    public static int inputInt(){
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }
    public static boolean zad3(int a){
        if(a%2 == 0) return true;
        else return false;
    }
    public static boolean zad4(int a){
        if(a%3 == 0 && a%5 == 0) {
            return true;
        } else return false;
    }
    public static int zad5(int a){
        return a*a*a;
    }
    public static double zad6(int a){
        return Math.sqrt(a);
    }
    public static int randomNumber(int zakresDolny, int zakresGorny){
        Random random = new Random();
        int liczba = random.nextInt((zakresGorny - zakresDolny) + 1) + zakresDolny;
        return liczba;
    }
    public static boolean zad7(int a, int b, int c){
        int max = a;
        int dlugosc = b + c;
        if(a < b && c < b) {
            max = b;
            dlugosc = a + c;
        }
        if(a < c && b < c) {
            max = c;
            dlugosc = a + b;
        }
        if(dlugosc <= max){
            System.out.println("Z odcinkow " + a + ", " + b + ", " + c + " nie można zbudowac trojkata");
            return false;
        } else {
            System.out.println("Z odcinkow " + a + ", " + b + ", " + c + " można zbudowac trojkat");
            return true;
        }
    }
    public static void main(String[] args) {
        System.out.println(imie() + " lat: " + wiek());
        System.out.println("Podaj liczbe a:");
        int a = inputInt();
        System.out.println("Podaj liczbe b:");
        int b = inputInt();
        zad2(a,b);
        System.out.println("\nZadania 3-6 wykonywane sa na podstawie liczby podanej poniżej");
        System.out.println("Podaj liczbe: ");
        int liczba = inputInt();
        System.out.println(zad3(liczba));
        System.out.println(zad4(liczba));
        System.out.println(zad5(liczba));
        System.out.println(zad6(liczba));
        System.out.println("\nZad.7");
        System.out.println("Podaj zakres dolny");
        int zakresDolny = inputInt();
        System.out.println("Podaj zakres gorny");
        int zakresGorny = inputInt();
        int l1 = randomNumber(zakresDolny, zakresGorny);
        int l2 = randomNumber(zakresDolny, zakresGorny);
        int l3 = randomNumber(zakresDolny, zakresGorny);
        System.out.println("Wylosowane liczby: " + l1 + ", " + l2 + ", " + l3);
        System.out.println(zad7(l1,l2,l3));
    }
}