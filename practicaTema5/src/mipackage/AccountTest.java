package mipackage;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class AccountTest extends TestCase {

	@Test
	@DisplayName(value = "ingresar un numero positivo")
	void testIngresar() throws Exception {
		Account cuenta = new Account("pepe", "0001");
		cuenta.ingresar(10);
		assertEquals(10.0, cuenta.balance);
	}

	@Test
	@DisplayName(value = "rtirar una catidad menor que la base")
	void testRetirar() throws Exception {
		Account cuenta = new Account("pepe", "0001");
		cuenta.balance=20;
		cuenta.retirar(10);
		assertEquals(10.0, cuenta.balance);
	}

}
