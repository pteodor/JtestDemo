/**
 * 
 */
package examples.nbank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.nullable;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.lang.reflect.Field;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for Account
 *
 * @see examples.nbank.Account
 * @author pteodor
 */
public class AccountTest {

	/**
	 * Parasoft Jtest UTA: Test for apply(ITransaction)
	 *
	 * @see examples.nbank.Account#apply(ITransaction)
	 * @author pteodor
	 */
	@Test(timeout = 5000)
	public void testApply() throws Throwable {
		// Given
		Customer customer = mock(Customer.class);
		int initial_balance = 0; // UTA: provided value
		Account underTest = new Account(customer, initial_balance);

		// When
		ITransaction transaction = mockITransaction();
		underTest.apply(transaction);

		// Then - assertions for this instance of Account
		assertNotNull(underTest.getCustomer());
		assertEquals(0, underTest.getBalance());
		assertEquals("silver", underTest.getStatus());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of ITransaction
	 */
	private static ITransaction mockITransaction() throws Throwable {
		ITransaction transaction = mock(ITransaction.class);
		boolean applyResult = false; // UTA: provided value
		when(transaction.apply(nullable(Account.class))).thenReturn(applyResult);
		return transaction;
	}

	/**
	 * Parasoft Jtest UTA: Test for apply(ITransaction)
	 *
	 * @see examples.nbank.Account#apply(ITransaction)
	 * @author pteodor
	 */
	@Test(timeout = 5000)
	public void testApply2() throws Throwable {
		// Given
		Customer customer = mock(Customer.class);
		int initial_balance = 0; // UTA: provided value
		Account underTest = new Account(customer, initial_balance);

		// When
		ITransaction transaction = mockITransaction2();
		underTest.apply(transaction);

		// Then - assertions for this instance of Account
		assertNotNull(underTest.getCustomer());
		assertEquals(0, underTest.getBalance());
		assertEquals("silver", underTest.getStatus());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of ITransaction
	 */
	private static ITransaction mockITransaction2() throws Throwable {
		ITransaction transaction = mock(ITransaction.class);
		boolean applyResult = true; // UTA: provided value
		when(transaction.apply(nullable(Account.class))).thenReturn(applyResult);
		return transaction;
	}

	/**
	 * Parasoft Jtest UTA: Test for getBalance()
	 *
	 * @see examples.nbank.Account#getBalance()
	 * @author pteodor
	 */
	@Test(timeout = 5000)
	public void testGetBalance() throws Throwable {
		// Given
		Customer customer = mock(Customer.class);
		int initial_balance = 0; // UTA: provided value
		Account underTest = new Account(customer, initial_balance);

		// When
		int result = underTest.getBalance();

		// Then - assertions for result of method getBalance()
		assertEquals(0, result);

		// Then - assertions for this instance of Account
		assertNotNull(underTest.getCustomer());
		assertEquals("silver", underTest.getStatus());

	}

	/**
	 * Parasoft Jtest UTA: Test for getCustomer()
	 *
	 * @see examples.nbank.Account#getCustomer()
	 * @author pteodor
	 */
	@Test(timeout = 5000)
	public void testGetCustomer() throws Throwable {
		// Given
		Customer customer = mock(Customer.class);
		int initial_balance = 0; // UTA: provided value
		Account underTest = new Account(customer, initial_balance);

		// When
		Customer result = underTest.getCustomer();

		// Then - assertions for result of method getCustomer()
		assertNotNull(result);

		// Then - assertions for this instance of Account
		assertEquals(0, underTest.getBalance());
		assertEquals("silver", underTest.getStatus());

	}

	/**
	 * Parasoft Jtest UTA: Test for getID()
	 *
	 * @see examples.nbank.Account#getID()
	 * @author pteodor
	 */
	@Test(timeout = 5000)
	public void testGetID() throws Throwable {
		// Given
		Customer customer = mock(Customer.class);
		int initial_balance = 0; // UTA: provided value
		Account underTest = new Account(customer, initial_balance);

		// When
		String result = underTest.getID();

		// Then - assertions for result of method getID()
		assertNull(result);

		// Then - assertions for this instance of Account
		assertNotNull(underTest.getCustomer());
		assertEquals(0, underTest.getBalance());
		assertEquals("silver", underTest.getStatus());

	}

	/**
	 * Parasoft Jtest UTA: Test for getStatus()
	 *
	 * @see examples.nbank.Account#getStatus()
	 * @author pteodor
	 */
	@Test(timeout = 5000)
	public void testGetStatus() throws Throwable {
		// Given
		Customer customer = mock(Customer.class);
		int initial_balance = 0; // UTA: provided value
		Account underTest = new Account(customer, initial_balance);

		// When
		String result = underTest.getStatus();

		// Then - assertions for result of method getStatus()
		assertEquals("silver", result);

		// Then - assertions for this instance of Account
		assertNotNull(underTest.getCustomer());
		assertEquals(0, underTest.getBalance());

	}

	/**
	 * Parasoft Jtest UTA: Test for isOverdrawn(int)
	 *
	 * @see examples.nbank.Account#isOverdrawn(int)
	 * @author pteodor
	 */
	@Test(timeout = 5000)
	public void testIsOverdrawn() throws Throwable {
		// Given
		Customer customer = mock(Customer.class);
		int initial_balance = 0; // UTA: provided value
		Account underTest = new Account(customer, initial_balance);

		// When
		int balance = 1; // UTA: provided value
		boolean result = underTest.isOverdrawn(balance);

		// Then - assertions for result of method isOverdrawn(int)
		assertFalse(result);

		// Then - assertions for this instance of Account
		assertNotNull(underTest.getCustomer());
		assertEquals(0, underTest.getBalance());
		assertEquals("silver", underTest.getStatus());

	}

	/**
	 * Parasoft Jtest UTA: Test for isOverdrawn(int)
	 *
	 * @see examples.nbank.Account#isOverdrawn(int)
	 * @author pteodor
	 */
	@Test(timeout = 5000)
	public void testIsOverdrawn2() throws Throwable {
		// Given
		Customer customer = mockCustomer();
		int initial_balance = 0; // UTA: provided value
		Account underTest = new Account(customer, initial_balance);
		String _accountStatusValue = "_accountStatusValue"; // UTA: default value
		setPrivateField(underTest, Account.class, "_accountStatus", _accountStatusValue);

		// When
		int balance = -500; // UTA: provided value
		boolean result = underTest.isOverdrawn(balance);

		// Then - assertions for result of method isOverdrawn(int)
		assertTrue(result);

		// Then - assertions for this instance of Account
		assertNotNull(underTest.getCustomer());
		assertEquals(0, underTest.getBalance());
		assertEquals("_accountStatusValue", underTest.getStatus());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Customer
	 */
	private static Customer mockCustomer() throws Throwable {
		Customer customer = mock(Customer.class);
		String getNameResult = "getNameResult"; // UTA: default value
		when(customer.getName()).thenReturn(getNameResult);

		String getSSNResult = "getSSNResult"; // UTA: default value
		when(customer.getSSN()).thenReturn(getSSNResult);
		return customer;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to set private field _accountStatus
	 */
	private static <T> void setPrivateField(Object object, Class<?> fieldClass, String fieldName, T value) {
		try {
			Field field = fieldClass.getDeclaredField(fieldName);
			field.setAccessible(true);
			field.set(object, value);
		} catch (NoSuchFieldException e) {
			throw (AssertionError) new AssertionError("No such field found").initCause(e);
		} catch (IllegalAccessException e) {
			throw (AssertionError) new AssertionError("Unable to access the specified private field").initCause(e);
		} catch (SecurityException e) {
			throw (AssertionError) new AssertionError(
					"There was a security exception when attempting to access a private field").initCause(e);
		}
	}

	/**
	 * Parasoft Jtest UTA: Test for isOverdrawn(int)
	 *
	 * @see examples.nbank.Account#isOverdrawn(int)
	 * @author pteodor
	 */
	@Test(timeout = 5000)
	public void testIsOverdrawn3() throws Throwable {
		// Given
		Customer customer = mockCustomer2();
		int initial_balance = 0; // UTA: provided value
		Account underTest = new Account(customer, initial_balance);
		String _accountStatusValue = "_accountStatusValue"; // UTA: default value
		setPrivateField(underTest, Account.class, "_accountStatus", _accountStatusValue);

		// When
		int balance = -1; // UTA: provided value
		boolean result = underTest.isOverdrawn(balance);

		// Then - assertions for result of method isOverdrawn(int)
		assertTrue(result);

		// Then - assertions for this instance of Account
		assertNotNull(underTest.getCustomer());
		assertEquals(0, underTest.getBalance());
		assertEquals("_accountStatusValue", underTest.getStatus());

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Customer
	 */
	private static Customer mockCustomer2() throws Throwable {
		Customer customer = mock(Customer.class);
		String getNameResult = "getNameResult"; // UTA: default value
		when(customer.getName()).thenReturn(getNameResult);

		String getSSNResult = "getSSNResult"; // UTA: default value
		when(customer.getSSN()).thenReturn(getSSNResult);
		return customer;
	}

	/**
	 * Parasoft Jtest UTA: Test for reportToCreditAgency(ICreditAgency)
	 *
	 * @see examples.nbank.Account#reportToCreditAgency(ICreditAgency)
	 * @author pteodor
	 */
	@Test(timeout = 5000)
	public void testReportToCreditAgency() throws Throwable {
		// Given
		Customer customer = mock(Customer.class);
		int initial_balance = 0; // UTA: provided value
		Account underTest = new Account(customer, initial_balance);

		// When
		ICreditAgency agency = mock(ICreditAgency.class);
		boolean result = underTest.reportToCreditAgency(agency);

		// Then - assertions for result of method reportToCreditAgency(ICreditAgency)
		assertFalse(result);

		// Then - assertions for this instance of Account
		assertNotNull(underTest.getCustomer());
		assertEquals(0, underTest.getBalance());
		assertEquals("silver", underTest.getStatus());

	}

	/**
	 * Parasoft Jtest UTA: Test for reportToCreditAgency(ICreditAgency)
	 *
	 * @see examples.nbank.Account#reportToCreditAgency(ICreditAgency)
	 * @author pteodor
	 */
	@Test(timeout = 5000, expected = ConnectionException.class)
	public void testReportToCreditAgency2() throws Throwable {
		// Given
		Customer customer = mock(Customer.class);
		int initial_balance = 0; // UTA: provided value
		Account underTest = new Account(customer, initial_balance);

		// When
		ICreditAgency agency = mockICreditAgency();
		underTest.reportToCreditAgency(agency);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of ICreditAgency
	 */
	private static ICreditAgency mockICreditAgency() throws Throwable {
		ICreditAgency agency = mock(ICreditAgency.class);
		when(agency.report(nullable(Account.class))).thenThrow(IOException.class);
		return agency;
	}

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
		int initial_balance = 49; // UTA: provided value
		Account underTest = new Account(customer, initial_balance);

		// When
		int balance = 49; // UTA: provided value
		underTest.setBalance(balance);

		// Then - assertions for this instance of Account
		assertNotNull(underTest.getCustomer());
		assertEquals(49, underTest.getBalance());
		assertEquals("silver", underTest.getStatus());

	}

	/**
	 * Parasoft Jtest UTA: Test for setBalance(int)
	 *
	 * @see examples.nbank.Account#setBalance(int)
	 * @author pteodor
	 */
	@Test(timeout = 5000)
	public void testSetBalance2() throws Throwable {
		// Given
		Customer customer = mock(Customer.class);
		int initial_balance = 49; // UTA: provided value
		Account underTest = new Account(customer, initial_balance);

		// When
		int balance = 99; // UTA: provided value
		underTest.setBalance(balance);

		// Then - assertions for this instance of Account
		assertNotNull(underTest.getCustomer());
		assertEquals(99, underTest.getBalance());
		assertEquals("gold", underTest.getStatus());

	}

	/**
	 * Parasoft Jtest UTA: Test cloned from
	 * examples.nbank.AccountTest#testSetBalance2()
	 * To cover the code, the value of the 'balance' variable has been modified to '1000'.
	 *
	 * @see examples.nbank.Account#setBalance(int)
	 * @author pteodor
	 */
	@Test(timeout = 5000)
	public void testSetBalance3() throws Throwable {
		// Given
		String name = "name"; // UTA: default value
		String ssn = "ssn"; // UTA: default value
		Customer customer = new Customer(name, ssn);
		int initial_balance = 49; // UTA: provided value
		Account underTest = new Account(customer, initial_balance);

		// When
		int balance = 1000; // UTA: provided value // UTA: modified value
		underTest.setBalance(balance);

		// Then - assertions for this instance of Account
		assertNotNull(underTest.getCustomer());
		assertEquals(1000, underTest.getBalance());
		assertEquals("platinum", underTest.getStatus());

	}
}
