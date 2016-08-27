package com.example.nhk2204.androidtest2;

import android.util.Log;

/**
 * Created by nhk2204 on 2016/08/27.
 */
public class Human extends Animal implements Thinkable{
    //クラス変数
    static String to_jp="人間";

    //メンバ変数
    public String hobby;
    //コンストラクタ
    public Human(String name,int age,String hobby){
        super(name,age);
        this.hobby=hobby;
    }

    @Override
    public void say() {
        Log.d("javatest2","私の名前は"+this.name+"です。年は"+this.age+"歳です。");
    }

    @Override
    public void think() {
        Log.d("javatest2","私は"+this.hobby+"について考える。");
    }
}
