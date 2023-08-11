import java.util.Scanner;
import java.util.Arrays;
public class Sample {

	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public void divide(int a,int b) {
		System.out.println(a/b);
	}
	
	public void addArray(int[] arr) {
		for (int i=0;i<=5;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
Sample obj=new Sample();
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int[] arr= {12,13,14};
obj.add(a, b);

	obj.divide(a, b);
	obj.addArray(arr);
		
	}
catch(ArithmeticException exception) {
	System.out.println("cannot divide by zero");
}
		
		catch(IndexOutOfBoundsException exception) {
			System.out.println("Not in range of array");
		}
		catch (Exception exception) {
			System.out.println("please enter only numeric values");
		}




	}
}
