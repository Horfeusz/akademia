package pl.atena.edu.lamda;

public class ConcurrentWorker extends Worker {
	
	public void work() {
		Thread t = new Thread(super::work);
		t.start();
	}
	
	public void zrobil() {
		
	}
	
	public static void main(String[] argc) {
		ConcurrentWorker test = new ConcurrentWorker();
		test.work();
	}
	
}
