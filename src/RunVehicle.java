
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;

//@Configuration
public class RunVehicle {
	@Autowired
	private Car car;
	@Autowired
	private Bike bike;
	@Autowired
	private VehcileDao dao;
	public void run() {

		
		 dao.getConnection();
		//System.out.println(bmw);
		car.start();
		car.headlight();
		car.horn();
		car.stop();
		car.showFuel();
		car.toString();
		bike.start();
		bike.headlight();
		bike.horn();
		bike.stop();
		bike.showFuel();

	}
}