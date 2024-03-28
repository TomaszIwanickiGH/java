public class Samochod {
    public String marka, model, kolor;
    public int rokProdukcji, przebieg;
    public Samochod() {
    }
    public Samochod(String marka, String model, String kolor, int rokProdukcji, int przebieg) {
        this.marka = marka;
        this.model = model;
        this.kolor = kolor;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = Math.abs(przebieg);
    }

    public void wyswietl(){
        System.out.printf("Marka: %s\n Model: %s\n Kolor: %s\n Rok produkcji: %d\n Przebieg: %d\n\n", marka, model, kolor, rokProdukcji, Math.abs(przebieg));
    }
}
