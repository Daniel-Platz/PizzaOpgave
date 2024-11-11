public class Main {
    public static void main(String[] args) {
        PizzaMenu menu = new PizzaMenu();
        Pizza pepperoni = new Pizza("Pepperoni", "Tomat", "Ost & Pepperoni");
        Pizza skinke = new Pizza("Skinke", "Tomat", "Ost & Skinke");

        menu.tilføjPizza(pepperoni);
        menu.tilføjPizza(skinke);

        UI ui = new UI();
        Controller controller = new Controller(menu);

        controller.kørBestillingsFlow(ui);
    }
}