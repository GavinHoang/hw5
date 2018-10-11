package quiz2;

/**
A line item in an invoice.
*/
public interface LineItem
{
/**
   Gets the price of this line item.
   @return the price
*/
double getPrice();
int getCount();
void setCount();
/**
   Gets the description of this line item.
   @return the description
*/   
String toString();
}
