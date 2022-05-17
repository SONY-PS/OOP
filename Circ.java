package Graphics;

import java.util.Scanner;
public class Circ {

	double radius,area,perimeter;
	public Circ(){
		Scanner inp=new Scanner(System.in);
		System.out.println("enter radius");
		this.radius=inp.nextInt();
		
	}
	public void circarea() {
		area=3.14*radius*radius;
		System.out.println("area="+area);
	}
	public void circperimeter() {
		perimeter=2*3.14*radius;
		System.out.println("perimeter="+perimeter);
	}

}