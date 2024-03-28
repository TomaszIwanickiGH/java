public class Kwadrat extends Prostokat{

    private double a;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    public Kwadrat(double a) {
        super(a);
        this.a = a;
    }
    public Kwadrat(double wys, double szer) {
        super(wys, szer);
    }

    @Override void opis() {
        System.out.format("Kwadrat o wymiarach: %.2f x %.2f o powierzchni %.2f\n", a, a, getPowierzchnia());
    }

    public void opis1(){
        System.out.format("\nKwadrat o boku %.2f, pole: %.2f\n", a, Math.pow(a,2));
    }
}
