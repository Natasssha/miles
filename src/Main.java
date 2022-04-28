public class Main {
    public static void main(String[] args) {
        int ticket = 6850; // Стоимость билета в руб.
        int costMiles = 20; // Стоимость 1 мили.

        int miles = (ticket / costMiles);

        System.out.println("Вам начислено: " + miles + " Мили.");

    }
}

