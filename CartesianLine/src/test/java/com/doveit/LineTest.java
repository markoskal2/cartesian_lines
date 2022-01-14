package com.doveit;

import org.junit.Test;

import com.doveit.CartesianLine.Coordinates;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class LineTest {

	@Test
	public void test_lines_not_parallel_not_perpendicular() {
		Coordinates c1 = new Coordinates(-1, 6);
		Coordinates c2 = new Coordinates(-2, 2);
		Coordinates c3 = new Coordinates(9, 1);
		Coordinates c4 = new Coordinates(3, 8);

		assertFalse(CartesianLine.isPerpendicular(c1, c2, c3, c4));
		assertFalse(CartesianLine.isParallel(c1, c2, c3, c4));
	}

	@Test
	public void test_lines_parallel() {
		Coordinates c1 = new Coordinates(-1, 3);
		Coordinates c2 = new Coordinates(3, 7);
		Coordinates c3 = new Coordinates(-1, 3);
		Coordinates c4 = new Coordinates(3, 7);

		assertFalse(CartesianLine.isPerpendicular(c1, c2, c3, c4));
		assertTrue(CartesianLine.isParallel(c1, c2, c3, c4));
	}

	@Test
	public void test_lines_perpendicular() {
		Coordinates c1 = new Coordinates(-2, -2);
		Coordinates c2 = new Coordinates(-3, -1);
		Coordinates c3 = new Coordinates(-1, -2);
		Coordinates c4 = new Coordinates(3, 2);

		assertTrue(CartesianLine.isPerpendicular(c1, c2, c3, c4));
		assertFalse(CartesianLine.isParallel(c1, c2, c3, c4));
	}
}