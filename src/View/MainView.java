package View;
import Entities.*;
public class MainView {
    static User user;

    //This method runs all the classes
    public static void run (){
        Advice.adviceGiven();
        StartPage.introPage();
        user=StartPage.getUser();
        DisplayExpenses displayExpenses = new DisplayExpenses(user);
        DisplayExpenses.displayExpenses();
        ActualSpending actualSpending =new ActualSpending(user.getIncome(),displayExpenses.getFoodValue(),displayExpenses.getShopValue(),
                displayExpenses.getTransValue(),displayExpenses.getSaveValue());
        ActualSpending.actualSpending();
        ActualSpending.displaySpending();
        DisplaySavings displaySavings =new DisplaySavings(actualSpending.getSavingActual(),actualSpending.getTotalLeftover());
        DisplaySavings.savings();
        PointRewards pointRewards = new PointRewards(user.getIncome(),actualSpending.getTotalLeftover(),DisplaySavings.getFinalSavings());
        PointRewards.PointRewards();
        PointRewards.investment();
        PointRewards.Button();
    }
}

