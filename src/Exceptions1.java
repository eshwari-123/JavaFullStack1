import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions1 {
	
	
	/**Erric is creating an application
	where he is entering user name email id and age.
	He is accepting these details from user 
	The application is throwing InputMismatch exception w
	hen age is entered as text Help Erric handle exception and 
	print a message ,
	Age has to be entered as number**/
	
	public void childName(String a) {
		System.out.println(a);
	}
	public void childAge(int b) {
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		Exceptions1 obj=new Exceptions1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String a=sc.nextLine();
		System.out.println("Enter the age");
		int b=sc.nextInt();
		obj.childName(a);
		obj.childAge(b);
		}
		catch(InputMismatchException exception) {
			System.out.println("age has to be entered in number");
		}
		catch (Exception exception) {
			System.out.println("unknown error");
		}

	}
}
