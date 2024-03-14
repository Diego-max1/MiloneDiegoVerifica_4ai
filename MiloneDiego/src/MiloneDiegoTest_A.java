import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MiloneDiegoTest_A {

	@Test
	void testMiloneMet1() {
		MiloneDiegoClass m = new MiloneDiegoClass();
		int s = 5, f = 7;
		int risultatoAtteso = 210;
		int risultatoReale = m.miloneMet(s, f);
		assertEquals(risultatoAtteso, risultatoReale);
		// fail("Not yet implemented");
	}
	@Test
	void testMiloneMet2() {
		MiloneDiegoClass m = new MiloneDiegoClass();
		int s = 2, f = 4;
		int risultatoAtteso = 24;
		int risultatoReale = m.miloneMet(s, f);
		assertEquals(risultatoAtteso, risultatoReale);
		// fail("Not yet implemented");
	}
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
