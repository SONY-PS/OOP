import java.util.Scanner;

public class ComplexNumber {
	double real;
	double img;
	
	ComplexNumber (double r,double i){
		this.real=r;
		this.img=i;
	}
	
	ComplexNumber() {}
	
	ComplexNumber sum(ComplexNumber c1,ComplexNumber c2){
		ComplexNumber temp=new ComplexNumber();
		temp.real=c1.real+c2.real;
		temp.img=c1.img+c2.img;
		return temp;
	}
	
	public static void main(String[] args) {
		ComplexNumber c1=new ComplexNumber();
		Scanner s=new Scanner(System.in);
		System.out.println("first Complex number:");
		c1.real=s.nextDouble();
		c1.img=s.nextDouble();
		ComplexNumber c2=new ComplexNumber();
		System.out.println("second Complex number:");
		c2.real=s.nextDouble();
		c2.img=s.nextDouble();
		System.out.println("Complex number 1 : " + c1.real + " + " + c1.img + "i");
		System.out.println("Complex number 2 : " +c2.real + " + " + c2.img + "i");
		ComplexNumber temp1=new ComplexNumber();
		temp1=temp1.sum(c1,c2);
		System.out.println("Sum of complex numbers : "+temp1.real+temp1.img+"i" );
	}

}
