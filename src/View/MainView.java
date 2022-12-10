package View;
import Entities.*;

import java.util.Scanner;

public class MainView {
    static User user;
    //This method runs all the classes
    public static void run() {
        Advice.adviceGiven();
        StartPage.introPage();
        StartPage.personalProfile();
        user = StartPage.getUser();
        DisplayExpenses displayExpenses = new DisplayExpenses(user);
        DisplayExpenses.displayExpenses();
        ActualSpending actualSpending = new ActualSpending(user.getIncome(), displayExpenses.getFoodValue(), displayExpenses.getShopValue(),
                displayExpenses.getTransValue(), displayExpenses.getSaveValue());
        ActualSpending.actualSpending();
        ActualSpending.displaySpending();
        DisplaySavings displaySavings = new DisplaySavings(actualSpending.getSavingActual(), actualSpending.getTotalLeftover());
        DisplaySavings.savings();
        PointRewards pointRewards = new PointRewards(user.getIncome(), actualSpending.getTotalLeftover(), DisplaySavings.getFinalSavings());
        PointRewards.PointRewards();
        PointRewards.investment();
        PointRewards.Balance();
        MainView.again();
        System.out.println("Good Bye!");
    }
    //runs the code again until the user quits
    public static void again() {
        System.out.println("Would you like to keep budgeting? Click 1 to continue or Click 2 to stop.");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        while (x == 1) {
            System.out.println("------------------------------------");
            System.out.println("Awesome! Let's get started!");
            StartPage.introPage();
            user = StartPage.getUser();
            DisplayExpenses displayExpenses = new DisplayExpenses(user);
            DisplayExpenses.displayExpenses();
            ActualSpending actualSpending = new ActualSpending(user.getIncome(), displayExpenses.getFoodValue(), displayExpenses.getShopValue(),
                    displayExpenses.getTransValue(), displayExpenses.getSaveValue());
            ActualSpending.actualSpending();
            ActualSpending.displaySpending();
            DisplaySavings displaySavings = new DisplaySavings(actualSpending.getSavingActual(), actualSpending.getTotalLeftover());
            DisplaySavings.savings();
            PointRewards pointRewards = new PointRewards(user.getIncome(), actualSpending.getTotalLeftover(), DisplaySavings.getFinalSavings());
            PointRewards.PointRewards();
            PointRewards.investment();
            PointRewards.Balance();
            MainView.again();
            x = 0;
        }
        PointRewards.Button();
    }
}

