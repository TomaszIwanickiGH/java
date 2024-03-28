public class Main {
    public static void main(String[] args) {
        System.out.println("Samochod 1");
        Samochod s1 = new Samochod();
        s1.marka = "Audi";
        s1.model = "RS 6";
        s1.kolor = "Szary";
        s1.rokProdukcji = 2014;
        s1.przebieg = -50000;
        s1.wyswietl();

        System.out.println("Samochod 2");
        Samochod s2 = new Samochod("BMW", "X3", "Czarny", 2016, -30000);
        s2.wyswietl();

        System.out.println("Samochod osobowy");
        SamochodOsobowy samochodOsobowy = new SamochodOsobowy("BMW", "X5", "Czarny", 2018, 40000);
        samochodOsobowy.waga = "3t";
        samochodOsobowy.pojemnoscSilnika = 2.1;
        samochodOsobowy.iloscOsob = 2;
        samochodOsobowy.wyswietl();
    }
}