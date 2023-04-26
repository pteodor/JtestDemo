/**
 * 
 */
package examples.nbank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for Bank
 *
 * @see examples.nbank.Bank
 * @author pteodor
 */
public class BankTest {

	/**
	 * Parasoft Jtest UTA: Test for addAccount(Account)
	 *
	 * @see examples.nbank.Bank#addAccount(Account)
	 * @author pteodor
	 */
	@Test(timeout = 5000)
	public void testAddAccount() throws Throwable {
		// Given
		Bank underTest = new Bank();
		Map<String, Account> _accountsValue = new HashMap<String, Account>(); // UTA: default value
		setPrivateField(underTest, Bank.class, "_accounts", _accountsValue);

		// When
		Account account = mock(Account.class);
		Boolean result = underTest.addAccount(account);

		// Then - assertions for argument 1 of method addAccount(Account)
		assertNull(account.getCustomer());
		assertEquals(0, account.getBalance());
		assertNull(account.getStatus());

		// Then - assertions for result of method addAccount(Account)
		assertNotNull(result);
		assertTrue(result);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to set private field _accounts
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
	 * Parasoft Jtest UTA: Test for addAccount(Account)
	 *
	 * @see examples.nbank.Bank#addAccount(Account)
	 * @author pteodor
	 */
	@Test(timeout = 5000)
	public void testAddAccount2() throws Throwable {
		// Given
		Bank underTest = new Bank();
		Map<String, Account> _accountsValue = new HashMap<String, Account>(); // UTA: default value
		setPrivateField(underTest, Bank.class, "_accounts", _accountsValue);

		// When
		Account account = mockAccount();
		Boolean result = underTest.addAccount(account);

		// Then - assertions for argument 1 of method addAccount(Account)
		assertNull(account.getCustomer());
		assertEquals(0, account.getBalance());
		assertNull(account.getStatus());

		// Then - assertions for result of method addAccount(Account)
		assertNotNull(result);
		assertFalse(result);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Account
	 */
	private static Account mockAccount() throws Throwable {
		Account account = mock(Account.class);
		String getIDResult = "getIDResult"; // UTA: default value
		when(account.getID()).thenReturn(getIDResult);
		return account;
	}

	/**
	 * Parasoft Jtest UTA: Test for closeAccounts(List)
	 *
	 * @see examples.nbank.Bank#closeAccounts(List)
	 * @author pteodor
	 */
	@Test(timeout = 5000)
	public void testCloseAccounts() throws Throwable {
		// Given
		Bank underTest = new Bank();

		// When
		List<Account> list = null; // UTA: provided value
		underTest.closeAccounts(list);

	}

	/**
	 * Parasoft Jtest UTA: Test for closeAccounts(List)
	 *
	 * @see examples.nbank.Bank#closeAccounts(List)
	 * @author pteodor
	 */
	@Test(timeout = 5000)
	public void testCloseAccounts2() throws Throwable {
		// Given
		Bank underTest = new Bank();
		Map<String, Account> _accountsValue = new HashMap<String, Account>(); // UTA: default value
		String key = "key"; // UTA: default value
		Account value = mock(Account.class);
		_accountsValue.put(key, value);
		setPrivateField(underTest, Bank.class, "_accounts", _accountsValue);

		// When
		List<Account> list = new ArrayList<Account>(); // UTA: default value
		Account item = mockAccount2();
		list.add(item);
		underTest.closeAccounts(list);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Account
	 */
	private static Account mockAccount2() throws Throwable {
		Account item = mock(Account.class);
		String getIDResult = "getIDResult"; // UTA: default value
		when(item.getID()).thenReturn(getIDResult);
		return item;
	}

	/**
	 * Parasoft Jtest UTA: Test for endMaintenance()
	 *
	 * @see examples.nbank.Bank#endMaintenance()
	 * @author pteodor
	 */
	@Test(timeout = 5000)
	public void testEndMaintenance() throws Throwable {
		// Given
		Bank underTest = new Bank();

		// When
		underTest.endMaintenance();

	}

	/**
	 * Parasoft Jtest UTA: Test for getAccount(String, String)
	 *
	 * @see examples.nbank.Bank#getAccount(String, String)
	 * @author pteodor
	 */
	@Test(timeout = 5000)
	public void testGetAccount() throws Throwable {
		// Given
		Bank underTest = new Bank();
		Map<String, Account> _accountsValue = new HashMap<String, Account>(); // UTA: default value
		setPrivateField(underTest, Bank.class, "_accounts", _accountsValue);

		// When
		String id = "id"; // UTA: default value
		String name = "name"; // UTA: default value
		Account result = underTest.getAccount(id, name);

		// Then - assertions for result of method getAccount(String, String)
		assertNull(result);

	}

	/**
	 * Parasoft Jtest UTA: Test for getAccount(String, String)
	 *
	 * @see examples.nbank.Bank#getAccount(String, String)
	 * @author pteodor
	 */
	@Test(timeout = 5000)
	public void testGetAccount2() throws Throwable {
		// Given
		Bank underTest = new Bank();
		Map<String, Account> _accountsValue = new HashMap<String, Account>(); // UTA: default value
		String key = "key"; // UTA: default value
		Account value = mock(Account.class);
		_accountsValue.put(key, value);
		setPrivateField(underTest, Bank.class, "_accounts", _accountsValue);

		// When
		String id = "id"; // UTA: default value
		String name = "name"; // UTA: default value
		Account result = underTest.getAccount(id, name);

		// Then - assertions for result of method getAccount(String, String)
		assertNull(result);

	}

	/**
	 * Parasoft Jtest UTA: Test for isMaintenanceMode()
	 *
	 * @see examples.nbank.Bank#isMaintenanceMode()
	 * @author pteodor
	 */
	@Test(timeout = 5000)
	public void testIsMaintenanceMode() throws Throwable {
		// Given
		Bank underTest = new Bank();

		// When
		Boolean result = underTest.isMaintenanceMode();

		// Then - assertions for result of method isMaintenanceMode()
		assertNotNull(result);
		assertFalse(result);

	}

	/**
	 * Parasoft Jtest UTA: Test for setAccountsLimit(Integer)
	 *
	 * @see examples.nbank.Bank#setAccountsLimit(Integer)
	 * @author pteodor
	 */
	@Test(timeout = 5000)
	public void testSetAccountsLimit() throws Throwable {
		// When
		Integer limit = 0; // UTA: default value
		Bank.setAccountsLimit(limit);

	}

	/**
	 * Parasoft Jtest UTA: Test for startMaintenance()
	 *
	 * @see examples.nbank.Bank#startMaintenance()
	 * @author pteodor
	 */
	@Test(timeout = 5000)
	public void testStartMaintenance() throws Throwable {
		// Given
		Bank underTest = new Bank();

		// When
		underTest.startMaintenance();

	}
}