/**
 * 
 * @author Milone Diego
 * version 0.0
 */
public class MiloneDiegoClass {
	/**
	 * costruttore
	 * 
	 */
	public MiloneDiegoClass() {
	}
/**
 * 
 * @param s primo valore
 * @param f secondo valore
 * @return r prodotto dei numeri compresi fra l'indice s e f
 */
	public int miloneMet(int s, int f) {
		int r = 0;
		for (int i = 1; i < f; i++) {
			r = r+r;
		}
		return r;
	}
/**
 * 
 * @param args main
 */
	public static void main(String[] args) {
		MiloneDiegoClass m = new MiloneDiegoClass();
		System.out.println(m.miloneMet(5, 7));
	}
}
