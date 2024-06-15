import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProduktManager {

    private static final String FILE_NAME = "src/produkty.txt";

    public void saveProducts(List<Produkt> products) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Produkt product : products) {
                writer.write(product.toCsvString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Produkt> loadProducts() {
        List<Produkt> products = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                products.add(Produkt.fromCsvString(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return products;
    }
}
