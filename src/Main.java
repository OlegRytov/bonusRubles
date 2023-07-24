public class Main {
    public static void main(String[] args) {
        int initialAmount = 200; //начальный счет
        int replenishment = 1100; // сумма пополнения

        int bonus;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        int accountAmount = initialAmount + replenishment + bonus;

        System.out.println("Сумма на счете = " + accountAmount); // Конечная сумма на счете
        System.out.println("Бонус = " + bonus); // Конечная бонусов


    }

}
