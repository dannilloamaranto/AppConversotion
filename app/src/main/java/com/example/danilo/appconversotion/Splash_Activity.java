package com.example.danilo.appconversotion;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Handler splash = new Handler();
        splash.postDelayed(new Runnable() {
            @Override
            public void run() {
                mostrar_Activity();
            }
        },4000);
    }
    private void mostrar_Activity(){
        Intent newintent = new Intent(
        Splash_Activity.this,MainActivity.class);
        startActivity(newintent);
        finish();

    }
}
