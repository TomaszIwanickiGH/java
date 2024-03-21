package Figures;

public class Prostokat {
    private int a;
    private int b;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int pole(int a, int b) { return a*b; }
    private int obwod(int a, int b) { return 2*a + 2*b; }
    public void view(){
        System.out.format("Figura: %s, bok a: %d, bok b: %d, pole: %d, obwód: %d",
                name, a, b, pole(a, b), obwod(a, b));
    }
}
