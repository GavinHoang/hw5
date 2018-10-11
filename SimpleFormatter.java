package quiz2;

/**
A simple invoice formatter.
*/
public class SimpleFormatter implements InvoiceFormatter
{
public String formatHeader()
{
   total = 0;
   return "     I N V O I C E\n\n\n";
}

public String formatLineItem(LineItem item)
{
   total +=  item.getPrice() * item.getCount();  //
   String temp = (String.format(
	         "%s: $%.2f      ",item.toString(),item.getPrice()));
  
  return temp + "Quantity: " + item.getCount() + "\n";
 
}

public String formatFooter()
{
   return (String.format("\n\nTOTAL DUE: $%.2f\n", total));
}

private double total;
}

