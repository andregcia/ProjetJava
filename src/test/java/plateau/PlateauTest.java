package plateau;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * Classe de test
 */
public class PlateauTest extends TestCase {

	/**
	 * Test de la methode init()
	 */
	public void testInit() {
		Plateau p = new Plateau();
		p.init();
		// Cases salvatrices
		assertTrue(p.getTabCases()[1][1].isSalvatrice());
		assertTrue(p.getTabCases()[1][2].isSalvatrice());
		assertTrue(p.getTabCases()[1][10].isSalvatrice());
		assertTrue(p.getTabCases()[1][11].isSalvatrice());
		
		// Cases hors jeu
		assertFalse(p.getTabCases()[0][0].isVisitable());
		assertFalse(p.getTabCases()[0][1].isVisitable());
		assertFalse(p.getTabCases()[0][2].isVisitable());
		assertFalse(p.getTabCases()[0][3].isVisitable());
		
		// Monstres
		assertEquals(1, p.getTabCases()[1][2].getPions().size());
		assertEquals(1, p.getTabCases()[1][10].getPions().size());
		assertEquals(1, p.getTabCases()[6][6].getPions().size());
		assertEquals(1, p.getTabCases()[11][2].getPions().size());
		assertEquals(1, p.getTabCases()[11][10].getPions().size());
	}

/*
	public void testDeleteNext() {
		LinkedList liste = new LinkedList(1, new LinkedList(2, new LinkedList(3, null)));
		liste.deleteNext();
		assertEquals(new Integer(3), liste.getNext().getElement());
		liste.deleteNext();
		assertEquals(null, liste.getNext());
	}


	public void testToString() {
		assertEquals("1 2 3", new LinkedList(1, new LinkedList(2, new LinkedList(3, null))).toString());
	}


	@Test
	public void testLast() {
		assertEquals(3, new LinkedList(1, new LinkedList(2, new LinkedList(3, null))).last());
	}


	public void testAppend() {
		assertEquals("1 2", new LinkedList(1, new LinkedList(2, null)).append(null).toString());
		assertEquals("1 2 3 4", new LinkedList(1, new LinkedList(2, null)).append(new LinkedList(3, new LinkedList(4, null))).toString());
		assertEquals("3 4", new LinkedList(3, null).append(new LinkedList(4, null)).toString());
	}


	public void testEquals() {
		assertEquals(false, new LinkedList(1, null).equals(new Integer(1)));
		assertEquals(true, new LinkedList(1, null).equals(new LinkedList(1, null)));
		assertEquals(true, new LinkedList(1, new LinkedList(2, null)).equals(new LinkedList(1, new LinkedList(2, null))));
		assertEquals(false, new LinkedList(1, null).equals(new LinkedList(1, new LinkedList(2, null))));
		assertEquals(false, new LinkedList(1, new LinkedList(2, null)).equals(new LinkedList(1, null)));
		assertEquals(false, new LinkedList(1, new LinkedList(2, null)).equals(new LinkedList(1, new LinkedList(3, null))));
	}

	public void testReverse() {
		assertEquals("1", new LinkedList(1, null).reverse().toString());
		assertEquals("3 2 1", new LinkedList(1, new LinkedList(2, new LinkedList(3, null))).reverse().toString());
		assertEquals("2 1", new LinkedList(1, new LinkedList(2, null)).reverse().toString());
	}
	*/
}
