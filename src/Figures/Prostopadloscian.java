package Figures;

public class Prostopadloscian {
    private int a;
    private int b;
    private int c;
    private String name;
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int pole(int a, int b, int c) { return 2*a*b + 2*a*c + 2*b*c; }
    private int objetosc(int a, int b, int c) { return a*b*c; }
    public void view(){
        System.out.format("Figura: %s, bok a: %d, bok b: %d, bok c: %d, pole: %d, objetosc: %d",
                name, a, b, c, pole(a, b, c), objetosc(a, b, c));
    }
}
