package org.example.solidprinciple.SRP;
import java.util.ArrayList;
import java.util.List;

// Product class representing any item in eCommerce.
class ShoppingProduct {
    public String name;
    public double price;

    public ShoppingProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

// 1. ShoppingCart: Only responsible for Cart related business logic.
class Cart {
    private List<ShoppingProduct> products = new ArrayList<>();

    public void addProduct(ShoppingProduct p) {
        products.add(p);
    }

    public List<ShoppingProduct> getProducts() {
        return products;
    }

    // Calculates total price in cart.
    public double calculateTotal() {
        double total = 0;
        for (ShoppingProduct p : products) {
            total += p.price;
        }
        return total;
    }
}

// 2. ShoppingCartPrinter: Only responsible for printing invoices
class ShoppingCartPrinter {
    private Cart cart;

    public ShoppingCartPrinter(Cart cart) {
        this.cart = cart;
    }

    public void printInvoice() {
        System.out.println("Shopping Cart Invoice:");
        for (ShoppingProduct p : cart.getProducts()) {
            System.out.println(p.name + " - Rs " + p.price);
        }
        System.out.println("Total: Rs " + cart.calculateTotal());
    }
}

// 3. ShoppingCartStorage: Only responsible for saving cart to DB
class ShoppingCartStorage {
    private Cart cart;

    public ShoppingCartStorage(Cart cart) {
        this.cart = cart;
    }

    public void saveToDatabase() {
        System.out.println("Saving shopping cart to database...");
    }
}

public class SRP_Followed {
    public static void main(String[] args) {
        Cart cart = new Cart();

        cart.addProduct(new ShoppingProduct("Laptop", 50000));
        cart.addProduct(new ShoppingProduct("Mouse", 2000));

        ShoppingCartPrinter printer = new ShoppingCartPrinter(cart);
        printer.printInvoice();

        ShoppingCartStorage db = new ShoppingCartStorage(cart);
        db.saveToDatabase();
    }
}
