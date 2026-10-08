package com.point.tp2;

import java.lang.Math;

public class Point {
	private double x;
	private double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Point Translate(double a, double b) {
		double x_a;
		double y_b;
		x_a = this.x + a;
		y_b = this.y + b;
		return new Point(x_a, y_b);
	}

	public static double distance(Point p1, Point p2) {
		double x = p2.x - p1.x;
		double y = p2.y - p1.x;
		double carre = Math.pow(x, 2) + Math.pow(y, 2);
		double d = Math.sqrt(carre);
		return d;
	}

	@Override
	public String toString() {
		return "Point [p1=" + x + ", p2=" + y + "]";
	}
	
}
