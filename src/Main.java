import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        int balance = 100;
        System.out.println("Текущий счет:" + balance);
        int pay = 1200;
        System.out.println("Внесенный платеж:" + pay);
        int percent = 100;
        int bonus;
        if (pay >= 1000) {
            bonus = pay / percent;
        } else {
            bonus = 0;
        }
        long FinalBalance = balance + pay + bonus;

        System.out.println("Итоговый бонус:" + bonus);
        System.out.println("Итоговый счет:" + FinalBalance);
        int secondBalance = 1312;
        System.out.println("Второй текущий баланс" + secondBalance);
        int secondPay = 300;
        System.out.println("Второй внесенный платеж" + secondPay);
        int secondBonus;
        if (secondPay >= 1000) {
            secondBonus = secondPay / percent;
        } else {
            secondBonus = 0;
        }
        long secondFinalBalance = secondBalance + secondPay + secondBonus;
        System.out.println("Второй итоговый бонус" + secondBonus);
        System.out.println("Второй итоговый счёт" + secondFinalBalance);
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}