import java.util.Scanner;

public class FinancialForecast{
    public static double forecastRecursive(double presentValue,double rate,int periods){
        if(periods==0){
            return presentValue;
        }
        return forecastRecursive(presentValue,rate,periods-1)*(1+rate);
    }
    public static double forecastIterative(double presentValue,double rate,int periods){
        double futureValue=presentValue;
        for(int i=1;i<=periods;i++){
            futureValue*=(1+rate);
        }
        return futureValue;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("6429486 - Akshaya V");
        System.out.print("Enter present value(Rs): ");
        double presentValue=sc.nextDouble();
        System.out.print("Enter annual growth rate(in %): ");
        double ratePercent=sc.nextDouble();
        double rate=ratePercent/100.0;
        System.out.print("Enter number of years to forecast: ");
        int years=sc.nextInt();
        double resultRecursive=forecastRecursive(presentValue,rate,years);
        double resultIterative=forecastIterative(presentValue,rate,years);
        System.out.printf("\nFuture Value (Recursive): Rs %.2f\n",resultRecursive);
        System.out.printf("Future Value (Iterative - Optimized): Rs %.2f\n",resultIterative);
    }
}
