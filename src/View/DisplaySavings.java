package View;
import java.util.Scanner;
public class DisplaySavings {
    static double savingActual;
    static double totalLeftover;

    public DisplaySavings(double savingActual, double totalLeftover){
        this.savingActual =savingActual;
        this.totalLeftover=totalLeftover;
    }
    //uses switch statement to let user choose to add money to their saving or not to
    public static void savings () {
        double savings1 = (savingActual + totalLeftover);
        double savings2 = savingActual;
        System.out.println("Total remainder= " +totalLeftover);
        System.out.println("Would you like to add your leftover budget to your savings? Click 1 for yes, Click 2 for no.");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int savings = x;
        String savingsString = "";
        switch (savings) {
            case 1:
                savingsString = "Your total savings are: $" + savings1 + "!";
                break;
            case 2:
                savingsString = "Your total savings are: $" +savings2+ "!";
                break;
        }
        System.out.println(savingsString);
        System.out.println("Thank you for using MoneyUp!");
    }

}
