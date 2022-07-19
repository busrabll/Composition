
public class Monitor {

	private String model;
	private String manufacturer;
	private String size;
	private Resolution resolution;
	
	public Monitor(String model, String manufacturer, String size, Resolution resolution) {

		this.model = model;
		this.manufacturer = manufacturer;
		this.size = size;
		this.resolution = resolution;
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

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Resolution getResolution() {
		return resolution;
	}

	public void setResolution(Resolution resolution) {
		this.resolution = resolution;
	}
	
	public void turnOffMonitor() {
		
		System.out.println("Monitor turns off");
	}
}
