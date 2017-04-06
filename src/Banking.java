import java.util.Scanner;
import java.util.HashMap;

public class Banking {

    public static void main(String[] args) throws Exception {

        HashMap<String, Double> hmap = new HashMap<String, Double>();

        hmap.put("Amber", new Double(1000000.82));
        hmap.put("Chase", new Double(500000.06));
        hmap.put("AndrewCaleb", new Double(500000.15));


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter is your name");
        String name = scanner.nextLine();

        if (hmap.containsKey(name)) {

            System.out.println("Welcome, " + name);

        } else {
            throw new Exception("Name not recognized. Would you like to create an account?");
        }

        System.out.println("How can I help you today? Please select from the following: [1.checkBalance 2.WithdrawFunds 3.Delete Account 4.Cancel]");

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
                System.out.println("Are you sure you want to delete this account? [y/n]");
                String answer = scanner.nextLine();
                if (answer.equalsIgnoreCase("y")) {
                    hmap.remove(hmap);
                    System.out.println("Your account has been deleted.");
                }
                break;

            case 4:
                System.out.println("Thank you and please come again");
                break;

            default:
                System.out.println("Invalid option entered!");
                }

        }

    }

