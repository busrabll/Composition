
public class Main {

	public static void main(String[] args) {
		
		Resolution resolution = new Resolution(1920, 1080);
		
		Monitor monitor = new Monitor("VS197DE", "Asus", "18.5", resolution);
		
		ComputerCase computerCase = new ComputerCase("Shadow Blade", "Shadow", "Temperli Cam");
		
		Mainboard mainboard = new Mainboard("B250-PRO", "Asus", 10, "Windows 10");
		
		Computer pc = new Computer(monitor, computerCase, mainboard);
		
		pc.getComputerCase().turnOnComputer();
		
		pc.getMonitor().turnOffMonitor();
		
		pc.getMainboard().loadOperatingSystem("Ubuntu 16.04");
	}
}