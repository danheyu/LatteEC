package com.danheyu.fastec.example;

import android.app.Application;
import com.core.example.app.Latte;

public class ExampleApp extends Application {

    @Override
    public void onCreate(){
        super.onCreate();
        Latte .init(this)
                .withApiHost("Http://127.0.0.1")
                .configure();

    }
}
