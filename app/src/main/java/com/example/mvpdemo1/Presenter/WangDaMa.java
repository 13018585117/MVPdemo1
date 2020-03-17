package com.example.mvpdemo1.Presenter;

import android.util.Log;

import com.example.mvpdemo1.Model.HanHan;
import com.example.mvpdemo1.Model.ToolPeople;
import com.example.mvpdemo1.View.Me;

public class WangDaMa implements MiddlePeople {
    Me me;
    ToolPeople toolPeople;

    /**
     * @param me
     *
     * 保存“我”的联系方法，并且派出HanHan为工作人，保存他的联系方式；
     */
    public WangDaMa(Me me){
        this.me = me;
        toolPeople = new HanHan(this);
    }
    @Override
    public void buyCola() {
        Log.e("MiddlePeople","我来帮你买可乐");
        //通知生产人生产可乐；
        toolPeople.produceCola();
    }

    @Override
    public void buySucceed() {
//        买成了，通知我可以开始喝可乐了；
        me.drinkCola();
    }
}
