import java.util.*;
public class vendingmachine {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Cola = 90;
        int Fanta = 90;
        int Sprite = 90;
        int choice = 0;
        int money = 0;
        int amount = 0;
        int totaalbedrag, centen;

        ArrayList<String> alist = new ArrayList<String>();
        alist.add("Cola");
        alist.add("Fanta");
        alist.add("Sprite");

        System.out.println("We have the following drinks");
        System.out.println(alist);

        System.out.println("Please enter your selection");
        choice = scanner.nextInt();
        {
            System.out.println("Enter your amount in cents");
            money = scanner.nextInt();
            if (money > 200) {
                System.out.println("Please insert an amount lower than that!");
                money = scanner.nextInt();
            } else System.exit(0);
        }
        switch (choice) {
            case 1:
                System.out.println("You've entered:" + money + " cent");
                System.out.println("You have chosen Cola!");
                amount = money - Cola;
                System.out.println("Your change is:" + amount + " cents");
                break;

            case 2:
                System.out.println("You've entered:" + money + " cent");
                System.out.println("You have chosen Fanta!");
                amount = money - Fanta;
                System.out.println("Your change is:" + amount + " cent");

            case 3:
                System.out.println("You've entered:" + money + " cent");
                System.out.println("You have chosen Sprite!");
                amount = money - Sprite;
                System.out.println("Your change is:" + amount + " cent");
        }

    }
}