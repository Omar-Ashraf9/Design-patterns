public abstract class Pizza {
    private String sauce;
    private String topping;
    private String crust;

    public String getSauce() {
        return sauce;
    }

    public String getTopping() {
        return topping;
    }

    public String getCrust() {
        return crust;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public abstract void assemble();
}
