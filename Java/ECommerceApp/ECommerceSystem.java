import java.util.ArrayList;
import java.util.Scanner;

public class ECommerceSystem {
    private ArrayList<User> users = new ArrayList<>();
    private ProductStore store = new ProductStore();
    private Scanner sc = new Scanner(System.in);

    public ECommerceSystem() {
        users.add(new User("admin", "admin123", true));
        users.add(new User("user", "user123", false));
    }

    public User login() {
        System.out.print("Enter Username: ");
        String uname = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        for (User u : users) {
            if (u.getUsername().equals(uname) && u.verify(pass)) {
                System.out.println("Login successful!\n");
                return u;
            }
        }

        System.out.println("Invalid Username or Password.\n");
        return null;
    }

    public void userMenu(User user) {
        Cart cart = new Cart();

        while (true) {
            System.out.println("====== User Menu ======");
            System.out.println("1. View Products");
            System.out.println("2. Add to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Logout");
            System.out.print("Choice: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    for (Product p : store.getProducts()) {
                        System.out.println(p);
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();

                    Product p = store.findById(id);
                    if (p == null) {
                        System.out.println("Invalid product.\n");
                        break;
                    }

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    if (qty > p.getStock()) {
                        System.out.println("Not enough stock.\n");
                        break;
                    }

                    p.setStock(p.getStock() - qty);
                    cart.addToCart(p, qty);
                    break;

                case 3:
                    cart.viewCart();
                    break;

                case 4:
                    cart.checkout();
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public void adminMenu() {
        while (true) {
            System.out.println("====== Admin Menu ======");
            System.out.println("1. View Products");
            System.out.println("2. Add Product");
            System.out.println("3. Logout");
            System.out.print("Choice: ");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    for (Product p : store.getProducts()) {
                        System.out.println(p);
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    System.out.print("Enter Stock: ");
                    int stock = sc.nextInt();

                    store.addProduct(new Product(id, name, price, stock));
                    break;

                case 3:
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
