package com.example.log_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String hong = "로그만들기";
        Log.e("MainActivity : ",hong);//보통 액티비티내용을 적는다.
        //로그캣에서 에러를 클릭하면 볼수있다.
        //주로 Log.e Log.d를 사용한다.
        int a =10;
        Log.e("MainActivity : ", String.valueOf(a));
        //int형은 알트+엔터로 저렇게 바꿀 수 있다.
    }
}