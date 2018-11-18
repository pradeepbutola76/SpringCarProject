
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
//import org.springframework.context.annotation.Configuration;

public class MainExample {

	@Bean
	public Car createCar() {
		return new Car();
	}

	@Bean
	public RunVehicle runvehicle() {
		return new RunVehicle();
	}

	@Bean
	public Bike createBike() {
		return new Bike();
	}

	@Bean
	public Fuel createFuel() {
		return new Fuel();
	}

	@Bean
	public VehcileDao createDao() {
		return new VehcileDao();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainExample.class);
		RunVehicle vehicle = context.getBean(RunVehicle.class);
		vehicle.run();
	}

}