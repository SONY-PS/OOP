package Graphics;

import java.util.Scanner;
import java.lang.Math;

public class Tria {

	double side1,side2,side3,area,perimeter,s,x;
	public Tria(){
		Scanner inp=new Scanner(System.in);
		System.out.println("enter side1");
		this.side1=inp.nextInt();
		System.out.println("enter side2");
		this.side2=inp.nextInt();
		System.out.println("enter side3");
		this.side3=inp.nextInt();
	}
	public void triaarea() {
		s=(side1+side2+side3)/2;
		x=s*(s-side1)*(s-side2)*(s-side3);
		area=Math.sqrt(x);
		System.out.println("area="+area);
	}
	public void triaperimeter() {
		perimeter=side1+side2+side3;
		System.out.println("perimeter="+perimeter);
	}

}