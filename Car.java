
public class Car {
	String model;
	double maxSpeed;
	double currentSpeed;
	String color;
	int currentGear;
	Person owner;
	double price;
	boolean isSportCar;

	Car() {

	}

	Car(String model, boolean isSportCar, String color) {
		if (model == null) {
			this.model = "No model";
		} else
			this.model = model;

		if (color == null) {
			this.color = "white";
		} else {
			this.color = color;
		}
		this.isSportCar = isSportCar;
		maxSpeed = 0.0;
		currentGear = 0;
		currentSpeed = 0.0;
		price = 0.0;
	}

	void accelerate() {
		if (maxSpeed >= (currentSpeed * 2)) {
			this.currentSpeed = currentSpeed * 2;
		} else {
			currentSpeed = maxSpeed;
		}
	}

	void changeGearUp() {
		if (currentGear >= -1 && currentGear < 6) {
			currentGear++;
		}
	}

	void changeGearDown() {
		if (currentGear > -1 && currentGear <= 6) {
			currentGear--;
		}
	}

	void changeGear(int nextGear) {
		if (nextGear >= -1 && nextGear <= 6) {
			currentGear = nextGear;
		}
	}

	void changeColor(String newColor) {
		if (newColor != null && newColor == "") {
			color = newColor;
		}
	}
}
