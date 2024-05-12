public class AmericanRestaurant extends Restaurant{

        public AmericanRestaurant(Pizza pizza) {
            super(pizza);
        }

        @Override
        void addSauce() {
            super.pizza.setSauce("BBQ");
        }

        @Override
        void addTopping() {
            super.pizza.setTopping("Sausage");
        }

        @Override
        void addCrust() {
            super.pizza.setCrust("Thick");
        }
}
