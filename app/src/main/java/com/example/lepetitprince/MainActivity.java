package com.example.lepetitprince;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button btnMorning, btnDay, btnEvening, btnNight;
    private ImageView imgMorning, imgDay, imgEvening, imgNight;
    private ConstraintLayout layoutMorning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMorning = (Button) findViewById(R.id.btnMorning);
        btnDay = (Button) findViewById(R.id.btnDay);
        btnEvening = (Button) findViewById(R.id.btnEvening);
        btnNight = (Button) findViewById(R.id.btnNight);

        imgMorning = (ImageView) findViewById(R.id.imgMorning);
        imgDay = (ImageView) findViewById(R.id.imgDay);
        imgEvening = (ImageView) findViewById(R.id.imgEvening);
        imgNight = (ImageView) findViewById(R.id.imgNight);

        layoutMorning = (androidx.constraintlayout.widget.ConstraintLayout)
                        findViewById(R.id.layoutMorning);
    }

    public void btnMorningClick(View view) {
        layoutMorning.setVisibility(View.VISIBLE);
        imgDay.setVisibility(View.INVISIBLE);
        imgEvening.setVisibility(View.INVISIBLE);
        imgNight.setVisibility(View.INVISIBLE);
    }

    public void btnDayClick(View view) {
        layoutMorning.setVisibility(View.INVISIBLE);
        imgDay.setVisibility(View.VISIBLE);
        imgEvening.setVisibility(View.INVISIBLE);
        imgNight.setVisibility(View.INVISIBLE);
    }

    public void btnEveningClick(View view) {
        layoutMorning.setVisibility(View.INVISIBLE);
        imgDay.setVisibility(View.INVISIBLE);
        imgEvening.setVisibility(View.VISIBLE);
        imgNight.setVisibility(View.INVISIBLE);
    }

    public void btnNightClick(View view) {
        layoutMorning.setVisibility(View.INVISIBLE);
        imgDay.setVisibility(View.INVISIBLE);
        imgEvening.setVisibility(View.INVISIBLE);
        imgNight.setVisibility(View.VISIBLE);
    }
}