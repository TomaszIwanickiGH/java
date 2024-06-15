import javax.swing.*;

public class Kwota {
    private double posiadanaKwota = 10.00;
    private double wplaconaKwota= 0;
    private  double kwotaDoZaplaty = 0;

    public double getPosiadanaKwota() {
        return posiadanaKwota;
    }

    public void setPosiadanaKwota(double posiadanaKwota) {
        this.posiadanaKwota = posiadanaKwota;
    }

    public double getWplaconaKwota() {
        return wplaconaKwota;
    }

    public void setWplaconaKwota(double wplaconaKwota) {
        this.wplaconaKwota = wplaconaKwota;
    }

    public double getKwotaDoZaplaty() {
        return kwotaDoZaplaty;
    }

    public void setKwotaDoZaplaty(double kwotaDoZaplaty) {
        this.kwotaDoZaplaty = kwotaDoZaplaty;
    }

    public void wplacKwote(double kwota){
        setWplaconaKwota(Math.round((wplaconaKwota + kwota) * 100.0) / 100.0);
        setPosiadanaKwota(Math.round((posiadanaKwota - kwota) * 100.0) / 100.0);
    }

    public void reset(){
        setPosiadanaKwota(10);
        setWplaconaKwota(0);
    }

    public void validate(JButton b5zl, JButton b2zl, JButton b1zl, JButton b05zl, JButton b02zl, JButton b01zl){
        if(posiadanaKwota < 5) {
            b5zl.setEnabled(false);
        } else {
            b5zl.setEnabled(true);
        }
        if(posiadanaKwota < 2) {
            b2zl.setEnabled(false);
        } else {
            b2zl.setEnabled(true);
        }
        if(posiadanaKwota < 1) {
            b1zl.setEnabled(false);
        } else {
            b1zl.setEnabled(true);
        }
        if(posiadanaKwota < 0.5) {
            b05zl.setEnabled(false);
        } else {
            b05zl.setEnabled(true);
        }
        if(posiadanaKwota < 0.2) {
            b02zl.setEnabled(false);
        } else {
            b02zl.setEnabled(true);
        }
        if(posiadanaKwota < 0.1) {
            b01zl.setEnabled(false);
        } else {
            b01zl.setEnabled(true);
        }
    }
}
