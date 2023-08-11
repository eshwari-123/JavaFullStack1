package com.threadutil;


class  MyChildThread extends Thread{
	public void run() {
		System.out.println("Child thread started");
	}
}
public class MyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread=Thread.currentThread();
		System.out.println(thread.getName());
		MyChildThread childThread1=new MyChildThread();
		MyChildThread childThread2=new MyChildThread();
		childThread1.setName("Child thread1");
		childThread2.setName("Child thread2");

	}

}
