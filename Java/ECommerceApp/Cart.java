import java.util.ArrayList;

public class Cart {
    private ArrayList<CartItem> items = new ArrayList<>();

    public void addToCart(Product product, int qty) {
        items.add(new CartItem(product, qty));
        System.out.println(qty + " x " + product.getName() + " added to cart.
");
    }

    public void viewCart() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty.
");
            return;
        }

        System.out.println("----- Your Cart -----");
        double total = 0;
        for (CartItem item : items) {
            System.out.println(item.getProduct().getName() + 
                               " | Qty: " + item.getQuantity() +
                               " | Total: ₹" + item.getTotal());
            total += item.getTotal();
        }
        System.out.println("Grand Total: ₹" + total + "
");
    }

    public void checkout() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty.
");
            return;
        }

        System.out.println("Order placed successfully!");
        System.out.println("Thank you for shopping.
");
        items.clear();
    }
}