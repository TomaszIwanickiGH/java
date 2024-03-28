public class Main {
    public static void main(String[] args) {
        Point[] points = new Point[]{
                new Point(),
                new Point(2.4, 8),
                new Point(-2.5, 3)
        };

        Figura figura = new Figura();
        figura.opis();

        Prostokat prostokat = new Prostokat(3,4);
        System.out.println("Pole prostokata: " + prostokat.getPowierzchnia());

        System.out.println();
        prostokat.przesun(3,5);
        prostokat.opis();

        Trojkat trojkat = new Trojkat(23,56);
        trojkat.opis();

        Kwadrat kwadrat = new Kwadrat(3);
        kwadrat.opis1();

        Okrag okrag = new Okrag(points[1], 3);
        okrag.opis();
    }
}