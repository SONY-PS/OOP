package OOPsONY;

import java.util.Arrays;
import java.util.Scanner;
class Sort{
	int i,j,n;
	String array[],temp;
	void sort() {
		for(i=0;i<n;i++) {
			for(j=i+1;j<n;j++) {
				if(array[i].compareTo(array[j]>0)) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
	}
}
public class SortString {
	public static void main(String[] args) {
		int n;
		Scanner r=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		n=r.nextInt();
		System.out.println("Enter the elements to the array:");
		String[] a=new String[n];
		for(int i=0;i<n;i++) {
			a[i]=r.next();
		}
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		for(int i=0;i<n;i++) {
			System.out.println(a[i]+",");
		}
	}
}