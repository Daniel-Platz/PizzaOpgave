import java.util.ArrayList;

public class PizzaMenu {
    private ArrayList<Pizza> pizzaMenu = new ArrayList<>();

    public void tilføjPizza(Pizza pizza) {
        pizzaMenu.add(pizza);
    }

    public void printMenu() {
        int counter = 1;
        for (Pizza pizza : pizzaMenu) {
            System.out.println(counter + ". " + pizza.getTitel());
            pizza.printPizzaDetails();
            counter++;
            System.out.println();
        }
    }

    public Pizza findPizzaByName(String name) {
        for (Pizza pizza : pizzaMenu) {
            if (pizza.getTitel().equalsIgnoreCase(name)) {
                return pizza;
            }
        }
        return null;
    }
}