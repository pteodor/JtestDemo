/**
 * 
 */
package examples.nbank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for Customer
 *
 * @see examples.nbank.Customer
 * @author pteodor
 */
public class CustomerTest {

	/**
	 * Parasoft Jtest UTA: Test for getName()
	 *
	 * @see examples.nbank.Customer#getName()
	 * @author pteodor
	 */
	@Test
	public void testGetName() throws Throwable {
		// Given
		String name = "name"; // UTA: default value
		String ssn = "123-45-6789"; // UTA: default value
		Customer underTest = new Customer(name, ssn);

		// When
		String result = underTest.getName();

		// Then
		// assertEquals("", result);
	}

	/**
	 * Parasoft Jtest UTA: Test for getSSN()
	 *
	 * @see examples.nbank.Customer#getSSN()
	 * @author pteodor
	 */
	@Test
	public void testGetSSN() throws Throwable {
		// Given
		String name = "name"; // UTA: default value
		String ssn = "123-45-6789"; // UTA: default value
		Customer underTest = new Customer(name, ssn);

		// When
		String result = underTest.getSSN();

		// Then
		// assertEquals("", result);
	}

	/**
	 * Parasoft Jtest UTA: Test for setName(String)
	 *
	 * @see examples.nbank.Customer#setName(String)
	 * @author pteodor
	 */
	@Test
	public void testSetName() throws Throwable {
		// Given
		String name = "name"; // UTA: default value
		String ssn = "123-45-6789"; // UTA: default value
		Customer underTest = new Customer(name, ssn);

		// When
		String name2 = "name2"; // UTA: default value
		underTest.setName(name2);

	}

	/**
	 * Parasoft Jtest UTA: Test for setSSN(String)
	 *
	 * @see examples.nbank.Customer#setSSN(String)
	 * @author pteodor
	 */
	@Test
	public void testSetSSN() throws Throwable {
		// Given
		String name = "name"; // UTA: default value
		String ssn = "123-45-6789"; // UTA: default value
		Customer underTest = new Customer(name, ssn);

		// When
		String ssn2 = "ssn2"; // UTA: default value
		underTest.setSSN(ssn2);

	}

	/**
	 * Parasoft Jtest UTA: Test for toStrng()
	 *
	 * @see examples.nbank.Customer#toStrng()
	 * @author pteodor
	 */
	@Test
	public void testToStrng() throws Throwable {
		// Given
		String name = "name"; // UTA: default value
		String ssn = "123-45-6789"; // UTA: default value
		Customer underTest = new Customer(name, ssn);

		// When
		String result = underTest.toStrng();

		// Then
		// assertEquals("", result);
	}

	/**
	 * Parasoft Jtest UTA: Test for equals(Object)
	 *
	 * @see examples.nbank.Customer#equals(Object)
	 * @author pteodor
	 */
	@Test
	public void testEquals() throws Throwable {
		// Given
		String name = "name"; // UTA: default value
		String ssn = "123-45-6789"; // UTA: default value
		Customer underTest = new Customer(name, ssn);

		// When
		Object o = new Object(); // UTA: default value
		boolean result = underTest.equals(o);

		// Then
		// assertFalse(result);
	}


	/**
	 * Parasoft Jtest UTA: Test for main(String[])
	 *
	 * @see examples.nbank.Customer#main(String[])
	 * @author pteodor
	 */
	@Test
	public void testMain() throws Throwable {
		// When
		String[] args = new java.lang.String[0]; // UTA: default value
		Customer.main(args);

	}
}