import java.util.ArrayList;

public class Controller {
    private PizzaMenu menu;
    private ArrayList<Pizza> bestiltePizzaer;

    public Controller(PizzaMenu menu) {
        this.menu = menu;
        this.bestiltePizzaer = new ArrayList<>();
    }

    public void kørBestillingsFlow(UI ui) {
        boolean fortsætBestilling = true;

        while (fortsætBestilling) {
            ui.visValgmuligheder();
            String valg = ui.fåBrugerInput();

            switch (valg) {
                case "1":
                    bestilPizza(ui);
                    break;
                case "2":
                    seBestilling(ui);
                    break;
                case "3":
                    System.out.println("Bestillingsprocessen afsluttet.");
                    fortsætBestilling = false;
                    break;
                default:
                    System.out.println("Ugyldigt valg. Prøv igen.");
            }
        }
    }

    public void bestilPizza(UI ui) {
        menu.printMenu();
        String valgtPizzaNavn = ui.fåPizzaValg();
        Pizza valgtPizza = menu.findPizzaByName(valgtPizzaNavn);

        if (valgtPizza != null) {
            bestiltePizzaer.add(valgtPizza);
            System.out.println("Du har tilføjet: " + valgtPizza.getTitel() + " til din bestilling.");
        } else {
            System.out.println("Denne pizza findes ikke. Prøv igen.");
        }
    }

    public void seBestilling(UI ui) {
        if (bestiltePizzaer.isEmpty()) {
            System.out.println("Du har ikke bestilt nogen pizza endnu.");
        } else {
            System.out.println("Din bestilling:");
            for (Pizza pizza : bestiltePizzaer) {
                pizza.printPizzaDetails();
                System.out.println();
            }
        }
    }
}