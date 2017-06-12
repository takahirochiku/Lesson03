package jp.techacademy.takahiro.chiku.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("ヒロ", 26);

        human.say();
        //Log.d("javatest", "私の名前は" + human.name + "です。");
        //Log.d("javatest", "私の年齢は" + human.age + "歳です。");

        Human human2 = new Human("Androidです");

        human2.think();
        //Log.d("javatest","テスト"+human2.hobby+"です。");
    }
}
