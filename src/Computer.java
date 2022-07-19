
public class Computer {
	
	private Monitor monitor;
	private ComputerCase computerCase;
	private Mainboard mainboard;
	
	public Computer(Monitor monitor, ComputerCase computerCase, Mainboard mainboard) {

		this.monitor = monitor;
		this.computerCase = computerCase;
		this.mainboard = mainboard;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public ComputerCase getComputerCase() {
		return computerCase;
	}

	public void setComputerCase(ComputerCase computerCase) {
		this.computerCase = computerCase;
	}

	public Mainboard getMainboard() {
		return mainboard;
	}

	public void setMainboard(Mainboard mainboard) {
		this.mainboard = mainboard;
	}
}
