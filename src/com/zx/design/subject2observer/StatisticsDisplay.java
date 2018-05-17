package com.zx.design.subject2observer;

public class StatisticsDisplay implements IObserver, DisplayElement {

    private int data; // 温度

    /*主题*/
    private ISubject weatherData = null;

    public StatisticsDisplay(ISubject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("data:"+data);
    }

    @Override
    public void update(ISubject iSubject, Object data) {
        this.data = (int) data;
        display();
    }
}
