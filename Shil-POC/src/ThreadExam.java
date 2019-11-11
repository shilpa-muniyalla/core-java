
//example for thread
/*public class ThreadExam extends Thread {

	
	public void run() {
		System.out.println("Thread is running");
	}
	public static void main(String[] args) {
		ThreadExam thread1 = new ThreadExam();
		thread1.start();

	}

}*/

public class ThreadExam implements Runnable{
	
	public void run() {
		System.out.println("Thread is running");
	}
	
	public static void main(String[] args) {
		ThreadExam thread1= new ThreadExam();
		Thread t1 = new Thread(thread1);
		System.out.println(t1.getName());
		t1.setName("shilpa");
		System.out.println(t1.getName());
		t1.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t1.getPriority());
		t1.start();
				
	}
	
}
