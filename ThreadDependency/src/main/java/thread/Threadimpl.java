package thread;

public class Threadimpl extends Thread{
	@Override
	public void run() {
System.out.println("running");
		
	}
	public void start() {
		System.out.println("invoked start");
	}
}