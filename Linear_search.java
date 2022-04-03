package first;

import java.util.Scanner;

public class Linear_search {
		static int linear(int a[], int key) {
			for(int i=0; i<a.length; i++) {
				if(a[i]==key) {
					return i+1;
				}
			}
			return -1;
		}
		static void printarray(int arr[]) {
			// using for each loop
			for(int i:arr) {
				System.out.print(i+" ");
			}
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of array size :");
		int size=sc.nextInt();
		int a[]=new int[size]; // Creating an array declaration and instantiation.
		// Static method can be called directly through method name
		for(int i=0; i<a.length; i++) {
			System.out.println("Enter the value of "+(i+1)+" student marks ");
			a[i]=sc.nextInt();
		}
		printarray(a);
		System.out.println();
		System.out.println("Enter the value you want to find :");
		int key =sc.nextInt();
		int result=linear(a,key);
		System.out.println("The element is present at "+result+" index position.");
	}
}
