import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);

      double lumberCost = 8, windowCost = 11;
      double salesTax;
      double total, grandTotal;
      int boards, windows;

      System.out.println("Enter the sales tax rate:");
      salesTax = sc.nextDouble();

      System.out.println("How many boards do you need?");
      boards = sc.nextInt();

      System.out.println("How many windows do you need?");
      windows = sc.nextInt();

      Construction construction = new Construction(lumberCost, windowCost, salesTax);

      total = construction.lumberCost(boards) + construction.windowCost(windows);
      System.out.println("Total: " + total);

      grandTotal = construction.grandTotal(total);
      System.out.print("Grand Total: " + grandTotal);
    }
}
