import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CustomerTest {
	Pizza p1,p2;
	Customer c1;
	
	@Before
	public void setUp() throws Exception {
		p1 = new Pizza ("Margherita","Veg",200,1);
		p2 = new Pizza ("Chicken Fiesta","Non Veg",250,2);
		c1 = new Customer("andrew");
		c1.addPizza(new NewPizza(p1));
		c1.addPizza(new NewPizza(p2));
		System.out.println(c1.bill());
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
	}

}
