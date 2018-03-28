package observer;

/**
 * 观察者模式
 */
public class WeatherStation {
    public static void main(String args[]){
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(1,1,1);
    }
}
