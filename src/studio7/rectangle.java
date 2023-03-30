package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class rectangle {
	double height;
	double width;
	
	public rectangle(double h, double w) {
		this.height = h;
		this.width = w;
	}
	public boolean compare(rectangle rec) {
		double recArea =  rec.height*rec.width;
		double originalRecArea = this.height*this.width;
		if (recArea > originalRecArea)
			return false;
		else
			return true;
	}
	
	public boolean isSquare() {
		if (this.height == this.width)
			return true;
		else return false;
	}
	public void drawRectangle() {
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.rectangle(0.5, 0.5, this.width/2, this.height/2);
	}
	public static void main(String[] args){
		rectangle r1 = new rectangle(5, 9);
		rectangle r2 = new rectangle(4, 3);
		System.out.println(r1.compare(r2));
		System.out.println(r1.isSquare());
		r1.drawRectangle();
	}
}


