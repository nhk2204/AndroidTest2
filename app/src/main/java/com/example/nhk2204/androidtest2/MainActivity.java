package com.example.nhk2204.androidtest2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dog dog=new Dog("ぽんし",13);
        dog.say();
        Log.d("javatest","犬の名前は"+dog.name+"です。");
        Log.d("javatest","犬の年齢は"+String.valueOf(dog.age)+"歳です。");
        Dog.introduce();
        Log.d("javatest",Dog.to_jp+"のクラス変数です。");
        dog.move();

        BigDog dog2=new BigDog("ぽんし二世",11);
        dog2.say();
        Log.d("javatest","犬の名前は"+dog2.name+"です。");
        Log.d("javatest","犬の年齢は"+dog2.age+"歳です。");
        BigDog.introduce();
        Log.d("javatest",BigDog.to_jp+"のクラス変数です。");

        Human human=new Human("たけし",20,"映画");
        human.say();
        human.think();
    }
}
