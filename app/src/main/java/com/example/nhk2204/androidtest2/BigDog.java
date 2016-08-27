package com.example.nhk2204.androidtest2;

import android.util.Log;

/**
 * Created by nhk2204 on 2016/08/27.
 */
public class BigDog extends Dog{
    //クラス変数
    static String to_jp="大型犬";

    //コンストラクタ
    public BigDog(String name,int age){
        super(name,age);
    }

    //クラス関数
    public static void introduce(){
        Log.d("javatest","これは大型犬クラスです。");
    }
}
