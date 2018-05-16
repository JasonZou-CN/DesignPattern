package com.zx.design.subject2observer;

public class StatisticsDisplay implements IObserver, DisplayElement {

    private float temperature; // 温度
    private float humidity; // 湿度
    private ISubject weatherData = null;

    public StatisticsDisplay(ISubject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Statistics: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
