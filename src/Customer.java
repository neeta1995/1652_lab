

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;






public class Customer {
	
	String cust_name;
	ArrayList<NewPizza>_pizza = new ArrayList<NewPizza>();
	
	public Customer (String name)
	{
		cust_name = name;
	};
	
	 public void addPizza(NewPizza arg) {
	     _pizza.add(arg);
	   }
	
	 public String getName ()
	 {
		 return cust_name;
	 };
	 
	 public String bill()
	 {
		 double totalAmount = 0;
		 double gst = 0.08;
		 double gst_amt;
		 double fin_amt;
		 Enumeration<NewPizza> pizzas = Collections.enumeration(_pizza);
		 String result = "Final bill for customer : " + getName() + "\n";
		
		 while(pizzas.hasMoreElements())
		 {
			 double thisAmount = 0;
			 NewPizza each = (NewPizza) pizzas.nextElement();
			 thisAmount = each.getPizza().getPizza_amt() * each.getPizza().getQuantity();
			 result += "\t" + each.getPizza().getPizza_name()+ "\t" + each.getPizza().getPizza_type() + "\t" + each.getPizza().getPizza_amt() + "\t" + each.getPizza().getQuantity() + "\t" + 
					 String.valueOf(thisAmount) + "\n";
			  totalAmount += thisAmount;	 
		 }
		 result +=  "Total Amount :" + String.valueOf(totalAmount) + "\n";
		 System.out.println("GST is 8 % of total amount");
		 gst_amt = totalAmount * gst;
		 System.out.println("GST = "+ gst_amt);
		 fin_amt = totalAmount + gst_amt;
		 result +=  "Final Amount :" + String.valueOf(fin_amt) + "\n";
		 return result;
	 }
	  
}
