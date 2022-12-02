package View;

public class PointRewards {
    static double totalLeftover;
    static double income;
    public PointRewards (double income,double totalLeftover){
        this.income=income;
        this.totalLeftover=totalLeftover;
    }
    public static void PointRewards() {
        if (totalLeftover > 0.0 && totalLeftover < 30.0){
            System.out.println("Congrats! You've earned 10 savings points!");}
        if (totalLeftover > 30.0 && totalLeftover < 60.0){
            System.out.println("Congrats! You've earned 20 savings points!");}
        if (totalLeftover > 60.0 && totalLeftover < 90.0){
            System.out.println("Congrats! You've earned 30 savings points!");}
        if (totalLeftover > 90.0 && totalLeftover < 120.0){
            System.out.println("Congrats! You've earned 40 savings points!");}
        if (totalLeftover > 120.0 && totalLeftover < 180.0){
            System.out.println("Congrats! You've earned 50 savings points!");}
        if (totalLeftover > 180.0 && totalLeftover < 240.0){
            System.out.println("Congrats! You've earned 60 savings points!");}
        if (totalLeftover > 240.0 && totalLeftover < 300.0){
            System.out.println("Congrats! You've earned 70 savings points!");}
        if (totalLeftover > 300.0 && totalLeftover < 360.0){
            System.out.println("Congrats! You've earned 80 savings points!");}
        if (totalLeftover > 360.0 && totalLeftover < 420.0){
            System.out.println("Congrats! You've earned 90 savings points!");}
        if (totalLeftover > 420.0 && totalLeftover < 500){
            System.out.println("Congrats! You've earned 100 savings points!");}
        if (totalLeftover > 500.0 && totalLeftover < 700.0){
            System.out.println("Congrats! You've earned 150 savings points!");}
        if (totalLeftover > 700.0 && totalLeftover < 1000.0){
            System.out.println("Congrats! You've earned 200 savings points!");}
        if (totalLeftover > 1000.0 && totalLeftover < income){
            System.out.println("Congrats! You've earned 500 savings points!");}
        else if (totalLeftover == 0.0){
            System.out.println("You've earned 0 points");}
    }
}
