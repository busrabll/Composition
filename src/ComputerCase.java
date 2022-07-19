
public class ComputerCase {
	
	private String model;
	private String manufacturer;
	private String material;
	
	public ComputerCase(String model, String manufacturer, String material) {

		this.model = model;
		this.manufacturer = manufacturer;
		this.material = material;
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

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	public void turnOnComputer() {
		
		System.out.println("Computer turns on");
	}
}
