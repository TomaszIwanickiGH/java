import javax.swing.*;
import java.time.LocalDate;
import java.util.List;

public class Platnosc {
    private int idDoZaplaty;

    public int getIdDoZaplaty() {
        return idDoZaplaty;
    }

    public void setIdDoZaplaty(int idDoZaplaty) {
        this.idDoZaplaty = idDoZaplaty;
    }

    Kwota kwota = new Kwota();

    public void zaplac(List<Produkt> list, JLabel label, double kwotaWPL, JLabel lblPosiadane, JLabel lblWplacone, JLabel lblDoZaplaty){
        for (Produkt product : list) {
            if (product.getId() == getIdDoZaplaty()) {
                kwota.setKwotaDoZaplaty(product.getPrice());
                if(kwotaWPL >= kwota.getKwotaDoZaplaty()){
                    double reszta = Math.round((kwotaWPL - kwota.getKwotaDoZaplaty()) * 100.0) / 100.0;
                    label.setText("Kupiono: " + product.getName() + ", reszta: " + reszta);

                    LocalDate currentDate = LocalDate.now();
                    System.out.println("Aktualna data: " + currentDate);
                    Transakcje transakcje = new Transakcje();
                    transakcje.saveTransaction("Dnia: " + currentDate + " kupiono: " + product.getName());

                    kwota.setPosiadanaKwota(kwota.getPosiadanaKwota() - kwotaWPL + reszta);
                    lblPosiadane.setText("Posiadana kwota: " + kwota.getPosiadanaKwota() + "zł");

                    kwota.setWplaconaKwota(0);
                    lblWplacone.setText("Wpłacona kwota: " + 0 + "zł");

                    kwota.setKwotaDoZaplaty(0);
                    lblDoZaplaty.setText("Do zapłaty: 0");
                    break;
                } else {
                    label.setText("Nie wpłacono odpowiedniej kwoty");
                    lblWplacone.setText("Wpłacona kwota: " + kwotaWPL + "zł");
                }
            }
        }
    }
}
