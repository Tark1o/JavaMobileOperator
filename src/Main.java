import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        int balance = 100;
        System.out.println("Текущий счет:" + balance);
        int pay = 1200;
        System.out.println("Внесенный платеж:" + pay);
        int bonus;
        if (pay >= 1000) {
            bonus = pay / 100;
        } else {
            bonus = 0;
        }
        long FinalBalance = balance + pay + bonus;

        System.out.println("Итоговый бонус:" + bonus);
        System.out.println("Итоговый счет:" + FinalBalance);
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}