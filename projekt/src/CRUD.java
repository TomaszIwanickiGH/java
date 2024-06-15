import java.util.List;

public class CRUD {
    ProduktManager manager = new ProduktManager();

    public void addProduct(List<Produkt> products, Produkt product) {
        products.add(product);
        manager.saveProducts(products);
    }

    public void updateProduct(List<Produkt> products, int id, String newName, double newPrice) {
        for (Produkt product : products) {
            if (product.getId() == id) {
                product.setName(newName);
                product.setPrice(newPrice);
                break;
            }
        }
        manager.saveProducts(products);
    }

    public void deleteProduct(List<Produkt> products, int id) {
        products.removeIf(product -> product.getId() == id);
        manager.saveProducts(products);
    }
}
