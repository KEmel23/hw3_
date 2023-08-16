import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        BackAccount backAccount= new BackAccount();
        backAccount.depozit(15000);
        while (true){
            try {
                backAccount.withDraw(6000);
            }
            catch (LimitException e){
                try {
                    backAccount.withDraw( (int) e.getRemainingAmount());
                }

                catch (LimitException i){
                    System.out.println(i.getMessage());
                }

            }
            System.out.println(backAccount.getAmount());
            if (backAccount.getAmount()== 0 ){
                break;
            }
        }
    }
}





