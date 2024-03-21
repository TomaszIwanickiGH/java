package Figures;

public class Stozek {
    private double r;
    private int h;
    private String name;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double pole(double r, int h) { return Math.PI *(r*r) * h; }
    private double objetosc(double r, int h) { return (Math.PI*(r*r) * h)/3; }
    public void view(){
        System.out.format("Figura: %s, promien: %.2f, wysokosc: %d, pole: %.2f, objetosc: %.2f",
                name, r, h, pole(r, h), objetosc(r, h));
    }
}
