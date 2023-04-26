/**
 * 
 */
package examples.nbank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.nullable;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for Account
 *
 * @see examples.nbank.Account
 * @author pteodor
 */
public class AccountTest {

	/**
	 * Parasoft Jtest UTA: Test for setBalance(int)
	 *
	 * @see examples.nbank.Account#setBalance(int)
	 * @author pteodor
	 */
	@Test(timeout = 5000)
	public void testSetBalance() throws Throwable {
		// Given
		Customer customer = mock(Customer.class);
		int initial_balance = 0; // UTA: provided value
		Account underTest = new Account(customer, initial_balance);

		// When
		int balance = 1000; // UTA: provided value
		underTest.setBalance(balance);

		// Then - assertions for this instance of Account
		assertNotNull(underTest.getCustomer());
		assertNull(underTest.getCustomer().toStrng());
		assertNull(underTest.getCustomer().getSSN());
		assertEquals(1000, underTest.getBalance());
		assertEquals("silver", underTest.getStatus());

	}

	/**
	 * Parasoft Jtest UTA: Test for getCustomer()
	 *
	 * @see examples.nbank.Account#getCustomer()
	 * @author pteodor
	 */
	@Test
	public void testGetCustomer() throws Throwable {
		// Given
		Customer customer = null; // UTA: default value
		int initial_balance = 0; // UTA: default value
		Account underTest = new Account(customer, initial_balance);

		// When
		Customer result = underTest.getCustomer();

		// Then
		// assertNotNull(result);
	}

	/**
	 * Parasoft Jtest UTA: Test for getBalance()
	 *
	 * @see examples.nbank.Account#getBalance()
	 * @author pteodor
	 */
	@Test
	public void testGetBalance() throws Throwable {
		// Given
		Customer customer = null; // UTA: default value
		int initial_balance = 0; // UTA: default value
		Account underTest = new Account(customer, initial_balance);

		// When
		int result = underTest.getBalance();

		// Then
		// assertEquals(0, result);
	}

	/**
	 * Parasoft Jtest UTA: Test for getStatus()
	 *
	 * @see examples.nbank.Account#getStatus()
	 * @author pteodor
	 */
	@Test
	public void testGetStatus() throws Throwable {
		// Given
		Customer customer = null; // UTA: default value
		int initial_balance = 0; // UTA: default value
		Account underTest = new Account(customer, initial_balance);

		// When
		String result = underTest.getStatus();

		// Then
		// assertEquals("", result);
	}

	/**
	 * Parasoft Jtest UTA: Test for setBalance(int)
	 *
	 * @see examples.nbank.Account#setBalance(int)
	 * @author pteodor
	 */
	@Test
	public void testSetBalance2() throws Throwable {
		// Given
		Customer customer = null; // UTA: default value
		int initial_balance = 0; // UTA: default value
		Account underTest = new Account(customer, initial_balance);

		// When
		int balance = 0; // UTA: default value
		underTest.setBalance(balance);

	}

	/**
	 * Parasoft Jtest UTA: Test for isOverdrawn(int)
	 *
	 * @see examples.nbank.Account#isOverdrawn(int)
	 * @author pteodor
	 */
	@Test
	public void testIsOverdrawn() throws Throwable {
		// Given
		Customer customer = null; // UTA: default value
		int initial_balance = 0; // UTA: default value
		Account underTest = new Account(customer, initial_balance);

		// When
		int balance = 0; // UTA: default value
		boolean result = underTest.isOverdrawn(balance);

		// Then
		// assertFalse(result);
	}

	/**
	 * Parasoft Jtest UTA: Test for apply(ITransaction)
	 *
	 * @see examples.nbank.Account#apply(ITransaction)
	 * @author pteodor
	 */
	@Test
	public void testApply() throws Throwable {
		// Given
		Customer customer = mock(Customer.class);
		int initial_balance = 0; // UTA: default value
		Account underTest = new Account(customer, initial_balance);

		// When
		ITransaction transaction = mockITransaction();
		underTest.apply(transaction);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of ITransaction
	 */
	private static ITransaction mockITransaction() throws Throwable {
		ITransaction transaction = mock(ITransaction.class);
		boolean applyResult = false; // UTA: default value
		when(transaction.apply(nullable(Account.class))).thenReturn(applyResult);

		int feeResult = 0; // UTA: default value
		when(transaction.fee()).thenReturn(feeResult);
		return transaction;
	}
}