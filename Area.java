import java.util.*;
class CalculateArea{
	double a;


void Area(float b,float l) {
	a=l*b;
	System.out.println("area of rectangle ="+a);
	
	}
void Area(int ba,int al) {
	a=0.5*al*ba;
	System.out.println("area of triangle ="+a);
	}
void Area(int r) {
	a=3.14*r*r;
	System.out.println("area of circle ="+a);
	}
void Area(float sq) {
	a=sq*sq;
	System.out.println("area of square ="+a);
	
	}
}

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch,r,al,ba;
		float l,b,sq;
		Scanner read=new Scanner(System.in);
		while (true) {
			System.out.println("1.circle\n2.triangle\n3.rectangle\n4.square\n5.Exit");
			System.out.println("Select the shape to find area");
			ch=read.nextInt();
			CalculateArea object=new CalculateArea();
			switch(ch) {
			case 1:System.out.println("Circle");
					System.out.println("radius:");
					r=read.nextInt();
					object.Area(r);
					break;
			case 2:System.out.println("triangle");
					System.out.println("enter the base length");
					ba=read.nextInt();
					System.out.println("enter the altitude");
					al=read.nextInt();
					object.Area(ba,al);
					break;
			case 3:System.out.println("rectangle");
					System.out.println("enter the breadth");
					b=read.nextInt();
					System.out.println("enter the length");
					l=read.nextInt();
					object.Area(b,l);
					break;
			case 4:System.out.println("square");
				System.out.println("enter the side of square");
					sq=read.nextInt();
					object.Area(sq);
					break;
			case 5:System.out.println("Exiting...");
					System.exit(0);
			default:System.out.println("enter correct choice");w9
					
			
			}
		}
	}
}
