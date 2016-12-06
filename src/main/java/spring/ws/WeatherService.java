package spring.ws;

import java.util.Date;
import java.util.List;

import javax.jws.WebService;

@WebService
public interface WeatherService {
	public List<TemperatureInfo> getTemperatures(String location,List<Date> dates); 
 }
