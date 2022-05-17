package Graphics;

import java.util.Scanner;

public class Rect {
	double length,breadth,area,perimeter;
	public Rect(){
		Scanner inp=new Scanner(System.in);
		System.out.println("enter length");
		this.length=inp.nextInt();
		System.out.println("enter breadth");
		this.breadth=inp.nextInt();
	}
	public void rectarea() {
		area=length*breadth;
		System.out.println("area="+area);
	}
	public void rectperimeter() {
		perimeter=2*(length+breadth);
		System.out.println("perimeter="+perimeter);
	}
	

}