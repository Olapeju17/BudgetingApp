package View;
import Entities.User;
public class DisplayExpenses {
    static double foodValue;
    static double shopValue;
    static double transValue;
    static double saveValue;
    static double rentValue;
    static double income;
    static User user;
    public DisplayExpenses(User user){
        this.user =user;
        income = user.getIncome();
    }
    public static void displayExpenses(){
        foodValue =(Math.round((user.getExpensesList().get(0).getPercentage())*100));
        shopValue = (Math.round((user.getExpensesList().get(1).getPercentage())*100));
        transValue = (Math.round((user.getExpensesList().get(2).getPercentage())*100));
        saveValue = (Math.round((user.getExpensesList().get(3).getPercentage())*100));
        rentValue = (Math.round((user.getExpensesList().get(4).getPercentage())*100));
        System.out.println("Food is: " + foodValue + "%");
        System.out.println("Shopping is: " + shopValue+"%");
        System.out.println("Transportation is: " + transValue +"%");
        System.out.println("Savings is: " + saveValue +"%");
        System.out.println("Your rent is: " +rentValue+"% of your income!");
        System.out.println("Your monthly food budget is: $" + ((foodValue * income)/100));
        System.out.println("Your monthly shopping budget is: $" + ((shopValue * income)/100));
        System.out.println("Your monthly transportation budget is: $" + ((transValue *income)/100));
        System.out.println("Your monthly savings expenses budget is: $" + ((saveValue * income)/100) + '\n');
    }
    public double getFoodValue (){
        return foodValue;
    }
    public double getShopValue (){
        return shopValue;
    }
    public double getTransValue (){
        return transValue;
    }
    public double getSaveValue (){
        return saveValue;
    }
    public double getRentValue (){
        return rentValue;
    }
}
