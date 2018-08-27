import java.util.ArrayList;
import java.util.List;

public class WeatherData implements ISubject {

    private List<IObserver> observers = null; // 观察者列表
    private boolean changed = false;

    private int data; // 温度

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(IObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        observers.remove(o);
    }

    /**
     * 通知订阅者拉取数据
     */
    @Override
    public void notifyObservers() {
        notifyObservers(null);
    }

    /**
     * @param data 保存被更新的数据
     */
    @Override
    public void notifyObservers(Object data) {
        if (!changed) {
            return;
        }
        for (int i = 0; i < observers.size(); i++) {
            IObserver observer = (IObserver) observers.get(i);
            observer.update(this, data);
        }
        changed = false;
    }

    /**
     * 数据更改，允许通知订阅者,细粒度控制
     */
    @Override
    public void setChanged() {
        this.changed = true;
    }


    /**
     * 数据源变动
     */
    public void setDatas(int data) {
        this.data = data;
        setChanged();
        notifyObservers(data);
    }
}