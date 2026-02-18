package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setScale(0, 100);
		StdDraw.setPenColor(Color.GRAY);
		StdDraw.filledRectangle(50, 50, 50, 50);

		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledRectangle(50, 25, 50, 50);

		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(25, 25, 50, 50);

		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledRectangle(50, 25, 100, 25);
		
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(75, 25, 50, 25);

		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(50, 0, 100, 25);

		StdDraw.setPenColor(Color.GRAY);
		StdDraw.filledRectangle(50, 50, 25, 25);

		StdDraw.setPenColor(Color.WHITE);
		double[] x = {25, 25, 50};
		double[] y = {75, 50, 75};
		StdDraw.filledPolygon(x, y);

		StdDraw.setPenColor(Color.WHITE);
		double[] z = {75, 75, 50};
		double[] h = {50, 25, 50};
		StdDraw.filledPolygon(z, h);

		StdDraw.setPenColor(Color.WHITE);
		double[] a = {50, 50, 75};
		double[] b = {75, 50, 75};
		StdDraw.filledPolygon(a, b);

		StdDraw.setPenColor(Color.WHITE);
		double[] c = {50, 50, 25};
		double[] d = {50, 25, 50};
		StdDraw.filledPolygon(c, d);

		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setPenRadius(0.02);
		StdDraw.rectangle(50, 50, 50, 50);

		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setPenRadius(0.01);
		StdDraw.rectangle(50, 50, 50, 25);

		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setPenRadius(0.01);
		StdDraw.line(100, 50, 75, 50);

		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setPenRadius(0.01);
		StdDraw.line(0, 50, 25, 50);

		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setPenRadius(0.01);
		StdDraw.rectangle(50, 50, 25, 25);
	}
}