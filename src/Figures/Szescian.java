package Figures;

public class Szescian {
    private int a;
    private String name;
    public int getA() {
        return a;
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

    private int pole(int a) { return 6*(a*a); }
    private int objetosc(int a) { return a*a*a; }
    public void view(){
        System.out.format("Figura: %s, bok: %d, pole: %d, objetosc: %d",
                name, a, pole(a), objetosc(a));
    }
}
