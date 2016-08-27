package com.example.nhk2204.androidtest2;

/**
 * Created by nhk2204 on 2016/08/27.
 */
abstract class Animal {
    //メンバ変数
    String name;
    int age;

    //コンストラクタ
    public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }

    abstract public void say();
}
