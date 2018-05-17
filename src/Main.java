import com.zx.design.subject2observer.StatisticsDisplay;
import com.zx.design.subject2observer.WeatherData;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
        observe();
    }

    /*观察者模式*/
    public static void observe() {
        WeatherData weatherData = new WeatherData();
        StatisticsDisplay display = new StatisticsDisplay(weatherData);
        weatherData.setDatas(666);
    }


}
