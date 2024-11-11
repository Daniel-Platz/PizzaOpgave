public class Pizza {
    private String titel;
    private String sovs;
    private String toppings;

    public Pizza(String titel, String sovs, String toppings) {
        this.titel = titel;
        this.sovs = sovs;
        this.toppings = toppings;
    }

    public String getTitel() {
        return titel;
    }

    public String getSovs() {
        return sovs;
    }

    public String getToppings() {
        return toppings;
    }

    public void printPizzaDetails() {
        System.out.println("Titel: " + titel);
        System.out.println("Sovs: " + sovs);
        System.out.println("Toppings: " + toppings);
    }
}