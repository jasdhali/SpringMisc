package spring.ws;

import java.util.Date;

public class TemperatureInfo {
	
	public String location;
	private Date date;
	private float min;
	private float max;
	private float avg;
	
	public TemperatureInfo() {
	}


	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getMin() {
		return min;
	}

	public void setMin(float min) {
		this.min = min;
	}

	public float getMax() {
		return max;
	}

	public void setMax(float max) {
		this.max = max;
	}

	public float getAvg() {
		return avg;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}


	public TemperatureInfo(String location, Date date, float min, float max,
			float avg) {
		super();
		this.location = location;
		this.date = date;
		this.min = min;
		this.max = max;
		this.avg = avg;
	}

	

	
}
