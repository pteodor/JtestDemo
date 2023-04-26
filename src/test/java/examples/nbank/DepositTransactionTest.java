/**
 * 
 */
package examples.nbank;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for DepositTransaction
 *
 * @see examples.nbank.DepositTransaction
 * @author pteodor
 */
public class DepositTransactionTest {

	/**
	 * Parasoft Jtest UTA: Test for apply(Account)
	 *
	 * @see examples.nbank.DepositTransaction#apply(Account)
	 * @author pteodor
	 */
	@Test(timeout = 5000)
	public void testApply() throws Throwable {
		// Given
		int amount = 0; // UTA: default value
		DepositTransaction underTest = new DepositTransaction(amount);

		// When
		Account account = mockAccount();
		boolean result = underTest.apply(account);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Customer
	 */
	private static Customer mockCustomer() throws Throwable {
		Customer getCustomerResult = mock(Customer.class);
		String getNameResult = ""; // UTA: provided value
		when(getCustomerResult.getName()).thenReturn(getNameResult);
		return getCustomerResult;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Account
	 */
	private static Account mockAccount() throws Throwable {
		Account account = mock(Account.class);
		Customer getCustomerResult = mockCustomer();
		when(account.getCustomer()).thenReturn(getCustomerResult);
		return account;
	}

	/**
	 * Parasoft Jtest UTA: Test for apply(Account)
	 *
	 * @see examples.nbank.DepositTransaction#apply(Account)
	 * @author pteodor
	 */
	@Test(timeout = 5000)
	public void testApply2() throws Throwable {
		// Given
		int amount = 1; // UTA: provided value
		DepositTransaction underTest = new DepositTransaction(amount);

		// When
		Account account = mockAccount2();
		boolean result = underTest.apply(account);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Customer
	 */
	private static Customer mockCustomer2() throws Throwable {
		Customer getCustomerResult = mock(Customer.class);
		String getNameResult = "John Hacker"; // UTA: provided value
		when(getCustomerResult.getName()).thenReturn(getNameResult);
		return getCustomerResult;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Account
	 */
	private static Account mockAccount2() throws Throwable {
		Account account = mock(Account.class);
		int getBalanceResult = 100; // UTA: provided value
		when(account.getBalance()).thenReturn(getBalanceResult);

		Customer getCustomerResult = mockCustomer2();
		when(account.getCustomer()).thenReturn(getCustomerResult);
		return account;
	}

	/**
	 * Parasoft Jtest UTA: Test for apply(Account)
	 *
	 * @see examples.nbank.DepositTransaction#apply(Account)
	 * @author pteodor
	 */
	@Test(timeout = 5000)
	public void testApply3() throws Throwable {
		// Given
		int amount = 1; // UTA: provided value
		DepositTransaction underTest = new DepositTransaction(amount);

		// When
		Account account = mockAccount3();
		boolean result = underTest.apply(account);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Customer
	 */
	private static Customer mockCustomer3() throws Throwable {
		Customer getCustomerResult = mock(Customer.class);
		String getNameResult = "John Hacker"; // UTA: provided value
		when(getCustomerResult.getName()).thenReturn(getNameResult);
		return getCustomerResult;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Account
	 */
	private static Account mockAccount3() throws Throwable {
		Account account = mock(Account.class);
		int getBalanceResult = 0; // UTA: provided value
		when(account.getBalance()).thenReturn(getBalanceResult);

		Customer getCustomerResult = mockCustomer3();
		when(account.getCustomer()).thenReturn(getCustomerResult);
		return account;
	}

	/**
	 * Parasoft Jtest UTA: Test for fee()
	 *
	 * @see examples.nbank.AbstractTransaction#fee()
	 * @author pteodor
	 */
	@Test(timeout = 5000)
	public void testFee() throws Throwable {
		// Given
		int amount = 0; // UTA: default value
		DepositTransaction underTest = new DepositTransaction(amount);

		// When
		int result = underTest.fee();

	}
}