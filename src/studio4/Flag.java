package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.clear();
		StdDraw.setPenColor(0,0,250);
		double[] x= {.3, .3, .8};
		double[] y= {.5, .75 ,.5};
		double[] x2 = {.3, .3, .8 };
		double[] y2= {.3, .6, .3};
		StdDraw.filledPolygon(x, y);
		StdDraw.filledPolygon(x2, y2);
		StdDraw.setPenColor(250,0,0);
		double[] x3= {.315, .315, .74};
		double[] y3= {.515, .725 ,.515};
		double[] x4 = {.315, .315, .74 };
		double[] y4= {.315, .58, .315};
		StdDraw.filledPolygon(x3, y3);
		StdDraw.filledPolygon(x4, y4);
		StdDraw.setPenColor(255,255,255);
		StdDraw.filledCircle(.4, .58, .05);
		StdDraw.setPenColor(250,0,0);
		StdDraw.filledCircle(.4, .6, .05);






	}
}