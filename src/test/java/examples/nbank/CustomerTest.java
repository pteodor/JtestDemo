/**
 * 
 */
package examples.nbank;

import static org.mockito.Mockito.mock;

import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for Customer
 *
 * @see examples.nbank.Customer
 * @author pteodor
 */
public class CustomerTest {

	/**
	 * Parasoft Jtest UTA: Test for equals(Object)
	 *
	 * @see examples.nbank.Customer#equals(Object)
	 * @author pteodor
	 */
	@Test(timeout = 5000)
	public void testEquals() throws Throwable {
		// Given
		String name = "*******************"; // UTA: provided value
		String ssn = "ssn"; // UTA: provided value
		Customer underTest = new Customer(name, ssn);

		// When
		Object o = null; // UTA: provided value
		boolean result = underTest.equals(o);

	}

	/**
	 * Parasoft Jtest UTA: Test for main(String[])
	 *
	 * @see examples.nbank.Customer#main(String[])
	 * @author pteodor
	 */
	@Test(timeout = 5000)
	public void testMain() throws Throwable {
		// When
		String[] args = new java.lang.String[0]; // UTA: default value
		Customer.main(args);

	}

}