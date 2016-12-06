import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.apress.springrecipes.vehicle.Vehicle;
import com.apress.springrecipes.vehicle.VehicleDao;
import static java.lang.System.out;

public class SpringDAOClient {

	

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/SpringDAOConfig.xml");
		// loading the definitions from the given XML file
		VehicleDao vehicleDao = (VehicleDao) context.getBean("vehicleDao");
		Vehicle vehicle = new Vehicle("a","b",2,2);
		vehicleDao.insert(vehicle);
		out.println("Program exiting....");
	}
}
