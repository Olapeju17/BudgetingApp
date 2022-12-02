package View;
import Entities.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Date;
public class StartPage {
    static double income;
    static User user;
    static void introPage() {
        Date date = new Date();
        //Prints today's date
        System.out.println("Today is: " +date.toString());
        double total =0;
        //Asks the user their names and creates a username using a random two-digit numbers
        System.out.println("Hello! Welcome to the MoneyUP! Let's get started with a username!");
        System.out.println("Please enter your first name:");
        Scanner input = new Scanner(System.in);
        String firstName = input.next();
        System.out.println("Please enter your last name:");
        String lastName = input.next();
        Random num= new Random();
        int ranNum=num.nextInt(99);
        String userName= firstName.toUpperCase() + lastName.toLowerCase().substring(lastName.length() -1 )+ranNum;
        //Makes the first name upper case, lower-cases the last letter of the last name, adds random number
        System.out.println("Your username is: " +userName);
        System.out.println("Hi " + firstName + ", let's start budgeting!");
        System.out.println("This app will help you budget your expenses! What is your monthly income: ");
        income = input.nextDouble();
        System.out.println("Please enter what percentage of your income will go towards the following budgets: (ex. .30 = 30%)" + '\n' + "* Budget must equal 100% *");
        System.out.print("Enter your food budget percentage: ");
        double food = input.nextDouble();
        System.out.print("Enter your shopping budget percentage: ");
        double shop = input.nextDouble();
        System.out.print("Enter your transportation budget percentage: ");
        double trans = input.nextDouble();
        System.out.print("Enter your savings budget percentage: ");
        double save = input.nextDouble();
        total= (food+shop+trans+save);
        //while loop makes sure that the user doesn't input a percentage that is higher/lower than 100%
        while (total != 1.0) {
            if (total > 1.0) {
                System.out.println("You've entered: " + ((total)*100) + "%. That's too high! Please re-enter your budget! * Must equal 100% *");
            } else if (total < 1.0) {
                System.out.println("You've entered: " + ((total)*100) + "%. That's too low! Please re-enter your budget! * Must equal 100% *");
            } else {
                break;
            }
            System.out.print("Enter your food budget percentage: ");
            food = input.nextDouble();
            System.out.print("Enter your shopping budget percentage: ");
            shop = input.nextDouble();
            System.out.print("Enter your transportation budget percentage: ");
            trans = input.nextDouble();
            System.out.print("Enter your savings budget percentage: ");
            save = input.nextDouble();
            total=0;
            total= (food+shop+trans+save);
        }
        System.out.println("Thank you! You've budgeted 100%.");
        System.out.println("How much money do you pay in rent each month? (If you don't pay rent, enter 0)");
        double rent = input.nextDouble();
        double rentPercent = (rent/income);
        income -=rent;
        System.out.println("After rent, your income is: " +income+ "! This will be the amount that we will budget!");
        user = new User(firstName,lastName,userName,income);
        //Gets variables from abstract class
        Expenses foodE = new Food(food,"Variable");
        Expenses shopE =new Shopping(shop,"Variable");
        Expenses transE =new Transportation(trans, "Variable");
        Expenses saveE = new Savings(save, "Variable");
        Expenses rentE = new Rent(rentPercent, "Fixed");
        List<Expenses> expensesList = new ArrayList<>();
        expensesList.add(foodE);
        expensesList.add(shopE);
        expensesList.add(transE);
        expensesList.add(saveE);
        expensesList.add(rentE);
        user.setExpensesList(expensesList);
    }
    public static User getUser() {
        return user;
    }
}
