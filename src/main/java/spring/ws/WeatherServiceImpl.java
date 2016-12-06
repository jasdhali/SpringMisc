package spring.ws;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName="WeatherService" ,endpointInterface="spring.ws.WeatherService")
public class WeatherServiceImpl implements WeatherService {

	public WeatherServiceImpl() {
	}

	@WebMethod(operationName="getTemperatures")
	public List<TemperatureInfo> getTemperatures(String loc, List<Date> dates) {
		List<TemperatureInfo> temperatures = new ArrayList<TemperatureInfo>();		
		for( Date date : dates){
			temperatures.add(new TemperatureInfo(loc, date , 5.0f,10.0f,8.0f) );
			//temperatures.add(new TemperatureInfo( date , 5.0f,10.0f,8.0f) );
		}
		return temperatures;
	}
}