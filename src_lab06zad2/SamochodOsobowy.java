public class SamochodOsobowy extends Samochod{
    public String waga;
    public double pojemnoscSilnika;
    public int iloscOsob;


    public SamochodOsobowy(String marka, String model, String kolor, int rokProdukcji, int przebieg) {
        super(marka, model, kolor, rokProdukcji, przebieg);
    }

    @Override
    public void wyswietl() {
        super.wyswietl();
        System.out.format("Waga: %s\n Pojemnosc silinika: %.2f\n Ilosc osob: %d\n\n", waga, pojemnoscSilnika, iloscOsob);
    }
}
