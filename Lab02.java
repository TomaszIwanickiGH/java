import java.util.Scanner;

public class Lab02 {
    public static int inputInt(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    public static boolean inputBool(){
        Scanner scanner = new Scanner(System.in);
        boolean bool = scanner.nextBoolean();
        return bool;
    }
    public static void zad1(){
        System.out.println("Podaj a: ");
        int a = inputInt();
        System.out.println("Podaj b: ");
        int b = inputInt();
        System.out.println("Podaj c: ");
        int c = inputInt();

        System.out.println("Twoje rownanie to: " + a + "x^2 + " + b + "x + " + c);

        float delta = b * b - (4 * a * c);
        System.out.println("Delta wynosi: " + delta);

        if(delta < 0) {
            System.out.println("Rownanie nie ma rozwiązan");
        } else if (delta == 0) {
            System.out.println("Rownanie ma jedno rozwiazanie: " + (-b/(2*a)));
        } else {
            System.out.println("Rownanie ma dwa rozwiazania: x1 = " + ((-b-Math.sqrt(delta))/(2*a)) + ", x2 = " + ((-b+Math.sqrt(delta))/(2*a)));
        }
    }

    public static int zad2a(int x){
        if(x > 0) return 2 * x;
        else if (x == 0) return 0;
        else return -3 * x;
    }

    public static int zad2b(int x){
        if(x >= 1) return x*x;
        else return x;
    }

    public static int zad2c(int x){
        if(x > 2) return 2 + x;
        else if (x == 2) return 8;
        else return x-4;
    }
    public static void zad2() {
        System.out.println("Podaj x:");
        int x = inputInt();
        System.out.println("a) " + zad2a(x));
        System.out.println("b) " + zad2b(x));
        System.out.println("c) " + zad2c(x));
    }

    public static void zad3(){
        System.out.println("Podaj x:");
        int x = inputInt();
        System.out.println("Podaj y:");
        int y = inputInt();
        System.out.println("Podaj z:");
        int z = inputInt();

        int min = x;
        if(x > y && z > y) min = y;
        if(x > z && y > z) min = z;

        int max = x;
        if(x < y && z < y) max = y;
        if(x < z && y < z) max = z;

        int mid = x;
        if(min < y && y < max) mid = y;
        if(min < z && z < max) mid = z;

        System.out.println("Uporządkowane liczby: " + min + ", " + mid + ", " + max);
    }

    public static void zad4(){
        System.out.println("Czy pada deszcz? (true - TAK, false - NIE): ");
        boolean x = inputBool();
        System.out.println("Czy autobus jest na przystanku? (true - TAK, false - NIE): ");
        boolean y = inputBool();

        if(x && y) System.out.println("Weź parasol. Dostaniesz się na uczelnie");
        if(x && !y) System.out.println("Nie dostaniesz się na uczelnie");
        if(!x && y) System.out.println("Dostaniesz się na uczelnie. Miłego dnia i pięknej pogody");
    }

    public static void zad5(){
        System.out.println("Czy jest zniżka na samochod? (true - TAK, false - NIE): ");
        boolean x = inputBool();
        System.out.println("Czy otrzymales premie? (true - TAK, false - NIE): ");
        boolean y = inputBool();

        if(!x || y) System.out.println("Możesz kupić samochód!. Zniżki na samochod nie ma");
        if(!x || !y) System.out.println("Zakup samochodu trzeba odłożyć na później. Zniżki na samochód nie ma");
        if(x || y) System.out.println("Możesz kupić samochód");
    }

    public static void zad6(){
        System.out.println("Jakie działanie chcesz wykonac?");
        System.out.println("1 - dodawanie");
        System.out.println("2 - odejmowanie");
        System.out.println("3 - mnozenie");
        System.out.println("4 - dzielenie");
        System.out.println("Podaj numer dzialania: ");
        int znak = inputInt();

        System.out.println("Podaj a:");
        int a = inputInt();
        System.out.println("Podaj b:");
        int b = inputInt();

        switch (znak) {
            case 1:
                System.out.println(a + " + " + b + " = " + (a+b));
                break;
            case 2:
                System.out.println(a + " - " + b + " = " + (a-b));
                break;
            case 3:
                System.out.println(a + " * " + b + " = " + (a*b));
                break;
            case 4:
                System.out.println(a + " / " + b + " = " + (a/b));
                break;
            default:
                System.out.println("Podano nieprawidlowe dane");
                break;
        }
    }

    public static void main(String[] args) {
        System.out.println("Zad.1");
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
    }
}
