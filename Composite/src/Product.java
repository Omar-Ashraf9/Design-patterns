public abstract class Product implements Box{
    private final String name;
    private final double price;

    public Product(String title, double price) {
        this.name = title;
        this.price = price;
    }

    public String getTitle() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// This is the leaf class in the Composite pattern. It implements the Box interface.