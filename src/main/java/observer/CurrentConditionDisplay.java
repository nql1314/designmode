package observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer {

    public CurrentConditionDisplay(WeatherData observable) {
        super();
        observable.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        WeatherData weatherData = (WeatherData)arg;
        System.out.println(weatherData.toString());
    }
}
