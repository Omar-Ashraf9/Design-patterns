public class Main {
    public static void main(String[] args) {
        Fighter wizardAdapter = new WizardAdapter(new Wizard());

        wizardAdapter.attack();
        wizardAdapter.defend();
        wizardAdapter.escape();

    }
}