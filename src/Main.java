public class Main {

    public static void main(String[] args) {

        int ticketPrise = 1200;
        int everySpent = 20;

        int scores;
        if (ticketPrise >= 20) {
            scores = 1;
        } else {
            scores = 0;
        }
        System.out.println(scores);

        int miles = ticketPrise / everySpent;
        System.out.println("Накопленные мили: " + miles);
    }


}
