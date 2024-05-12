public class Main {
    public static void main(String[] args) {
        AmericanRestaurant americanRestaurant = new AmericanRestaurant(new VeggiePizza());
        americanRestaurant.makePizza();

        ItalianRestaurant italianRestaurant = new ItalianRestaurant(new VeggiePizza());
        italianRestaurant.makePizza();
    }
}