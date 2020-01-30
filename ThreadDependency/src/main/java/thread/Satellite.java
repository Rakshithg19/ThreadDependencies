package thread;

public class Satellite {
	private int launched;
	private String location;
	public Satellite() {
		System.out.println("invoked satellite"+this.getClass().getSimpleName());
	}
	
	public void setLaunched(int launched) {
		System.out.println("lauched");
		this.launched = launched;
	}
	public void setLocation(String location) {
		System.out.println("location");
		this.location = location;
	}
		public void launch(int time) {
			System.out.println("invoked "+time);
		}

		@Override
		public String toString() {
			return "Satellite [launched=" + launched + ", location=" + location + "]";
		}
	}
	
