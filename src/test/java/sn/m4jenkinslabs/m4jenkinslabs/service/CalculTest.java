package sn.m4jenkinslabs.m4jenkinslabs.service;
	
	
	import junit.framework.TestCase;

	public class CalculTest extends TestCase {
		private Calcul calcul;

		protected void setUp() throws Exception {
			super.setUp();
			calcul=new Calcul();
		}
		
		public void testsomme(){
			assertTrue(calcul.somme(5, 4)==9);
		}
		
		public void testproduit(){
			assertTrue(calcul.produit(5, 4)==20);
		}
	
}
