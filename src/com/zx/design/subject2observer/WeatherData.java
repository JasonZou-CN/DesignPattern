package com.zx.design.subject2observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements ISubject {

    private List IObservers = null; // 观察者列表

    private float temperature; // 温度
    private float humidity; // 湿度
    private float pressure; // 气压

    public WeatherData() {
        IObservers = new ArrayList();
    }

    @Override
    public void registerObserver(IObserver o) {
        IObservers.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        int i = IObservers.indexOf(o);
        if (i >= 0) {
            IObservers.remove(i);
        }
    }

    /**
     * 更新通知所有的观察者
     */
    @Override
    public void notifyObservers() {
        for (int i = 0; i < IObservers.size(); i++) {
            IObserver IObserver = (IObserver) IObservers.get(i);
            IObserver.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    /**数据源变动
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}