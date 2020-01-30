package thread;

public class Labour {
	private String name;
	private int experience;
	private Threadimpl threadimpl;
	
	public Labour(String name) {
		this.name=name;
		System.out.println("created"+name);
		
	}
	public void setExperience(int experience) {
		this.experience = experience;
		System.out.println("created"+experience);
	}
	public void setThreadimpl(Threadimpl threadimpl) {
		this.threadimpl = threadimpl;
		System.out.println("created"+threadimpl);
	}
	public void work() {
		this.threadimpl.start();
		this.threadimpl.run();
	}
}
