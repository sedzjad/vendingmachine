import java.util.*;
public class vendingmachine {
    public static void main (String[] args){
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
    choice = scanner.nextInt();{
        
        }

    String drankjes;
            boolean yn = false;
            System.out.println("What would you like to drink today?");
            drankjes = scanner.next();
            switch (drankjes) {
                case "Cola":
                    alist.get(0);
                    System.out.println("Je hebt Cola gekozen");
                    break;
                case "Fanta":
                    alist.get(1);
                    System.out.println("Je hebt Fanta gekozen");
                    break;
                case "Sprite":
                    alist.get(2);
                    System.out.println("Je hebt Sprite gekozen");
                    break;
            }
    }
}
