import com.zx.design.subject2observer.StatisticsDisplay;
import com.zx.design.subject2observer.WeatherData;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");

        /*观察者模式*/
        WeatherData weatherData = new WeatherData();
        StatisticsDisplay display = new StatisticsDisplay(weatherData);
        weatherData.setMeasurements(80,60,30.4f);
        weatherData.setMeasurements(82,70,27.4f);
        weatherData.setMeasurements(54,40,36.4f);
    }
}
