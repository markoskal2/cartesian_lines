package com.doveit;

public class CartesianLine {

	public static class Coordinates {
		protected int x;
		protected int y;

		public Coordinates(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static boolean isPerpendicular(Coordinates c1, Coordinates c2, Coordinates c3, Coordinates c4) {
		int slope_line1 = (c2.y - c1.y) / (c2.x - c1.x);
		int slope_line2 = (c4.y - c3.y) / (c4.x - c3.x);

		return slope_line1 * slope_line2 == -1;

	}

	public static boolean isParallel(Coordinates c1, Coordinates c2, Coordinates c3, Coordinates c4) {
		int slope_line1 = (c2.y - c1.y) / (c2.x - c1.x);
		int slope_line2 = (c4.y - c3.y) / (c4.x - c3.x);

		return slope_line1 == slope_line2;

	}

	public static void createLineEquation(Coordinates c1, Coordinates c2) {
		int slope = (c2.y - c1.y) / (c2.x - c1.x);
		// Line eq: y = ax + b
		// a = line slope
		int b = c1.y - slope * c1.x;

		System.out.println("Coordinates for line 1 are: (" + c1.x + "," + c1.y + ")"
				+ "\nCoordinates for line 2 are: (" + c2.x + "," + c2.y +")");
		System.out.println("Line equation: y = " + slope + "x + " + b);
	}

	public static void main(String[] args) {
		Coordinates c1 = new Coordinates(5, -8);
		Coordinates c2 = new Coordinates(1, 3);

		createLineEquation(c1, c2);
	}
}