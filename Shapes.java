
import java.util.Scanner;
import Graphics.*;

public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		Scanner inp=new Scanner(System.in);
		System.out.println("1.Circle\n2.Rectangle\n3.Square\n4.Triangle\n5.Exit");
		while(true) {
			System.out.println("enter choice");
			ch=inp.nextInt();
			switch(ch) {
			case 1:System.out.println("Circle");
				Circ cir=new Circ();
				cir.circarea();
				cir.circperimeter();
				break;
			case 2:System.out.println("Rectangle");
				Rect rec=new Rect();
				rec.rectarea();
				rec.rectperimeter();
				break;
			case 3:System.out.println("Square");
				Square squ=new Square();
				squ.squarearea();
				squ.squareperimeter();
				break;
			case 4:System.out.println("Triangle");
				Tria tri=new Tria();
				tri.triaarea();
				tri.triaperimeter();
				break;
			case 5:System.out.println("Exit successfully");
				System.exit(0);
			default:System.out.println("Invalid choice !!");
			}
		}

	}

}