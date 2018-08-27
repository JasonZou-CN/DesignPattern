/**
 * 主题：一对多关系中的'一'方
 * 1.自身会维护一订阅者的集合（Collection）
 * 2.
 */
public interface ISubject {

    /**
     * 注册订阅者
     *
     * @param iObserver
     */
    void registerObserver(IObserver iObserver);

    /**
     * 移除订阅者，该订阅者不再接收通知
     *
     * @param iObserver
     */
    void removeObserver(IObserver iObserver);

    /**
     *
     * 通知订阅者状态更新，订阅者主动'拉'（pull）数据
     */
    void notifyObservers();

    /**
     * 通知订阅者状态更新，主题'推'(push)数据
     *
     * @param data 保存被更新的数据
     */
    void notifyObservers(Object data);

    /**
     * 内部维护一个状态，控制是否通知订阅者
     */
    void setChanged();
}
