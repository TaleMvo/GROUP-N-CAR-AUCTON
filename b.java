import java.util.Scanner;
public class b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // VEHICLE DETAILS
        System.out.print("Enter vehicle registration number: ");
        String regNo = input.nextLine();

        System.out.print("Enter vehicle cost: ");
        int vehicleCost = input.nextInt();

        System.out.print("Enter balance left on vehicle: ");
        int balanceLeft = input.nextInt();

        //  DEPOSITS AND EXPENSES
        System.out.print("Enter total deposits made: ");
        int deposits = input.nextInt();

        System.out.print("Enter total expenses incurred: ");
        int expenses = input.nextInt();

        //  BIDDERS
        System.out.print("Enter bid from bidder 1: ");
        int bid1 = input.nextInt();

        System.out.print("Enter bid from bidder 2: ");
        int bid2 = input.nextInt();

        System.out.print("Enter bid from bidder 3: ");
        int bid3 = input.nextInt();

        //  FIND HIGHEST BID
        int highestBid = bid1;

        if (bid2 > highestBid) {
            highestBid = bid2;
        }

        if (bid3 > highestBid) {
            highestBid = bid3;
        }

        //  PROFIT OR LOSS BEFORE BALANCE
        int totalCost = vehicleCost + expenses;
        int profitOrLoss = highestBid - totalCost + deposits;

        //  PROFIT OR LOSS AFTER BALANCE
        int finalProfitOrLoss = profitOrLoss - balanceLeft;

        //  DISPLAY RESULTS
        System.out.println("\nVEHICLE DETAILS");
        System.out.println("Registration Number: " + regNo);
        System.out.println("Vehicle Cost: " + vehicleCost);
        System.out.println("Balance Left: " + balanceLeft);

        System.out.println("\nAUCTION RESULT");
        System.out.println("Highest Bid: " + highestBid);

        System.out.println("\nFINANCIAL SUMMARY");
        System.out.println("Total Deposits: " + deposits);
        System.out.println("Total Expenses: " + expenses);

        if (finalProfitOrLoss > 0) {
            System.out.println("Profit Made: " + finalProfitOrLoss);
        } else {
            System.out.println("Loss Made: " + finalProfitOrLoss);
        }
    }
    }
