/**
 * 
 */
package examples.nbank;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for BankState
 *
 * @see examples.nbank.BankState
 * @author pteodor
 */
public class BankStateTest {

	/**
	 * Parasoft Jtest UTA: Test for endMaintenance()
	 *
	 * @see examples.nbank.BankState#endMaintenance()
	 * @author pteodor
	 */
	@Test(timeout = 5000)
	public void testEndMaintenance() throws Throwable {
		// When
		BankState.endMaintenance();

	}

	/**
	 * Parasoft Jtest UTA: Test for isMaintenanceMode()
	 *
	 * @see examples.nbank.BankState#isMaintenanceMode()
	 * @author pteodor
	 */
	@Test(timeout = 5000)
	public void testIsMaintenanceMode() throws Throwable {
		// When
		Boolean result = BankState.isMaintenanceMode();

		// Then - assertions for result of method isMaintenanceMode()
		assertNotNull(result);
		assertFalse(result);

	}

	/**
	 * Parasoft Jtest UTA: Test for startMaintenance()
	 *
	 * @see examples.nbank.BankState#startMaintenance()
	 * @author pteodor
	 */
	@Test(timeout = 5000)
	public void testStartMaintenance() throws Throwable {
		// When
		BankState.startMaintenance();

	}
}