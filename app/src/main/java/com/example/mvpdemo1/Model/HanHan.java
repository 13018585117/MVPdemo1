package com.example.mvpdemo1.Model;

import android.util.Log;

import com.example.mvpdemo1.Model.ToolPeople;
import com.example.mvpdemo1.Presenter.MiddlePeople;

public class HanHan implements ToolPeople {
    MiddlePeople middlePeople;
    public HanHan(MiddlePeople middlePeople){
        //生产出来，要通知中间人;
        this.middlePeople = middlePeople;
    }
    @Override
    public void produceCola() {
        //生产可乐；
        Log.e("HanHan","可乐生产出来啦");

        //通知中间人；
        middlePeople.buySucceed();
    }

}
