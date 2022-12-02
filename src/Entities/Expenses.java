package Entities;

public abstract class Expenses {
    private double percentage;
    private String category;
    public Expenses (double percentage,String category){
        this.percentage =percentage;
        this.category = category;
    }

    public double getPercentage() {
        return percentage;
    }
    public String getCategory () {
        return category;
    }
}
