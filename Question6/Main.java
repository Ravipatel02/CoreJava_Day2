package Question6;

public class Main {
	public static void main(String[] args) {
		Smartphone smart = new Smartphone("mi", "5 inch", "Amazone");
		Tablet tablet = new Tablet("Apple", "7 inch", true);
		HybridDevice obj = new HybridDevice(smart, tablet);
		obj.browseInternet();
		obj.makeCall("8887802799");
	}
}

//Base class
class ElectronicDevice {
	// Common properties and methods for electronic devices
	protected String brand;

	public ElectronicDevice(String brand) {
		this.brand = brand;
	}

	public void turnOn() {
		System.out.println(brand + " electronic device is turned on.");
	}

	public void turnOff() {
		System.out.println(brand + " electronic device is turned off.");
	}
}

//Handheld device extends ElectronicDevice
class HandheldDevice extends ElectronicDevice {
	// Common properties and methods for handheld devices
	protected String screenSize;

	public HandheldDevice(String brand, String screenSize) {
		super(brand);
		this.screenSize = screenSize;
	}

	public void displayScreenInfo() {
		System.out.println("Screen size of " + brand + " handheld device: " + screenSize);
	}
}

//Smartphone extends HandheldDevice
class Smartphone extends HandheldDevice {
	// Smartphone-specific properties and methods
	protected String networkProvider;

	public Smartphone(String brand, String screenSize, String networkProvider) {
		super(brand, screenSize);
		this.networkProvider = networkProvider;
	}

	public void makeCall(String number) {
		System.out.println("Calling " + number + " using " + brand + " smartphone.");
	}
}

//Tablet extends HandheldDevice
class Tablet extends HandheldDevice {
	// Tablet-specific properties and methods
	protected boolean hasCellular;

	public Tablet(String brand, String screenSize, boolean hasCellular) {
		super(brand, screenSize);
		this.hasCellular = hasCellular;
	}

	public void browseInternet() {
		System.out.println("Browsing internet on " + brand + " tablet.");
	}
}

//Interface defining features of a smartphone
interface SmartphoneFeatures {
	void makeCall(String number);
}

//Interface defining features of a tablet
interface TabletFeatures {
	void browseInternet();
}

//HybridDevice implements features from both SmartphoneFeatures and TabletFeatures interfaces
class HybridDevice implements SmartphoneFeatures, TabletFeatures {
	// Implement methods defined in both interfaces
	private Smartphone smartphone;
	private Tablet tablet;

	public HybridDevice(Smartphone smartphone, Tablet tablet) {
		this.smartphone = smartphone;
		this.tablet = tablet;
	}

	@Override
	public void makeCall(String number) {
		smartphone.makeCall(number);
	}

	@Override
	public void browseInternet() {
		tablet.browseInternet();
	}
}
