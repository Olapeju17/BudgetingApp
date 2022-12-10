package View;
import java.util.Scanner;
public class ActualSpending {
    static String[][] table;static double foodActual;static double shopActual;static double transActual;static double savingActual;
    static  double leftOverFood;static double leftOverShop;static double foodValue;static double shopValue;static double transValue;
    static double saveValue;static double income;static double leftOverSaving;static double totalLeftover;static double leftOverTrans;
//setting necessary values
    public ActualSpending(double income,double foodValue, double shopValue, double transValue, double saveValue){
        this.income =income;
        this.foodValue =foodValue;
        this.shopValue =shopValue;
        this.transValue =transValue;
        this.saveValue =saveValue;
    }
    public static void actualSpending(){
        System.out.println("Please input how much you spent in food this month: ");
        Scanner input = new Scanner(System.in);
        foodActual = input.nextDouble();
        System.out.println("Please input how much you spent in shopping this month:");
        shopActual = input.nextDouble();
        System.out.println("Please input how much you spent in transportation this month: ");
        transActual = input.nextDouble();
        System.out.println("Please input how much money you've put towards savings this month:");
        savingActual = input.nextDouble();
        //Subtracting the Original budget by the money that was spent to get the remainder
        leftOverFood = ((foodValue * income)/100)- foodActual;
        leftOverShop = ((shopValue * income)/100) - shopActual;
        leftOverTrans = ((transValue *income)/100) -transActual;
        leftOverSaving = ((saveValue * income)/100) - savingActual;
        totalLeftover =(leftOverFood + leftOverSaving+leftOverTrans+leftOverShop);
    }
    //multidimensional array prints out the budget assessment
    public static void displaySpending(){
        table = new String[5][4];
        table[0][0] = "Category"; table[0][1] = "Budget"; table[0][2]= "Spent"; table[0][3]= "Remainder";
        table[1][0] = "Food |     "; table[1][1]=("$"+((foodValue * income)/100)+ " | "); table[1][2]= ("$"+(foodActual)+ " | "); table[1][3]= ("$"+(leftOverFood)+ " | ");
        table[2][0] = "Shopping | "; table[2][1]=("$"+((shopValue * income)/100)+ " | "); table[2][2]= ("$"+(shopActual)+ " | "); table[2][3]= ("$"+(leftOverShop)+ " | ");
        table[3][0] ="Transport | "; table[3][1]=("$"+((transValue *income)/100)+ " | "); table[3][2]= ("$"+(transActual)+ " | "); table[3][3]= ("$"+(leftOverTrans)+ " | ");
        table[4][0] ="Savings | "; table[4][1]=("$"+((saveValue * income)/100)+ " | "); table[4][2]= ("$"+(savingActual)+ " | "); table[4][3]= ("$"+(leftOverSaving)+ " | ");
        System.out.print(table[0][0] + " | " + table[0][1]+ " | " + table[0][2] + " | " + table[0][3]+ " | ");
        for (int r = 1; r < 5; r++) {
            System.out.print("\n");
            System.out.println("-----------------------------------");
            for (int c =0; c<4; c++) {
                System.out.print(table[r][c]);
            }
        }
        System.out.println("\n" + "-----------------------------------");
    }

    //encapsulation
    public double getTotalLeftover (){
        return totalLeftover;
    }
    public static double getSavingActual() {
        return savingActual;
    }
}
