package View;
import java.util.Scanner;
public class DisplaySavings {
    static double savingActual;
    static double totalLeftover;
    static double finalSavings;

    public DisplaySavings(double savingActual, double totalLeftover) {
        this.savingActual = savingActual;
        this.totalLeftover = totalLeftover;
    }
    //uses switch statement to let user choose to add money to their saving or not to
    protected static void savings() {
        System.out.println("Total remainder = " + "$" +totalLeftover);
        System.out.println("Would you like to add your leftover budget to your savings? Click 1 for yes, Click 2 for no.");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int savings = x;
        String savingsString = "";
        switch (savings) {
            case 1:
                finalSavings =(savingActual + totalLeftover);
                savingsString = "Your total savings are: $" + finalSavings + "!";
                break;
            case 2:
                finalSavings = savingActual + 0;
                savingsString = "Your total savings are: $" + finalSavings + "!";
                break;
        }
        System.out.println(savingsString);
    }
    public static double getFinalSavings() {
        return finalSavings;
    }
}
