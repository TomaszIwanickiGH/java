package Figures;

public class Kula {
    private double r;
    private String name;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double pole(double r) { return 4*Math.PI*(r*r); }
    private double objetosc(double r) { return 4/3*(Math.PI*(Math.pow(r, 3))); }
    public void view(){
        System.out.format("Figura: %s, promien: %.2f, pole: %.2f, objetosc: %.2f",
                name, r, pole(r), objetosc(r));
    }
}
