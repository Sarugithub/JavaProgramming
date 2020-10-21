class HelloThread extends Thread 
{
	public void run (){
		try{
			while(true){
				Thread.sleep(1000);
				System.out.println("Hello world");
			}
		}catch(Exception e){
			System.out.println(e);	
		}
	}
	public static void main(String[] args) 
	{
		HelloThread hw = new HelloThread();
		hw.start();
		
	}
}
