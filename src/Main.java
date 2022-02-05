public class Main {
    public static void main(String[] args) {
        int ticketPrice = 200;
        boolean bonus = ticketPrice > 20;
        if (bonus) {
            int x = ticketPrice / 20;
            System.out.println("Вам начислено" + " " + x + " " + "бонусных миль.");
        } else {
            System.out.println("Возьмите с собой друзей для начисления бонуснух миль.");
        }
        System.out.println("Приятного путишествия!");
    }

}
