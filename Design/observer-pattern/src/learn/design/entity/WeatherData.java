package learn.design.entity;

import java.util.ArrayList;
import java.util.List;

import learn.design.client.Subject;
import learn.design.client.Observer;

public class WeatherData implements Subject{
	
	private List<Observer> observers;
	private float temperature;
	private float humandity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
		
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
		
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(temperature, humandity, pressure);
		}
	}
	
	private void measurementChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humandity, float presurre) {
		this.temperature = temperature;
		this.humandity = humandity;
		this.pressure = presurre;
		measurementChanged();
	}

}
