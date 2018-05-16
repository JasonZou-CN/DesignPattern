package com.zx.design.subject2observer;

public interface IObserver {
    public void update(float temperature, float humidity, float pressure);
}
