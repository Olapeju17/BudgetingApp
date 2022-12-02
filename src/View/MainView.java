package View;
import Entities.*;
public class MainView {
    static User user;
    public static void run (){
        StartPage.introPage();
        user=StartPage.getUser();
        DisplayExpenses displayExpenses = new DisplayExpenses(user);
        DisplayExpenses.displayExpenses();
        ActualSpending actualSpending =new ActualSpending(user.getIncome(),displayExpenses.getFoodValue(),displayExpenses.getShopValue(),
                displayExpenses.getTransValue(),displayExpenses.getSaveValue());
        ActualSpending.actualSpending();
        ActualSpending.displaySpending();
        PointRewards pointRewards = new PointRewards(user.getIncome(),actualSpending.getTotalLeftover());
        PointRewards.PointRewards();
        DisplaySavings displaySavings =new DisplaySavings(actualSpending.getSavingActual(),actualSpending.getTotalLeftover());
        DisplaySavings.savings();
    }
}

