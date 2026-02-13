package learn.design;

import learn.design.entity.CurrentConditionsDisplay;
import learn.design.entity.WeatherData;

public class WeatherStation {
	
	public static void main(String[] args) {
		
		var weatherData = new WeatherData();
		
		var current = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(20, 20, 20);
		
		weatherData.setMeasurements(30, 40, 50);
	}
}
