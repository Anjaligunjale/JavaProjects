import java.util.ArrayList;

public class ProductStore {
    private ArrayList<Product> products = new ArrayList<>();

    public ProductStore() {
        products.add(new Product(1, "Laptop", 55000, 10));
        products.add(new Product(2, "Smartphone", 15000, 25));
        products.add(new Product(3, "Headphones", 1500, 40));
        products.add(new Product(4, "Keyboard", 700, 30));
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public Product findById(int id) {
        for (Product p : products) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    public void addProduct(Product p) {
        products.add(p);
        System.out.println("Product added successfully!
");
    }
}