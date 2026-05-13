package OOPS.Encapsulation;

class Product {

    private String productName;
    private int stock;

    public Product(String productName, int stock) {
        this.productName = productName;
        this.stock = stock;
    }

    // Getter
    public int getStock() {
        return stock;
    }

    // Method to purchase product
    public void buyProduct(int quantity) {

        if (quantity <= stock) {
            stock -= quantity;
            System.out.println(quantity + " items purchased.");
        } else {
            System.out.println("Out of stock.");
        }
    }

    // Method to add stock
    public void addStock(int quantity) {

        if (quantity > 0) {
            stock += quantity;
            System.out.println(quantity + " items added to stock.");
        }
    }
}

public class ECommerceExample {
    public static void main(String[] args) {

        Product product = new Product("Laptop", 10);

        product.buyProduct(2);

        System.out.println("Remaining Stock: " + product.getStock());
    }
}
