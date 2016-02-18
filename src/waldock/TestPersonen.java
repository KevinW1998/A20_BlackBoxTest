package waldock;

import org.junit.Assert;
import org.junit.Test;

import weiser.LKW;
import weiser.PersonenException;

public class TestPersonen {
	@Test
	public void testLKWPersonen(){
		LKW lkw = new LKW("TEST-S", 4000, 2000, 3);
		Assert.assertEquals("Personen fail!", 0, lkw.getPersonenZahl()); 
		lkw.einsteigen();
		Assert.assertEquals("Personen fail!", 1, lkw.getPersonenZahl());
		lkw.aussteigen();
		Assert.assertEquals("Personen fail!", 0, lkw.getPersonenZahl());
	}
	
	@Test 
	public void testLKWMaxPersonen(){
		LKW lkw = new LKW("TEST-S", 4000, 2000, 3);
		Assert.assertEquals("Personen fail!", 3, lkw.getHoechstZulaessigePersonenZahl()); 
	}
	
	@Test(expected=PersonenException.class)
	public void testLKWPersonenException(){
		LKW lkw = new LKW("TEST-S", 4000, 2000, 3);
		for(int i = 0; i < 4; i++){
			lkw.einsteigen();
		}
	}
}
