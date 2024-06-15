import java.io.Serializable;

public class Produkt implements Serializable {
    private int id;
    private String name;
    private double price;

    public Produkt(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return id + ". " + name + ". " + price + "zł";
    }

    public int wyswietlId() {
        return id;
    }

    public String toCsvString() {
        return id + "," + name + "," + price;
    }

    public static Produkt fromCsvString(String csv) {
        String[] parts = csv.split(",");
        int id = Integer.parseInt(parts[0]);
        String name = parts[1];
        double price = Double.parseDouble(parts[2]);
        return new Produkt(id, name, price);
    }
}
