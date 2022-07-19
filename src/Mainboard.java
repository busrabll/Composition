
public class Mainboard {
	
	private String model;
	private String manufacturer;
	int numberOfSlots;
	private String operatingSystem;
	
	public Mainboard(String model, String manufacturer, int numberOfSlots, String operatingSystem) {

		this.model = model;
		this.manufacturer = manufacturer;
		this.numberOfSlots = numberOfSlots;
		this.operatingSystem = operatingSystem;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getNumberOfSlots() {
		return numberOfSlots;
	}

	public void setNumberOfSlots(int numberOfSlots) {
		this.numberOfSlots = numberOfSlots;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	
	public void loadOperatingSystem(String operatingSystem) {
		
		this.operatingSystem = operatingSystem;
		System.out.println("Operating system loaded: " + operatingSystem);
		
	}
}
