import java.util.Scanner;
public class TipCalculator {
    public static void main(String [] args) {
        // welcome screen
    Scanner scan = new Scanner (System.in);
    System.out.println("Hello, welcome to the tip calculator!");

        // user imputed variables
        System.out.println("Please input the bill (only numbers)");
        double bill = scan.nextDouble();
        scan.nextLine();
        System.out.println();
        System.out.println("Please input the number of people in the party.");
        int numPeople = scan.nextInt();
        System.out.println();
        System.out.println("Please input the percent you want to tip (only whole numbers)");
        double tipPercentage = scan.nextInt();
        System.out.println();


        // calculation variables initialized and declared
      double   tipPayed =  tipPercentage/100 * bill;
      double  totalBill = bill + tipPayed;
      double tipPerPerson = tipPayed/(double)numPeople;
      double  totalPerPerson = totalBill/(double)numPeople;

      // calculation print statements
        System.out.printf("The total tip is: " + "%.2f", tipPayed);
        System.out.println();
        System.out.printf("The tip per person is: " + "%.2f", tipPerPerson);
        System.out.println();
        System.out.printf("The total bill including the tip is: " + "%.2f", totalBill);
        System.out.println();
        System.out.printf("The total per person (including tip and bill) is: " + "%.2f", totalPerPerson);
        System.out.println();
// exit screen
System.out.println("Thank you for using the tip calculator, see you next time!");

    }
}
