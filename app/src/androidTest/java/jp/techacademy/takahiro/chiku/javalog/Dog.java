package jp.techacademy.takahiro.chiku.javalog;

/**
 * Created by SEAOS0065 on 2017/06/02.
 */
import android.util.Log;

class Dog {
    String name;
    int age;

    public Dog() {
        name = "";
        age = 0;
    }

    public void say() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "「ワンワン」");
    }
}
