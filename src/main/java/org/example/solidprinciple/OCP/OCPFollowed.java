package org.example.solidprinciple.OCP;
import java.util.ArrayList;
import java.util.List;

// Product class representing any item in eCommerce.
class ProductA {
    public String name;
    public double price;

    public ProductA(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

// 1. ShoppingCart: Only responsible for Cart related business logic.
class ShoppingCartA {
    private List<ProductA> products = new ArrayList<>();

    public void addProduct(ProductA p) {
        products.add(p);
    }

    public List<ProductA> getProducts() {
        return products;
    }

    // Calculates total price in cart.
    public double calculateTotal() {
        double total = 0;
        for (ProductA p : products) {
            total += p.price;
        }
        return total;
    }
}

// 2. ShoppingCartPrinter: Only responsible for printing invoices
class ShoppingCartPrinterA {
    private ShoppingCartA cart;

    public ShoppingCartPrinterA(ShoppingCartA cart) {
        this.cart = cart;
    }

    public void printInvoice() {
        System.out.println("Shopping Cart Invoice:");
        for (ProductA p : cart.getProducts()) {
            System.out.println(p.name + " - Rs " + p.price);
        }
        System.out.println("Total: Rs " + cart.calculateTotal());
    }
}

interface Persistence {
    void save(ShoppingCartA cart);
}

class SQLPersistence implements Persistence {
    @Override
    public void save(ShoppingCartA cart) {
        System.out.println("Saving shopping cart to SQL DB...");
    }
}

class MongoPersistence implements Persistence {
    @Override
    public void save(ShoppingCartA cart) {
        System.out.println("Saving shopping cart to MongoDB...");
    }
}

class FilePersistence implements Persistence {
    @Override
    public void save(ShoppingCartA cart) {
        System.out.println("Saving shopping cart to a file...");
    }
}

public class OCPFollowed {
    public static void main(String[] args) {
        ShoppingCartA cart = new ShoppingCartA();
        cart.addProduct(new ProductA("Laptop", 50000));
        cart.addProduct(new ProductA("Mouse", 2000));

        ShoppingCartPrinterA printer = new ShoppingCartPrinterA(cart);
        printer.printInvoice();

        Persistence db    = new SQLPersistence();
        Persistence mongo = new MongoPersistence();
        Persistence file  = new FilePersistence();

        db.save(cart);    // Save to SQL database
        mongo.save(cart); // Save to MongoDB
        file.save(cart);  // Save to File
    }
}
