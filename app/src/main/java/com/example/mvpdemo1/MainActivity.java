package com.example.mvpdemo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.mvpdemo1.Presenter.MiddlePeople;
import com.example.mvpdemo1.Presenter.WangDaMa;
import com.example.mvpdemo1.View.Me;

public class MainActivity extends AppCompatActivity implements Me {

    private MiddlePeople middlePeople = new WangDaMa(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
//        让中间人帮我买可乐；
        middlePeople.buyCola();
    }

    @Override
    public void drinkCola() {
        //拿到可乐了；
        Log.e("Me","肥仔水真好喝");
        Toast.makeText(this, "肥仔水真好喝——牛逼", Toast.LENGTH_SHORT).show();
    }
}
