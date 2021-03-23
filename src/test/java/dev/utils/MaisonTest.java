package dev.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaisonTest {

	private static final double DELTA = 0.000001;

	@Test
	public void testAjouterPiece() {
		Maison maison = new Maison();
		maison.ajouterPiece(null);
		Piece[] tab = maison.getTab();
		assertEquals(0, tab.length);
	}
	
	@Test
	public void testGetSuperficieTotale() {
		Maison maison = new Maison();
		maison.ajouterPiece(null);
		assertEquals(0.0, maison.getSuperficieTotale(), DELTA);
		maison.ajouterPiece(new Chambre(-1.0, 0));
		assertEquals(0.0, maison.getSuperficieTotale(), DELTA);
	}

	@Test
	public void testGetSuperficieParEtage() {
		Maison maison = new Maison();
		maison.ajouterPiece(null);
		assertEquals(0.0, maison.getSuperficieParEtage(5), DELTA);
		maison.ajouterPiece(new Chambre(-1.0, 0));
		assertEquals(0.0, maison.getSuperficieParEtage(0), DELTA);
	}
	
	@Test
	public void testGetSuperficieParType() {
		Maison maison = new Maison();
		maison.ajouterPiece(null);
		assertEquals(0.0, maison.getSuperficieParType(null), DELTA);
	}
	
	@Test
	public void testGetNombreParType() {
		Maison maison = new Maison();
		maison.ajouterPiece(null);
		assertEquals(0, maison.getNombreParType(null));
	}
	
}
