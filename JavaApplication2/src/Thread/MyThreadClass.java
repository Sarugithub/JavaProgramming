class Thread1 extends Thread
{
		public void run(){
			for(int i=0; i<100;i++){
				System.out.println("i = " + i);
			}

		}

}

public class MyThreadClass
{
	public static void main(String args[]){
		Thread1 t1 = new Thread1();
		//t1.run();
		t1.start();
		System.out.println("Prongram End Now");
	}
}

