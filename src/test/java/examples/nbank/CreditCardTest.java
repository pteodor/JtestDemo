/**
 * 
 */
package examples.nbank;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for CreditCard
 *
 * @see examples.nbank.CreditCard
 * @author pteodor
 */
public class CreditCardTest {

	/**
	 * Parasoft Jtest UTA: Test for get_currentBalance()
	 *
	 * @see examples.nbank.CreditCard#get_currentBalance()
	 * @author pteodor
	 */
	@Test
	public void testGet_currentBalance() throws Throwable {
		// Given
		int balance = 0; // UTA: default value
		String id = "id"; // UTA: default value
		String securityNumber = "securityNumber"; // UTA: default value
		String name = "name"; // UTA: default value
		String zipcode = "zipcode"; // UTA: default value
		String creditCardNumber = "creditCardNumber"; // UTA: default value
		CreditCard underTest = new CreditCard(balance, id, securityNumber, name, zipcode, creditCardNumber);

		// When
		int result = underTest.get_currentBalance();

		// Then
		// assertEquals(0, result);
	}
}