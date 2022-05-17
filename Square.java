package Graphics;

import java.util.Scanner;
public class Square {
	
		double side,area,perimeter;
		public Square(){
			Scanner inp=new Scanner(System.in);
			System.out.println("enter side");
			this.side=inp.nextInt();
			
		}
		public void squarearea() {
			area=side*side;
			System.out.println("area="+area);
		}
		public void squareperimeter() {
			perimeter=4*side;
			System.out.println("perimeter="+perimeter);
		}
		
}