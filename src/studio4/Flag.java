package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.clear();
		StdDraw.setPenColor(0,0,0);
		StdDraw.rectangle(0.5, 0.5, 0.4, 0.3);
		StdDraw.setPenColor(255,0,0);
		StdDraw.filledRectangle(0.5, 0.5, 0.398, 0.298);
		StdDraw.setPenColor(255,255,255);
		StdDraw.filledRectangle(0.5,0.5,0.17,.298);
		StdDraw.setPenColor(0,255,0);
		double xValues[]= {0.4,0.6,0.5};
		double yValues[]= {0.45,0.45,0.65};
		StdDraw.filledPolygon(xValues,yValues);
		StdDraw.setPenColor(0,0,0);
		StdDraw.filledEllipse(.50, 0.525, 0.06, 0.03);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledEllipse(.5, 0.525, 0.01, 0.02);
	}
}