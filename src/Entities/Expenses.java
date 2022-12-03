package Entities;
public abstract class Expenses {
    private double percentage;
    public Expenses (double percentage){
        this.percentage =percentage;
    }
    public double getPercentage() {
        return percentage;
    }
}
