package jp.techacademy.takahiro.chiku.javalog;

import android.util.Log;

/**
 * Created by SEAOS0065 on 2017/06/05.
 */

class Human extends Animal implements Thinkable{

    //コンストラクタ
    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    //メンバ関数
    public void say(){
        Log.d("javatest", "「私の名前は" + name + "です。年は" + age + "歳です。」");
    }

    //メンバ変数
    String hobby; //趣味

    //コンストラクタ
    public Human(String hobby){
        this.hobby = hobby;
    }

    @Override
    public void think() {
        Log.d("javatest","私は"+this.hobby+"について考える");
    }
}