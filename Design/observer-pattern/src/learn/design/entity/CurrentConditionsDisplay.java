package learn.design.entity;

import learn.design.client.Display;
import learn.design.client.Observer;

public class CurrentConditionsDisplay implements Observer, Display {
	
	private float temperature;
	private float humandity;
	private float pressure;
	private WeatherData weatherData;
	
	public CurrentConditionsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temperature, float humandity, float pressure) {
		this.temperature = temperature;
		this.humandity = humandity;
		this.pressure = pressure;
		display();
	}


	@Override
	public void display() {
		System.out.println("Current Condition :: " + pressure + " N/m2  and " + humandity + "% humanidy and " + temperature + " F degree.");
	}
	
	public void removeObserver(WeatherData weatherData) {
		weatherData.removeObserver(this);
	}

	
}
