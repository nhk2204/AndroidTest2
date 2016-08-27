package com.example.nhk2204.androidtest2;

import android.util.Log;

/**
 * Created by nhk2204 on 2016/08/27.
 */
class Dog extends Animal implements Movable{
    //クラス変数
    static String to_jp="犬";

    //コンストラクタ
    public Dog(String name,int age){
        super(name,age);
        //this.name=name;
        //this.age=age;
    }

    //クラス関数
    public static void introduce(){
        Log.d("javatest","これは犬クラスです。");
    }
    //メンバ関数
    public void say(){
        Log.d("javatest",this.name+"("+this.age+"歳)「わんわんお」");
    }

    @Override
    public void move() {
        Log.d("javatest",this.name +"("+this.age+"歳)は全力で走った。");
    }
}
