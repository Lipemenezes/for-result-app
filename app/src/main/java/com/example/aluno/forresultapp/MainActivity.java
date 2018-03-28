package com.example.aluno.forresultapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.initViews();
    }

    public void openDiscipline(View v) {

    }

    public void openTest(View v) {
        if (v.getTag().toString().equals("1")) {
            
        }
    }

    public void sendData(View v) {

    }

    public void close(View v) {
        this.finish();
    }

    private void initViews() {

    }
}
