package com.example.edunachal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
    }
    public void  upsc(View view)
    {
        Intent intent=new Intent(MainActivity2.this, UPSC_01.class);
        startActivity(intent);
    }    public void  app(View view)
    {
        Intent intent=new Intent(MainActivity2.this, APPSC_01.class);
        startActivity(intent);
    }    public void  appsb(View view)
    {
        Intent intent=new Intent(MainActivity2.this, APPSC01.class);
        startActivity(intent);
    }

}