

public class CoffeeShop {

    public static void main(String[] args) {
        int pricePerCoffee = 250; // tetri
        int numCoffeeSold = 100;
        int totalCostOfBeans = 15000; // tetri
        int totalExpenses;

        // TODO 1
        // include all the expences that are provided in the expences.txt file
        int tax = 8000;
        int water = 89;
        int gas = 162;
        int electricity = 19300; // eveything is in tetri
        int parking = 5600;

        double otherExpenses = tax + water + gas + electricity + parking;
        double profit = calculateProfit(pricePerCoffee, numCoffeeSold, totalCostOfBeans, otherExpenses);
        System.out.println(profit);
    }

    public static double calculateProfit(int pricePerCoffee, int numCoffeeSold, int totalCostOfBeans, double otherExpenses) {

    	double profitInLaris = 0;
        // TODO 2
        // Finish this function
    	for(int i = 0; i < numCoffeeSold; i++) {
    		profitInLaris += pricePerCoffee;
    	}
    	profitInLaris -= (totalCostOfBeans + otherExpenses);
    	
    	profitInLaris /= 100;
        return profitInLaris;
    }
}
