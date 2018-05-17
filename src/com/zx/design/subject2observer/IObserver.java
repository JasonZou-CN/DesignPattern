package com.zx.design.subject2observer;

/**一对多关系中的'多'方
 * 1.持有主题的引用，
 */
public interface IObserver {
    /**数据更新通知，
     * @param iSubject 订阅的主题
     * @param data 主题的'推送'(push)数据
     */
    void update(ISubject iSubject, Object data);


}
