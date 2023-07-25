import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        LimitException limitException = new LimitException("Эльнур");
        BackAccount backAccount = new BackAccount(1500);
        System.out.println(" клиент:" + limitException.getRemainingAmount());
        System.out.println("остаток:" + backAccount.getAmount());
        while (true) {
            int i = 6000;

            System.out.println("Снято 6000 сом. Остаток на счете: " + backAccount.getAmount() + " сом");
        }
    } catch (LimitException e;

    {
        System.out.println("Ошибка: " + e.getMessage());
        System.out.println("Максимальная сумма для снятия: " + e.getRemainingAmount() + " сом");
    }
}





