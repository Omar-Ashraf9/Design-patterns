public class ItalianRestaurant extends Restaurant{

    public ItalianRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    void addSauce() {
        super.pizza.setSauce("Tomato");
    }

    @Override
    void addTopping() {
        super.pizza.setTopping("Cheese");
    }

    @Override
    void addCrust() {
        super.pizza.setCrust("Thin");
    }
}
