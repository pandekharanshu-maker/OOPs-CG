interface ShoppingSystem {
    String SHOP_NAME = "Amazon";
    double TAX_RATE = 0.18;
    double DISCOUNT = 500;
    void addProduct(String productName, double price, int quantity);
    void removeProduct(String productName, boolean count);
    void calculateBill();
    void applyDiscount(double bill);
    void displayCart();
}
interface Payments {
    double PAYMENT_LIMIT = 500000;
    void makePayment(double amount);
    void paymentStatus();
}
class Customer implements ShoppingSystem, Payments {
    String productName;
    double price;
    int quantity;
    double bill;
    double paymentAmount;
    boolean paymentSuccessful;
    public void addProduct(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        System.out.println("Shop Name: " + SHOP_NAME);
        System.out.println("Product: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
    public void removeProduct(String productName, boolean count) {
        if (count == true) {
            this.productName = null;
            this.price = 0;
            this.quantity = 0;
            System.out.println("Product " + productName +
                               " has been successfully removed");
        } else {
            System.out.println("Product " + productName +
                               " was not removed");
        }
    }
    public void calculateBill() {
        bill = price * quantity;
        double tax = bill * TAX_RATE;
        bill = bill + tax;
        System.out.println("Total Bill before applying Discount: " + bill);
    }
    public void applyDiscount(double bill) {
        this.bill = bill - DISCOUNT;
        System.out.println("Total Bill after applying Discount: " + this.bill);
    }
    public void displayCart() {
        if (productName != null) {
            System.out.println("Cart contains " + quantity +
                               " of " + productName);
        } else {
            System.out.println("Cart is empty");
        }
    }
    public void makePayment(double amount) {
        if (amount <= PAYMENT_LIMIT) {
            paymentAmount = amount;
            paymentSuccessful = true;
            System.out.println("Payment Successful");
            System.out.println("Payment Amount: " + amount);
        } else {
            paymentSuccessful = false;
            System.out.println("Payment Failed");
            System.out.println("Payment limit exceeded");
        }
    }
    public void paymentStatus() {
    	if (paymentSuccessful) {
            System.out.println("Payment Status: Successful");
        } else {
            System.out.println("Payment Status: Failed");
        }
    }
}
public class ShoppingCart {
    public static void main(String[] args) {
       Customer C = new Customer();
        C.addProduct("Laptop", 400000, 1);
        C.calculateBill();
        C.applyDiscount(C.bill);
        C.displayCart();
        C.removeProduct("Laptop", false);
        C.makePayment(C.bill);
        C.paymentStatus();
    }
}