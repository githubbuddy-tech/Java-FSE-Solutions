package DeepSkilling.DataStructures.FinancialForecasting;

import java.util.*;
public class FinancialForecasting {
    public static double futureValue(double present,double growthRate,int years){
        if(years==0){
            return present;
        }
        return futureValue(present, growthRate, years-1)*(1+growthRate);       
    }
    public static double futureValueWithoutRecursion(double present,double growthRate,int years){
        double futureValue = present * Math.pow((1+growthRate), years);
        return futureValue;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the present value:");
        double present = sc.nextDouble();
        System.out.println("Enter the growth rate: ");
        double growthRate = sc.nextDouble();
        System.out.println("Enter the years: ");
        int years = sc.nextInt();
        double result1 = futureValue(present, growthRate, years);
        System.out.printf("Future values : %.2f",result1);
        double result2 = futureValueWithoutRecursion(present,growthRate,years);
        System.out.printf("\nFuture values without Recursion : %.2f",result2);
        sc.close();
    }
}