import java.util.Random;
import java.util.Scanner;

public class Lab04 {
    public static int inputInt(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }
    public static String inputString(){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        return text;
    }
    public static int randomNumber(int zakresDolny, int zakresGorny){
        Random random = new Random();
        int liczba = random.nextInt((zakresGorny - zakresDolny) + 1) + zakresDolny;
        return liczba;
    }

    public static void zad1(){
        System.out.println("Podaj zakres dolny (do losowania liczb)");
        int zakresDolny = inputInt();
        System.out.println("Podaj zakres gorny (do losowania liczb)");
        int zakresGorny = inputInt();

        System.out.println("Podaj ilosc elementow tablicy: ");
        int n = inputInt();

        int [] tabInt = new int[n];
        int suma = 0;

        for (int i = 0; i < tabInt.length; i++) {
            tabInt[i] = randomNumber(zakresDolny, zakresGorny);
            System.out.println("Liczba " + (i+1) + " wynosi: " + tabInt[i]);
            suma += tabInt[i];
        }

        System.out.println("Suma wynosi: " + suma);
        System.out.println("Srednia wynosi: " + suma/n);
    }

    public static void zad2(){
        int [] tab1 = new int[] {2,3,4,5};
        int [] tab2 = new int[] {6,7,8,9,10};

        System.out.println("Elementy pierwszej tablicy: ");
        for (int i = 0; i < tab1.length; i++) {
            System.out.print(tab1[i] + " ");
        }

        System.out.println("\nElementy drugiej tablicy: ");
        for (int i = 0; i < tab2.length; i++) {
            System.out.print(tab2[i] + " ");
        }

        System.out.println("\nCo drugi element pierwszej tablicy: ");
        for (int i = 1; i < tab1.length; i+=2) {
            System.out.print(tab1[i] + " ");
        }

        System.out.println("\nCo drugi element drugiej tablicy: ");
        for (int i = 1; i < tab2.length; i+=2) {
            System.out.print(tab2[i] + " ");
        }
    }

    public static void zad3(){
        String[] stringTab = new String[] {"Ala", "ma", "kota"};

        for (String tekst: stringTab){
            System.out.println(tekst.toUpperCase());
        }
    }

    public  static void zad4(){
        String[] stringTab = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj " + (i+1) + " słowo: ");
            stringTab[i] = inputString();
        }

        for (int i = stringTab.length - 1; i >= 0 ; i--) {
            for (int j = stringTab[i].length() - 1; j >= 0 ; j--) {
                System.out.print(stringTab[i].charAt(j));
            }
            System.out.print(" ");
        }
    }

    public static void zad5(){
        int[] intTab = new int[8];

        for (int i = 0; i < intTab.length; i++) {
            System.out.println("Podaj " + (i+1) + " liczbe: ");
            intTab[i] = inputInt();
        }

        System.out.println("Przed sortowaniem: ");
        for (int i = 0; i < intTab.length; i++) {
            System.out.print(intTab[i] + " ");
        }

        System.out.println("\nPo sortowaniu: ");
        int pom;
        for (int i = 0; i < intTab.length - 1; i++) {
            for (int j = 0; j < intTab.length - i - 1; j++) {
                if(intTab[j] > intTab[j+1]){
                    pom = intTab[j];
                    intTab[j] = intTab[j+1];
                    intTab[j+1] = pom;
                }
            }
        }
        for(int i : intTab){
            System.out.print(i + " ");
        }
    }

    public static void zad6(){
        int[] intTab = new int[5];

        for (int i = 0; i < intTab.length; i++) {
            System.out.println("Podaj " + (i+1) + " liczbe: ");
            intTab[i] = inputInt();
        }

        for(int i = 0; i < intTab.length; i++){
            int silnia = 1;
            for (int j = 1; j <= intTab[i]; j++) {
                silnia *= j;
            }
            System.out.println("Silnia liczby " + intTab[i] + ": " + silnia);
        }
    }

    public static void zad7(){
        String[] tab1 = new String[] {"Ala", "ma", "kota"};
        String[] tab2 = new String[] {"Ala", "ma", "kota"};

        if(tab1 == tab2) System.out.println("Tablice sa takie same");
        else System.out.println("Tablice nie sa takie same");
    }

    public static void main(String[] args) {
        System.out.println("\nZad.1");
        zad1();

        System.out.println("\nZad.2");
        zad2();

        System.out.println("\nZad.3");
        zad3();

        System.out.println("\nZad.4");
        zad4();

        System.out.println("\nZad.5");
        zad5();

        System.out.println("\nZad.6");
        zad6();

        System.out.println("\nZad.7");
        zad7();
    }
}
