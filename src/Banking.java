import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

/**
 * Created by amber on 2/3/17.
 */
public class Banking {

    public static void main(String[] args) throws Exception {


        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");

        String name = scanner.nextLine();

        if (name.isEmpty()) {
            throw new Exception("name not entered");
        } else {
            System.out.println("Welcome, " + name);
        }

        System.out.println("How can I help you today? Please select from the following: [1.checkBalance 2.WithdrawFunds 3.Cancel]");

        int response = scanner.nextInt();

        switch (response) {
            case 1:
                System.out.println("Your balance is $100");
                break;

            case 2:
                System.out.println("How much?");
                int withdrawalAmt = scanner.nextInt();
                if (withdrawalAmt > 100) {

                    System.out.println("Invalid amount!");
                } else {
                    System.out.println("Remove cash now!");
                }
                break;

            case 3:
                System.out.println("Thank you and please come again");
                break;

            default:
                System.out.println("Invalid option entered!");
        }
    }
}
