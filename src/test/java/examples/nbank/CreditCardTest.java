/**
 * 
 */
package examples.nbank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;

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
		int balance = 1000; // UTA: default value
		String id = "id"; // UTA: default value
		String securityNumber = "123-45-6789"; // UTA: default value
		String name = "name"; // UTA: default value
		String zipcode = "12345"; // UTA: default value
		String creditCardNumber = "1234-5678-9012-1234"; // UTA: default value
		CreditCard underTest = new CreditCard(balance, id, securityNumber, name, zipcode, creditCardNumber);

		// When
		int result = underTest.get_currentBalance();

		// Then
		// assertEquals(0, result);
	}

	/**
	 * Parasoft Jtest UTA: Test for get_socialSecurityNumber()
	 *
	 * @see examples.nbank.CreditCard#get_socialSecurityNumber()
	 * @author pteodor
	 */
	@Test(timeout = 5000)
	public void testGet_socialSecurityNumber() throws Throwable {
		// Given
		int balance = 1000; // UTA: default value
		String id = "id"; // UTA: default value
		String securityNumber = "123-45-6789"; // UTA: default value
		String name = "name"; // UTA: default value
		String zipcode = "12345"; // UTA: default value
		String creditCardNumber = "1234-5678-9012-1234"; // UTA: default value
		CreditCard underTest = new CreditCard(balance, id, securityNumber, name, zipcode, creditCardNumber);

		// When
		String result = underTest.get_socialSecurityNumber();

	}

	/**
	 * Parasoft Jtest UTA: Test for validate(int[], String)
	 *
	 * @see examples.nbank.CreditCard#validate(int[], String)
	 * @author pteodor
	 */
	@Test(timeout = 5000)
	public void testValidate() throws Throwable {
		// When
		int[] digLengths = new int[0]; // UTA: default value
		String input = "input"; // UTA: default value
		boolean result = CreditCard.validate(digLengths, input);

		// Then - assertions for result of method validate(int[], String)
		assertFalse(result);

	}

	/**
	 * Parasoft Jtest UTA: Test for displayStatement()
	 *
	 * @see examples.nbank.CreditCard#displayStatement()
	 * @author pteodor
	 */
	@Test(timeout = 5000)
	public void testDisplayStatement() throws Throwable {
		// Given
		int balance = 1000; // UTA: default value
		String id = "id"; // UTA: default value
		String securityNumber = "123-45-6789"; // UTA: default value
		String name = "name"; // UTA: default value
		String zipcode = "12345"; // UTA: default value
		String creditCardNumber = "1234-5678-9012-1234"; // UTA: default value
		CreditCard underTest = new CreditCard(balance, id, securityNumber, name, zipcode, creditCardNumber);

		// When
		underTest.displayStatement();

	}

	/**
	 * Parasoft Jtest UTA: Test for get_creditCardNumber()
	 *
	 * @see examples.nbank.CreditCard#get_creditCardNumber()
	 * @author pteodor
	 */
	@Test(timeout = 5000)
	public void testGet_creditCardNumber() throws Throwable {
		// Given
		int balance = 1000; // UTA: default value
		String id = "id"; // UTA: default value
		String securityNumber = "123-45-6789"; // UTA: default value
		String name = "name"; // UTA: default value
		String zipcode = "12345"; // UTA: default value
		String creditCardNumber = "1234-5678-9012-1234";// UTA: default value
		CreditCard underTest = new CreditCard(balance, id, securityNumber, name, zipcode, creditCardNumber);

		// When
		String result = underTest.get_creditCardNumber();

	}

	/**
	 * Parasoft Jtest UTA: Test for set_creditCardNumber(String)
	 *
	 * @see examples.nbank.CreditCard#set_creditCardNumber(String)
	 * @author pteodor
	 */
	@Test
	public void testSet_creditCardNumber() throws Throwable {
		// Given
		int balance = 1000; // UTA: default value
		String id = "id"; // UTA: default value
		String securityNumber = "123-45-6789"; // UTA: default value
		String name = "name"; // UTA: default value
		String zipcode = "12345"; // UTA: default value
		String creditCardNumber = "1234-5678-9012-1234"; // UTA: default value
		CreditCard underTest = new CreditCard(balance, id, securityNumber, name, zipcode, creditCardNumber);

		// When
		String cardNumber = "cardNumber"; // UTA: default value
		underTest.set_creditCardNumber(cardNumber);

	}

	/**
	 * Parasoft Jtest UTA: Test for set_currentBalance(int)
	 *
	 * @see examples.nbank.CreditCard#set_currentBalance(int)
	 * @author pteodor
	 */
	@Test
	public void testSet_currentBalance() throws Throwable {
		// Given
		int balance = 1000; // UTA: default value
		String id = "id"; // UTA: default value
		String securityNumber = "123-45-6789"; // UTA: default value
		String name = "name"; // UTA: default value
		String zipcode = "12345"; // UTA: default value
		String creditCardNumber = "1234-5678-9012-1234"; // UTA: default value
		CreditCard underTest = new CreditCard(balance, id, securityNumber, name, zipcode, creditCardNumber);

		// When
		int balance2 = 0; // UTA: default value
		underTest.set_currentBalance(balance2);

	}

	/**
	 * Parasoft Jtest UTA: Test for get_customerId()
	 *
	 * @see examples.nbank.CreditCard#get_customerId()
	 * @author pteodor
	 */
	@Test
	public void testGet_customerId() throws Throwable {
		// Given
		int balance = 1000; // UTA: default value
		String id = "id"; // UTA: default value
		String securityNumber = "123-45-6789"; // UTA: default value
		String name = "name"; // UTA: default value
		String zipcode = "12345"; // UTA: default value
		String creditCardNumber = "1234-5678-9012-1234"; // UTA: default value
		CreditCard underTest = new CreditCard(balance, id, securityNumber, name, zipcode, creditCardNumber);

		// When
		String result = underTest.get_customerId();

		// Then
		// assertEquals("", result);
	}

	/**
	 * Parasoft Jtest UTA: Test for set_customerId(String)
	 *
	 * @see examples.nbank.CreditCard#set_customerId(String)
	 * @author pteodor
	 */
	@Test
	public void testSet_customerId() throws Throwable {
		// Given
		int balance = 1000; // UTA: default value
		String id = "id"; // UTA: default value
		String securityNumber = "123-45-6789"; // UTA: default value
		String name = "name"; // UTA: default value
		String zipcode = "12345"; // UTA: default value
		String creditCardNumber = "1234-5678-9012-1234"; // UTA: default value
		CreditCard underTest = new CreditCard(balance, id, securityNumber, name, zipcode, creditCardNumber);

		// When
		String id2 = "id2"; // UTA: default value
		underTest.set_customerId(id2);

	}

	/**
	 * Parasoft Jtest UTA: Test for get_customerName()
	 *
	 * @see examples.nbank.CreditCard#get_customerName()
	 * @author pteodor
	 */
	@Test
	public void testGet_customerName() throws Throwable {
		// Given
		int balance = 1000; // UTA: default value
		String id = "id"; // UTA: default value
		String securityNumber = "123-45-6789"; // UTA: default value
		String name = "name"; // UTA: default value
		String zipcode = "12345"; // UTA: default value
		String creditCardNumber = "1234-5678-9012-1234"; // UTA: default value
		CreditCard underTest = new CreditCard(balance, id, securityNumber, name, zipcode, creditCardNumber);

		// When
		String result = underTest.get_customerName();

		// Then
		// assertEquals("", result);
	}

	/**
	 * Parasoft Jtest UTA: Test for set_customerName(String)
	 *
	 * @see examples.nbank.CreditCard#set_customerName(String)
	 * @author pteodor
	 */
	@Test
	public void testSet_customerName() throws Throwable {
		// Given
		int balance = 1000; // UTA: default value
		String id = "id"; // UTA: default value
		String securityNumber = "123-45-6789"; // UTA: default value
		String name = "name"; // UTA: default value
		String zipcode = "12345"; // UTA: default value
		String creditCardNumber = "1234-5678-9012-1234"; // UTA: default value
		CreditCard underTest = new CreditCard(balance, id, securityNumber, name, zipcode, creditCardNumber);

		// When
		String name2 = "name2"; // UTA: default value
		underTest.set_customerName(name2);

	}

	/**
	 * Parasoft Jtest UTA: Test for set_socialSecurityNumber(String)
	 *
	 * @see examples.nbank.CreditCard#set_socialSecurityNumber(String)
	 * @author pteodor
	 */
	@Test
	public void testSet_socialSecurityNumber() throws Throwable {
		// Given
		int balance = 1000; // UTA: default value
		String id = "id"; // UTA: default value
		String securityNumber = "123-45-6789"; // UTA: default value
		String name = "name"; // UTA: default value
		String zipcode = "12345"; // UTA: default value
		String creditCardNumber = "1234-5678-9012-1234"; // UTA: default value
		CreditCard underTest = new CreditCard(balance, id, securityNumber, name, zipcode, creditCardNumber);

		// When
		String securityNumber2 = "securityNumber2"; // UTA: default value
		underTest.set_socialSecurityNumber(securityNumber2);

	}

	/**
	 * Parasoft Jtest UTA: Test for get_zipcode()
	 *
	 * @see examples.nbank.CreditCard#get_zipcode()
	 * @author pteodor
	 */
	@Test
	public void testGet_zipcode() throws Throwable {
		// Given
		int balance = 1000; // UTA: default value
		String id = "id"; // UTA: default value
		String securityNumber = "123-45-6789"; // UTA: default value
		String name = "name"; // UTA: default value
		String zipcode = "12345"; // UTA: default value
		String creditCardNumber = "1234-5678-9012-1234"; // UTA: default value
		CreditCard underTest = new CreditCard(balance, id, securityNumber, name, zipcode, creditCardNumber);

		// When
		String result = underTest.get_zipcode();

		// Then
		// assertEquals("", result);
	}

	/**
	 * Parasoft Jtest UTA: Test for set_zipcode(String)
	 *
	 * @see examples.nbank.CreditCard#set_zipcode(String)
	 * @author pteodor
	 */
	@Test
	public void testSet_zipcode() throws Throwable {
		// Given
		int balance = 1000; // UTA: default value
		String id = "id"; // UTA: default value
		String securityNumber = "123-45-6789"; // UTA: default value
		String name = "name"; // UTA: default value
		String zipcode = "12345"; // UTA: default value
		String creditCardNumber = "1234-5678-9012-1234"; // UTA: default value
		CreditCard underTest = new CreditCard(balance, id, securityNumber, name, zipcode, creditCardNumber);

		// When
		String _zipcode = "_zipcode"; // UTA: default value
		underTest.set_zipcode(_zipcode);

	}

	/**
	 * Parasoft Jtest UTA: Test for makePayment(Account)
	 *
	 * @see examples.nbank.CreditCard#makePayment(Account)
	 * @author pteodor
	 */
	@Test
	public void testMakePayment() throws Throwable {
		// Given
		int balance = 1000; // UTA: default value
		String id = "123-45-6789"; // UTA: default value
		String securityNumber = "123-45-6789"; // UTA: default value
		String name = "name"; // UTA: default value
		String zipcode = "12345"; // UTA: default value
		String creditCardNumber = "1234-5678-9012-1234"; // UTA: default value
		CreditCard underTest = new CreditCard(balance, id, securityNumber, name, zipcode, creditCardNumber);

		// When

		Customer customer = new Customer(name, securityNumber);
		int initial_balance = 100; // UTA: default value
		Account account = new Account(customer, initial_balance);
		underTest.makePayment(account);

	}

}