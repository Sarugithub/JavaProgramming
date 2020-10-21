
class NewThread implements Runnable {
	String name; // name of thread
	Thread t;
	NewThread(String threadname, int p) {
		name = threadname;
		t = new Thread(this, name);
		t.setPriority(p);

		t.start(); // Start the thread
	}

// This is the entry point for thread.

	public void run() {
	/*	try {
			for(int i = 5; i > 0; i--) {
			System.out.println(name + ": " + i);  */
			System.out.println("New thread: " + t.getName());
			System.out.println("New thread: " + t.getPriority());
		/*	Thread.sleep(1000);
			}
		} 
		catch (InterruptedException e) {
			System.out.println(name + " interrupted.");
		}

	System.out.println(name + " exiting.");  */
	}

}

class DemoJoin {
	public static void main(String args[]) {
	
	Thread.currentThread().setPriority(Thread.MAX_PRIORITY);

		NewThread ob1 = new NewThread("One", Thread.NORM_PRIORITY + 2);
		NewThread ob2 = new NewThread("Two", Thread.NORM_PRIORITY - 2);
		NewThread ob3 = new NewThread("Three", Thread.NORM_PRIORITY + 3);

		System.out.println("Thread One is alive: "+ ob1.t.isAlive());
		System.out.println("Thread Two is alive: "+ ob2.t.isAlive());
		System.out.println("Thread Three is alive: "+ ob3.t.isAlive());
		// wait for threads to finish
		try {
			System.out.println("Waiting for threads to finish.");
				ob1.t.join();
				ob2.t.join();
				ob3.t.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		System.out.println("Thread One is alive: "+ ob1.t.isAlive());
		System.out.println("Thread Two is alive: "+ ob2.t.isAlive());
		System.out.println("Thread Three is alive: "+ ob3.t.isAlive());

		System.out.println("Main Thread : " + Thread.currentThread());
		System.out.println("Main Thread Priority : " + Thread.currentThread().getPriority());

		System.out.println("Main thread exiting.");
	}
}
