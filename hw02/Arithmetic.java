//Joshua Whitton
//CSE2
//Jan 30th 2015
//
//The purpose of this program is to compute costs of items including sales tax.
public class Arithmetic //the class of the program
{
    public static void main(String[] args) //the main method for the program
    {
        //the amount of each object being bought
        int nSocks = 3; //pairs of socks
        int nGlasses = 6; //drinking glasses
        int nEnvelopes = 1; //envelopes
        
        //costs for each item
        double sockCost$ = 2.58;
        double glassCost$ = 2.29;
        double envelopeCost$ = 3.25;
        
        double taxPercent = 0.06; //The tax percentage applied to purchases.
        
        double totalSockCost$ = nSocks * sockCost$; //untaxed price
        double sockTax$ = totalSockCost$ * taxPercent; //the taxes on the item
        sockTax$ = Math.round(sockTax$*100.0)/100.0; //sets the value to only go 2 decimal places
        double taxedSockCost$ = totalSockCost$ + sockTax$; //the total cost including tax
        
        //sames as above but with drinking glasses
        double totalGlassCost$ = nGlasses * glassCost$;
        double glassTax$ = totalGlassCost$ * taxPercent;
        glassTax$ = Math.round(glassTax$*100.0)/100.0;
        double taxedGlassCost$ = totalGlassCost$ + glassTax$;
        
        //same as above but with envelopes
        double totalEnvelopeCost$ = nEnvelopes * envelopeCost$;
        double envelopeTax$ = totalEnvelopeCost$ * taxPercent;
        envelopeTax$ = Math.round(envelopeTax$*100.0)/100.0;
        double taxedEnvelopeCost$ = totalEnvelopeCost$ + envelopeTax$;
        
        double totalCost$ = totalEnvelopeCost$ + totalGlassCost$ + totalSockCost$; //the total cost of the items added together
        totalCost$ = Math.round(totalCost$*100.0)/100.0;
        double totalTaxes$ = sockTax$ + envelopeTax$ + glassTax$; //the total sales taxes on all the items
        double taxedCost$ = taxedEnvelopeCost$ + taxedGlassCost$ + taxedSockCost$;  //the total price after taxes are applied
       
                
        //the variables and information calculated are printed.
        System.out.println(" ");
        
        //prints the information on the socks
        System.out.println("Item: Socks"); //displays the item
        System.out.println("Amount: " + nSocks);  //prints how many are being purchased
        System.out.println("Cost per item: " + sockCost$);  //prints cost per item
        System.out.println("Cost of items: " + totalSockCost$); //prints cost total (without tax)
        System.out.println("Sales tax on items: " + sockTax$); //prints the sales tax on these items
        
        System.out.println(" "); //sets a little space inbetween items
        
        //prints info on drinking glasses, same as above but with drinking glasses.
        System.out.println("Item: Drinking glasses");
        System.out.println("Amount: " + nGlasses);
        System.out.println("Cost per item: " + glassCost$);
        System.out.println("Cost of items: " + totalGlassCost$);
        System.out.println("Sales tax on items: " + glassTax$);
        
        System.out.println(" ");
        
        //prints info on envelopes, same as above but with envelopes
        System.out.println("Item: Envelopes");
        System.out.println("Amount: " + nEnvelopes);
        System.out.println("Cost per item: " + envelopeCost$);
        System.out.println("Cost of items: " + totalEnvelopeCost$);
        System.out.println("Sales tax on items: " + envelopeTax$);
        
        System.out.println(" ");
        
        //prints totals
        System.out.println("Total cost (before taxes): " + totalCost$); //displays the total cost without tax
        System.out.println("Total tax costs: " + totalTaxes$); //displays how much tax is being applied
        System.out.println("Total cost (with taxes): " + taxedCost$);  //price with tax included.
    }
}