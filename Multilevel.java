
import java.util.*;
class Person{
	String Name,Gender,Address;
	int Age;
	
	Person(){
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter name");
		this.Name=inp.nextLine();
		System.out.println("Enter the gender");
		this.Gender=inp.nextLine();
		System.out.println("Enter the address");
		this.Address=inp.nextLine();
		System.out.println("Enter the age");
		this.Age=inp.nextInt();
	}
}
class Employ extends Person{
	String Companyname,Qualification;
	int Empid,Salary;
	Employ(){
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter employee id");
		this.Empid=inp.nextInt();
		System.out.println("Enter the company name");
		this.Companyname=inp.next();
		this.Companyname+=inp.nextLine();
		System.out.println("Enter the salary");
		this.Salary=inp.nextInt();
		System.out.println("Enter the qualification");
		this.Qualification=inp.next();
		this.Qualification+=inp.nextLine();
	}
}
class Teacher extends Employ{
	String Subject,Department;
	int Teacherid;
	Teacher(){
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter subject");
		this.Subject=inp.nextLine();
		System.out.println("Enter department");
		this.Department=inp.nextLine();
		System.out.println("Enter the teacherid");
		this.Teacherid=inp.nextInt();
	}
	void display() {
		System.out.println("Name: "+Name);
		System.out.println("Gender: "+Gender);
		System.out.println("Address: "+Address);
		System.out.println("Age: "+Age);
		System.out.println("Empid: "+Empid);
		System.out.println("Companyname: "+Companyname);
		System.out.println("Salary: "+Salary);
		System.out.println("Qualification: "+Qualification);
		System.out.println("Subject: "+Subject);
		System.out.println("Department: "+Department);
		System.out.println("Teacherid: "+Teacherid);
		
		
	}
}
public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=inp.nextInt();
		Teacher t[]=new Teacher[n];
		for(int i=0;i<n;i++)
		{
			t[i]=new Teacher();
			System.out.print("\n");
		}
		System.out.println("__Display__");
		for(int i=0;i<n;i++)
		{
			t[i].display();
			System.out.print("\n");
		}
	}

}
