public abstract class Restaurant {
    protected Pizza pizza;

    public Restaurant(Pizza pizza) { this.pizza = pizza; }

    abstract void addSauce();
    abstract void addTopping();
    abstract void addCrust();

    public void makePizza() {
        addSauce();
        addTopping();
        addCrust();
        pizza.assemble();
    }
}
