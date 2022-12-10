package View;
import javax.swing.*;
import java.util.Scanner;
public class PointRewards {
    static double totalLeftover;
    static double income;
    static double finalSavings;
    static double savingInvested;

    public PointRewards(double income, double totalLeftover, double finalSavings) {
        this.income = income;
        this.totalLeftover = totalLeftover;
        this.finalSavings = finalSavings;
    }
    //if statements are used to print out the amount of points earned based on the amount of money left over
    //uses conditional operator
    public static void PointRewards() {
        if (totalLeftover > 0.0 && totalLeftover < 30.0) {
            System.out.println("Congrats! You've earned 10 savings points!");
        }
        if (totalLeftover > 30.0 && totalLeftover < 60.0) {
            System.out.println("Congrats! You've earned 20 savings points!");
        }
        if (totalLeftover > 60.0 && totalLeftover < 90.0) {
            System.out.println("Congrats! You've earned 30 savings points!");
        }
        if (totalLeftover > 90.0 && totalLeftover < 120.0) {
            System.out.println("Congrats! You've earned 40 savings points!");
        }
        if (totalLeftover > 120.0 && totalLeftover < 180.0) {
            System.out.println("Congrats! You've earned 50 savings points!");
        }
        if (totalLeftover > 180.0 && totalLeftover < 240.0) {
            System.out.println("Congrats! You've earned 60 savings points!");
        }
        if (totalLeftover > 240.0 && totalLeftover < 300.0) {
            System.out.println("Congrats! You've earned 70 savings points!");
        }
        if (totalLeftover > 300.0 && totalLeftover < 360.0) {
            System.out.println("Congrats! You've earned 80 savings points!");
        }
        if (totalLeftover > 360.0 && totalLeftover < 420.0) {
            System.out.println("Congrats! You've earned 90 savings points!");
        }
        if (totalLeftover > 420.0 && totalLeftover < 500) {
            System.out.println("Congrats! You've earned 100 savings points!");
        }
        if (totalLeftover > 500.0 && totalLeftover < 700.0) {
            System.out.println("Congrats! You've earned 150 savings points!");
        }
        if (totalLeftover > 700.0 && totalLeftover < 1000.0) {
            System.out.println("Congrats! You've earned 200 savings points!");
        }
        if (totalLeftover > 1000.0 && totalLeftover < income) {
            System.out.println("Congrats! You've earned 500 savings points!");
        } else if (totalLeftover == 0.0) {
            System.out.println("You've earned 0 points");
        }
        System.out.println("----------------------------------------------------");
    }
    //gives users the option to add their savings to investments

    protected static void Investment() {
        System.out.println("Would you like to invest a portion of your savings? " + "\n" + "Click 1 for yes, Click 2 for no.");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int invest = x;
        String investmentString = "";
        switch (invest) {
            case 1:
                investmentString = "Great! Please enter what percent you'd like to invest. (ex. 20 = 20%)";
                System.out.println(investmentString);
                int investPercentage = input.nextInt();
                //investPercentage /= 100;
                savingInvested = (finalSavings * investPercentage);
                savingInvested /= 100;
                //multiplying savings by the users choice of percentage
                System.out.println("$" + (savingInvested) + " will be invested! Thank you!");
                break;
            case 2:
                investmentString = "You chose to not invest, thank you.";
                System.out.println(investmentString);
                break;
        }
        System.out.println("********************************************");
    }
    public static void Balance() {
        double newSavings =(finalSavings-savingInvested);
        System.out.println("Here is your new account balance!"+ "\n");
        String[][] balance = new String[3][2];
        balance[0][0] = "Balance Type:  ";
        balance[0][1] = "Amount:";
        balance[1][0] = "Savings Balance:   | ";
        balance[1][1] = ("$"+ (newSavings) + " | ");
        balance[2][0] = "Investment Balance: | ";
        balance[2][1] = ("$"+(Math.round(savingInvested)) + " | ");
        System.out.print(balance[0][0] + " | " + balance[0][1]);
        for (int r = 1; r < 3; r++) {
            System.out.println("\n"+"------------------------------");
            for (int c = 0; c < 2; c++) {
                System.out.print(balance[r][c]);
            }
        }
        savingInvested =0;
        System.out.println("\n" +"********************************************");
    }
    public static void Button () {
        JFrame frame = new JFrame();
        JButton button = new JButton("Thank you for using MoneyUp! Good bye!");
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 100);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

