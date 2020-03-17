package com.example.mvpdemo1.Presenter;

/**
 * 中间人接口，只要能帮我们买到可乐，能通知我们就行；
 */
public interface MiddlePeople {
    //买可乐；
    void buyCola();

    //购买成功后调用通知我们；
    void buySucceed();
}
