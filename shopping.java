class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    double calculatePrice() {
        return price;
    }
}

class Electronics extends Product {
    Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    double calculatePrice() {
        double discount = price * 0.10;
        double tax = (price - discount) * 0.18;
        return price - discount + tax;
    }
}

class Clothing extends Product {
    Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    double calculatePrice() {
        double discount = price * 0.20;
        double tax = (price - discount) * 0.05;
        return price - discount + tax;
    }
}

public class Main {
    public static void main(String[] args) {
        Product p1 = new Electronics("Laptop", 50000);
        Product p2 = new Clothing("Jacket", 3000);

        System.out.println("Electronics Final Price: "
                           + p1.calculatePrice());

        System.out.println("Clothing Final Price: "
                           + p2.calculatePrice());
    }
}
