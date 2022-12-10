package Entities;

import java.util.List;
public class User {
    private String firstName;
    private String lastName;
    private String userName;
    private double income;
    private List <Expenses> expensesList;
    public User (String firstName, String lastName,String userName, double income){
        this.firstName = firstName;
        this.lastName= lastName;
        this.userName = userName;
        this.income=income;
    }
    public String getFistName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getUserName (){
        return userName;
}
    public double getIncome() {
        return income;
    }
    public void setExpensesList (List<Expenses> expensesList){
        this.expensesList =expensesList;
    }
    public List<Expenses> getExpensesList (){
        return expensesList;
    }
    public String toString (){
        return getFistName()+ " " + getLastName() + "\n" + "User name: " + getUserName() + "\nAvailable to budget: $" + getIncome();
    }
}
