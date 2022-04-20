package OOPsONY;

import java.util.Scanner;
import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {
		int n1,i,ch;
		Scanner read=new Scanner(System.in);
		String s1=new String();
		System.out.println("Enter the String");
		s1=read.next();
		s1+=read.nextLine();
		
			do
			{
				System.out.println("1-String Length\n2-String Concatenation\n3-Character Extraction\n4-String Comparison\n5-Searching Substrings\n6-Modifying a String\n7-Exit");
				System.out.println("Enter Your Choice");
				ch=read.nextInt();
				switch(ch)
				{
				case 1:System.out.println("String length:" +s1.length());
					   break;
				case 2:System.out.println("Enter the Strings to  Concatenate:");
					   String s2=new String();
				       s2=read.next();
				       System.out.println("String after concatenation : "+s1.concat(s2));
				       break;
				case 3:System.out.println("Enter the position of the character");
						int p;
						p=read.nextInt();
						System.out.println("Character at the position "+p+" : "+s1.charAt(p));
						break;
				case 4:System.out.println("Enter the string to be compared ");
					    String s3=new String();
					    s3=read.next();
					    s3+=read.nextLine();
					    Boolean result=s1.equals(s3);
					    System.out.println("Is the two strings "+s1+" and "+s3+" are equal?"+result);
					    break;
				case 5:System.out.println("Searching for substrings");
					   String a1=new String();
					   a1=read.next();
					   int lastIndex=s1.lastIndexOf(a1);
					   int firstIndex=s1.indexOf(a1,2);
					   System.out.println("Last index"+lastIndex +"First index"+firstIndex);
					   break;
				case 6:System.out.println("Enter the string to be replaced");
					   String s4=new String();
					   s4=read.next();
					   System.out.println("Enter string for replacing ");
					   String s5=new String();
					   s5=read.next();
					   String replace_string=s1.replace(s4,s5);
					   System.out.println("The string after replace : "+replace_string);
					   break;
				case 7:System.out.println("Exiting...");
				System.exit(0);
			default:System.out.println("Invalid Choice");
			break;
			       
			}
			
		}
		while(ch!=8);
				
	}	

}