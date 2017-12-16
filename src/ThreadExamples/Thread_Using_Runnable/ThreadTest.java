import java.util.*;

class MyClass implements Runnable{
	
	Random rand = new Random();
	
	public void run(){
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			System.out.println(e);
		}
		
		for(int i=0; i<5;i++){
			System.out.println(Thread.currentThread().getId()+ " Value of i: "+i+" Random number: "+rand.nextInt(6));
		}	
	}
}


class ThreadTest{
	public static void main(String [] abc){
		
	/* 	Thread.currentThread().setName("Changed!");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().isAlive());
		Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread().getPriority()); */		
		
		Thread t1 = new Thread(new MyClass());
		t1.start();
	}
}