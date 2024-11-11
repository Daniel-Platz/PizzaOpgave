import java.util.Scanner;

public class UI {
    private Scanner input;

    public UI() {
        input = new Scanner(System.in);
    }

    public void velkommen() {
        System.out.println("Velkommen til, du har nu følgende muligheder: \n1. Bestil pizza\n2. Se bestilling\n3. Afslut");
    }

    public void visValgmuligheder() {
        System.out.println("Hvad vil du gøre nu?");
        System.out.println("1. Bestil en ny pizza");
        System.out.println("2. Se din bestilling");
        System.out.println("3. Afslut bestilling");
    }

    public String fåBrugerInput() {
        return input.next();
    }

    public String fåPizzaValg() {
        System.out.println("Hvilken pizza kunne du tænke dig? (Indtast pizzaens navn)");
        return input.next();
    }

    public void visBestilling(String pizza) {
        if (pizza != null) {
            System.out.println("Din bestilling: \n" + pizza);
        } else {
            System.out.println("Du har ikke bestilt nogen pizza endnu.");
        }
    }

    public void afslut() {
        System.out.println("Tak for besøget!");
    }

    public void ugyldigtValg() {
        System.out.println("Ugyldigt valg, prøv igen.");
    }
}