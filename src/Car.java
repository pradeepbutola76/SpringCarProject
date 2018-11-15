import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
	@Autowired
	private Fuel fuel;
   
	private String type;
	private int noWheel;
	private int seat;
	private String fuelType;
	private int fuelCapacity;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNoWheel() {
		return noWheel;
	}

	public void setNoWheel(int noWheel) {
		this.noWheel = noWheel;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public void headlight() {
		System.out.println("headlight on");
	}

	public void start() {

		System.out.println("car started");
		fuel.consume();
	}

	public void horn() {
		System.out.println("car horn");
	}

	public void stop() {
		fuel.fuelConsume(2);
		// fuel.Fuel(2);
		System.out.println("car stoped now ");
	}

	public void accelerator() {

	}

	public void showFuel() {
		fuel.consume();
	}
        public void changeDone()
       {
          System.out.println("change in");

       }


		
       public void githubchanges(){
         System.out.println("Github changes");
       }

}
