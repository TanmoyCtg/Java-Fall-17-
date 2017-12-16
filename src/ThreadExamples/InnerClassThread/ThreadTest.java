
class ThreadTest{
	public static void main(String [] abc){		
		
		Thread t1 = new Thread(new Runnable(){
				public void run(){
				try{
						Thread.sleep(1000);
					}catch(Exception e){
						System.out.println(e);
					}
			
				for(int i=0; i<5;i++){
					System.out.println(Thread.currentThread().getId()+ " Value of i: "+i);
				}
				
			}
		});
		
		t1.start();
	}
}