package chapter10.enumm;

public class SeasonWeather {
	
	public void goodWeather(SeasonInterface SI) {
		SI.sun();
	}
	
	public void badWeather(SeasonInterface SI) {
		SI.rain();
	}

}
