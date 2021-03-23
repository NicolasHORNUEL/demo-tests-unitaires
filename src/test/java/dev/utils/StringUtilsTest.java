package dev.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class StringUtilsTest {

	@Test
	public void testLevenshteinDistance1() {
		int result = StringUtils.levenshteinDistance("chat", "chats");
		assertEquals(1, result);
	}
	
	@Test
	public void testLevenshteinDistance2() {
		int result = StringUtils.levenshteinDistance("machins", "machine");
		assertEquals(1, result);
	}
	
	@Test
	public void testLevenshteinDistance3() {
		int result = StringUtils.levenshteinDistance("aviron", "avion");
		assertEquals(1, result);
	}
	
	@Test
	public void testLevenshteinDistance4() {
		int result = StringUtils.levenshteinDistance("distance", "instance");
		assertEquals(2, result);
	}
	
	@Test
	public void testLevenshteinDistance5() {
		int result = StringUtils.levenshteinDistance("Chien", "Chine");
		assertEquals(2, result);
	}
	
	@Test
	public void testLevenshteinDistance6() {
		int result = StringUtils.levenshteinDistance(" ", " ");
		assertEquals(0, result);
	}
	
	@Test
	public void testLevenshteinDistance7() {
		int result = StringUtils.levenshteinDistance(null, null);
		assertEquals(-1, result);
	}

}
