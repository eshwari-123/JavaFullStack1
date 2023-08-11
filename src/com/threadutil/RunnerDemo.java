package com.threadutil;
import java.util.Scanner;


class MyRunner implements Runnable{
double p=12000;
	int r=3;
	int t=4;
	
	public void run() {
		Thread thread=Thread.currentThread();
		
		System.out.println(p*t*r/100);
		try {
			System.out.println(thread.getName()+"is running");
			Thread.sleep(1000);
		}
		catch(Exception e) {
			
		}
	}
	
	}

public class RunnerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Name: ");
		String userName=scanner.nextLine();
		System.out.println("Email Id :");
		String email=scanner.nextLine();
		
		
		MyRunner myRunner=new MyRunner();
		Thread th1=new Thread(myRunner);
		Thread th2=new Thread(myRunner);
		th1.setName("child thread 1");
		th2.setName("child thread2");
		th1.start();
		th2.start();

	}

}
