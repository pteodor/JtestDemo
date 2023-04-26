/**
 * 
 */
package examples.nbank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for WithdrawalTransaction
 *
 * @see examples.nbank.WithdrawalTransaction
 * @author pteodor
 */
public class WithdrawalTransactionTest {

	/**
	 * Parasoft Jtest UTA: Test for apply(Account)
	 *
	 * @see examples.nbank.WithdrawalTransaction#apply(Account)
	 * @author pteodor
	 */
	@Test(timeout = 5000)
	public void testApply() throws Throwable {
		// Given
		int amount = 0; // UTA: provided value
		WithdrawalTransaction underTest = new WithdrawalTransaction(amount);

		// When
		Account account = mock(Account.class);
		boolean result = underTest.apply(account);

		// Then - assertions for argument 1 of method apply(Account)
		assertNull(account.getCustomer());
		assertEquals(0, account.getBalance());
		assertNull(account.getStatus());

		// Then - assertions for result of method apply(Account)
		assertTrue(result);

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
		int amount = 0; // UTA: provided value
		WithdrawalTransaction underTest = new WithdrawalTransaction(amount);

		// When
		int result = underTest.fee();

		// Then - assertions for result of method fee()
		assertEquals(0, result);

	}
}