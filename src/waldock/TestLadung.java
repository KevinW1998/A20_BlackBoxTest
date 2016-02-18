package waldock;

import org.junit.Assert;
import org.junit.Test;

import weiser.GewichtException;
import weiser.LKW;

public class TestLadung {
	@Test
	public void testLKWNutzlast(){
		LKW lkw = new LKW("TEST-S", 4000, 2000, 3);
		Assert.assertEquals("Nutzlast fail!", 0, lkw.getNutzLast()); 
		lkw.aufladen(200);
		Assert.assertEquals("Nutzlast fail!", 200, lkw.getNutzLast()); 
		lkw.entladen(100);
		Assert.assertEquals("Nutzlast fail!", 100, lkw.getNutzLast());
	}
	
	@Test
	public void testLKWEigenGewicht(){
		LKW lkw = new LKW("TEST-S", 4000, 2000, 3);
		Assert.assertEquals("Eigengewicht fail!", 2000, lkw.getEigenGewicht());
		Assert.assertEquals("Max. Gewicht fail!", 4000, lkw.getHoechstZulaessigesGesamtGewicht());
	}
	
	@Test(expected=GewichtException.class)
	public void testLKWGewichtException(){
		LKW lkw = new LKW("TEST-S", 4000, 2000, 3);
		lkw.aufladen(3000);
	}
}
