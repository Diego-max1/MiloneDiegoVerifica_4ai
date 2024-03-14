import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author Milone Diego test
 */
class MiloneDiegoTest_B {

	@Before
	void preInizial() {
		
	}

	/**
	 * primo test test eseguito con s=5 e f=7
	 */
	@Test
	void testMiloneMet1() {
		MiloneDiegoClass m = new MiloneDiegoClass();
		int s = 5, f = 7;
		int risultatoAtteso = 210;
		int risultatoReale = m.miloneMet(s, f);
		assertEquals(risultatoAtteso, risultatoReale);
		// fail("Not yet implemented");
	}

	/**
	 * secondo test test eseguito con s=2 e f=4
	 */
	@Test
	void testMiloneMet2() {
		MiloneDiegoClass m = new MiloneDiegoClass();
		int s = 2, f = 4;
		int risultatoAtteso = 24;
		int risultatoReale = m.miloneMet(s, f);
		assertEquals(risultatoAtteso, risultatoReale);
		// fail("Not yet implemented");
	}

	/**
	 * terzo test test eseguito con s=9 e f=11
	 */
	@Test
	void testMiloneMet3() {
		MiloneDiegoClass m = new MiloneDiegoClass();
		int s = 9, f = 11;
		int risultatoAtteso = 990;
		int risultatoReale = m.miloneMet(s, f);
		assertEquals(risultatoAtteso, risultatoReale);
		// fail("Not yet implemented");
	}

}
