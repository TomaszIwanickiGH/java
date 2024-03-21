package Figures;

public class Kwadrat {
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

    private int pole(int a) { return a*a; }
    private int obwod(int a) { return 4*a; }
    public void view(){
        System.out.format("Figura: %s, bok: %d, pole: %d, obwód: %d",
                name, a, pole(a), obwod(a));
    }
}
