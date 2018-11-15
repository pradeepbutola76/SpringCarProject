import org.springframework.stereotype.Component;

@Component

public class Fuel {
	private int quantity;

	public Fuel() {
		System.out.println("object created");
		quantity = 10;
	}

	public void fuelConsume(int q) {
		// System.out.println("fuel is " + quantity);
		quantity = quantity - q;
	}

	public void consume() {

		System.out.println("fuel is  " + quantity);
	}

}