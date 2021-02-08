import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class InstitutoTest {
	 Instituto a1;
	 Instituto a2;	

	@Before
	public void setUp() throws Exception {
		String[] jefeEstudios= {"Luis", "Ana"};
		a1=new Instituto();
	 	a2=new Instituto("Avila", 23, false , "Iñaki", jefeEstudios);
	 	
	}

	@Test
	public void testInstituto() {
		assertNull(a1.jefeEstudios);
		assertNull(a1.nombreDirector);
		assertEquals(a1.numClases, 0);
		assertEquals(a1.isPublico(), true);
	}

	@Test
	public void testInstitutoStringIntBooleanString() {
		String lo=a2.getLocalidad();
		int nu=a2.getNumClases();
		assertNotNull(lo);
		assertEquals(nu, 23);
		}

	@Test
	public void testToString() {
		String texto="El instituto de Avila con 23 publico false cuyo director es Iñaki";
		assertEquals(a2.toString(), texto);
	}

	@Test
	public void testGetLocalidad() {
		assertEquals(a2.getLocalidad(), "Avila");
		assertNull(a1.getLocalidad());
	}

	@Test
	public void testSetLocalidad() {
		a2.setLocalidad("Madrid");
		assertEquals(a2.getLocalidad(),"Madrid");
		a1.setLocalidad("Jaen");
		assertNotNull(a1.getLocalidad());
	}

	@Test
	public void testGetNumClases() {
		assertEquals(a2.getNumClases(),23);
		assertEquals(a1.getNumClases(), 0);
	}

	@Test
	public void testSetNumClases() {
		a1.setNumClases(1);
		assertEquals(a1.getNumClases(), 1);
		assertEquals(a2.getNumClases(), 23);
	}

	@Test
	public void testIsPublico() {
		assertTrue(a1.isPublico());
		assertFalse(a2.isPublico());
	}

	@Test
	public void testSetPublico() {
		a1.setPublico(false);
		assertFalse(a1.isPublico());
		assertFalse(a2.isPublico());
	}

	@Test
	public void testGetNombreDirector() {
		assertNull(a1.getNombreDirector());
		assertEquals(a2.getNombreDirector(), "Iñaki");
	}

	@Test
	public void testSetNombreDirector() {
		a1.setNombreDirector("Juan");
		assertNotNull(a1.getNombreDirector());
		assertEquals(a1.getNombreDirector(), "Juan");
	}

	@Test
	public void testGetJefeEstudios() {
		String [] prueba= {"Luis", "Ana"};
		assertArrayEquals(a2.getJefeEstudios(), prueba);
	}

	@Test
	public void testSetJefeEstudios() {
		String []nuevo= {"Lucas","Isabel"};
		a2.setJefeEstudios(nuevo);
		assertArrayEquals(a2.getJefeEstudios(),nuevo);
		
	}

}
