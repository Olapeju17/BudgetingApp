package View;
import Entities.User;
import java.lang.Math;
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
    //saves values and prints out the users percentages  using Math method, and getters
    public static void displayExpenses(){
        //Multiplies by 100 because the inputs were take by decimals, rounds to an integer to print whole number
        foodValue =((user.getExpensesList().get(0).getPercentage())*100);
        shopValue = ((user.getExpensesList().get(1).getPercentage())*100);
        transValue = ((user.getExpensesList().get(2).getPercentage())*100);
        saveValue = ((user.getExpensesList().get(3).getPercentage())*100);
        rentValue = ((user.getExpensesList().get(4).getPercentage())*100);
        System.out.println("Food is: " + Math.round(foodValue) + "%");
        System.out.println("Shopping is: " + Math.round(shopValue)+"%");
        System.out.println("Transportation is: " + Math.round(transValue) +"%");
        System.out.println("Savings is: " + Math.round(saveValue) +"%");
        //Divides by 100 to change Value back to a decimal
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
}
