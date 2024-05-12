public class WizardAdapter implements Fighter {
    private Wizard wizard;

    public WizardAdapter(Wizard wizard) {
        this.wizard = wizard;
    }

    @Override
    public void attack() {
        wizard.castSpell();
    }

    @Override
    public void defend() {
        wizard.shield();
    }

    @Override
    public void escape() {
        wizard.teleport();
    }
}

// This is the Adapter class. It adapts the interface of the Adaptee to the Target interface.