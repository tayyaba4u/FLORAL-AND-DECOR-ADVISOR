 import java.util.Scanner;
public class FloristandDecor
{
public double florist, decor;
public FloristandDecor ()
{
Scanner sc = new Scanner(System.in);
 System.out.println("Enter total budget for the flowers");
 florist= sc.nextDouble();
 System.out.println("Enter total budget for the decor ");
 decor = sc.nextDouble();
}
public FloristandDecor(double F,double D )
{
florist= F;
decor= D;
}
public double CalculateFloralBudget ()
{
return ((florist+decor)); 
}   
//after taking total budgeet from the user add both of them and show recommendations.
public double RecommendedFloristsandDecors ()
{
if (florist+decor <= 60000)
 {
System.out.println("  The  Flowers Studio ");
 }
if (florist+decor >=61000)
{
System.out.println("Anum Khan");
}
else {
   System.out.println ("Fatima Tahir");
}         
return florist;
}

}



    
