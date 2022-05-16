import java.util.Scanner;
interface Shapess{
	static final double pi=3.14;
	void area();
	void perimeter();
	
}
class Circle implements Shapess{
	double a,p;
	int r;
	Scanner inp=new Scanner(System.in);
	Circle(){
	System.out.println("enter radius");
	this.r=inp.nextInt();
	}
	
	public void area() {
		a=pi*r*r;
		System.out.println("Area="+a);
	}
	public void perimeter() {
		p=2*pi*r;
		System.out.println("perimeter ="+p);
	}
		
}
class Rectangle implements Shapess{
	double a,p;
	int l,b;
	Scanner inp=new Scanner(System.in);
	Rectangle(){
	System.out.println("enter length");
	this.l=inp.nextInt();
	System.out.println("enter breadth");
	this.b=inp.nextInt();
	}
	
	public void area() {
		a=l*b;
		System.out.println("Area="+a);
	}
	public void perimeter() {
		p=2*(l+b);
		System.out.println("perimeter ="+p);
	}
		
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		Scanner inp=new Scanner(System.in);
		System.out.println("1.Circle 2.Rectangle 3.Exit");
		while(true) {
			System.out.println("enter choice");
			ch=inp.nextInt();
			switch(ch) {
			case 1:System.out.println("Circle");
				Circle cir=new Circle();
				cir.area();
				cir.perimeter();
				break;
			case 2:System.out.println("Rectangle");
				Rectangle rec=new Rectangle();
				rec.area();
				rec.perimeter();
				break;
			case 3:System.out.println("Exit");
				System.exit(0);
		default:System.out.println("Enter the correct choice");
			
			}
			
		}
		
	}

}
